package projet;

public class Base {
	
	private static Base INSTANCE = null;
	
	public final Coordinate POSITION = new Coordinate(5,5);

	
	public Robot[] robots;
	public Robot[] storedRobots;
	public Fire[] knownFires;
	public Robot[] explorationRobots;
	public String[] explorationRobotsSides = new String[]{"center", "left", "right"};
	public int nbPeopleSaved = 0;
	
	
	private Base(int nbRobots, int nbExplorationRobots) {
		this.explorationRobots = new Robot[nbExplorationRobots];
		this.robots = new Robot[nbRobots - nbExplorationRobots];
		this.knownFires = new Fire[0];
		this.storedRobots = new Robot[nbRobots - nbExplorationRobots];

		Grid grid = Grid.getInstance();
		for (int i = 0; i < nbExplorationRobots; i++){
			this.explorationRobots[i] = new Robot("e" + i, POSITION);
			grid.coordinates[POSITION.x][POSITION.y].addRobot(this.explorationRobots[i].name);
		}
		for (int i = 0; i < nbRobots - nbExplorationRobots ; i++){
			this.robots[i] = new Robot("r" + i, POSITION);
			this.storedRobots[i] = this.robots[i];
			grid.coordinates[POSITION.x][POSITION.y].addRobot(this.robots[i].name);
		}
	}

	public static Base getInstance(int nbRobots, int nbExplorationRobots) {
		if (INSTANCE == null) {
			return new Base(nbRobots, nbExplorationRobots);
		}
		return INSTANCE;
	}

	public static Base getInstance() {
		if(INSTANCE == null){
			getInstance(7, 3);
		}
		return INSTANCE;
	}
	
	
	public void next() {
		// envoi des robots d'exploration
		if(this.explorationRobots.length > 0 && explorationRobots[0].battery == 30) {
			this.turnExplorationRobotsSides();
			for(int i = 0; i<this.explorationRobots.length; i++) {
				this.explorationRobots[i].setActionSequence(this.getActionSequenceForExplore(this.explorationRobotsSides[i]));
			}
		}
		// envoi des robots
		if(this.knownFires.length > 1) {
			this.sortFires();
		}
		if(this.storedRobots.length > 1) {
			this.sortStoredRobots();
		}
		for(int i = 0; i < this.knownFires.length; i++) {
			for(int j = 0; j < this.storedRobots.length; j++) {
				if(this.knownFires[i].fireQuantity > 0) {	
					this.knownFires[i].decrementation();
					this.removeRobotFromStorage(this.storedRobots[j]);
				}
			}
		}
		// next des robots
		for(int i = 0; i<this.robots.length; i++) {
			boolean isBackHome = this.robots[i].next();
			if(isBackHome) {
				this.addRobotOnStorage(this.robots[i]);
			}
		}
	}

	public void savePeople(int nbPeople){
		Grid.getInstance().coordinates[POSITION.x][POSITION.y].addPeople(nbPeople);;
		this.nbPeopleSaved += nbPeople;
	}
	
	public void addFire(Coordinate position) {
		//TODO: ajouter le nombre de personnes
		for(int i = 0; i<this.knownFires.length; i++) {
			if (this.knownFires[i].position.sameCoordinate(position)) {
				return;
			}
		}
		Fire[] newArray = new Fire[this.knownFires.length +1];
		for(int i = 0; i<this.knownFires.length; i++) {
			newArray[i] = this.knownFires[i];
		}
		newArray[newArray.length-1] = new Fire(position);
		this.knownFires = newArray;
	}

	private void addRobotOnStorage(Robot robot) {
		Robot[] newArray = new Robot[this.storedRobots.length +1];
		for (int i = 0; i < this.storedRobots.length; i++) {
			newArray[i] = this.storedRobots[i];
		}
		newArray[this.storedRobots.length] = robot;
		this.storedRobots = newArray;
	}
	
	private void removeRobotFromStorage(Robot robot) {
		Robot[] newArray = new Robot[this.storedRobots.length -1];
		int cpt = 0;
		for (int i = 0; i < this.storedRobots.length; i++) {
			if(robot.name != this.storedRobots[i].name) {
				newArray[cpt] = this.storedRobots[i];
				cpt++;
			}
		}
		this.storedRobots = newArray;
	}
	
	/**
	 * on trie par distance: les feux les plus loins seront eteints en premier ce qui permet d'explorer la zone en meme temps
	 */
	private void sortFires() {
		//TODO sort en fonction des personnes
		for (int i = 0; i < this.knownFires.length; i++){  
			for (int j = i + 1; j < this.knownFires.length; j++){  
				Fire tmp = null;  
				if (
					Grid.getDistance(POSITION, this.knownFires[i].position) > Grid.getDistance(POSITION, this.knownFires[j].position)
				){  
					tmp = this.knownFires[i];  
					this.knownFires[i] = this.knownFires[j];  
					this.knownFires[j] = tmp;  
				}  
			}
		}
	}
	
	private void sortStoredRobots() {
		for (int i = 0; i < this.storedRobots.length; i++){
			for (int j = i + 1; j < this.storedRobots.length; j++){
				Robot tmp = null;
				if (
					this.storedRobots[i].battery > this.storedRobots[j].battery
				){  
					tmp = this.storedRobots[i];
					this.storedRobots[i] = this.storedRobots[j];
					this.storedRobots[j] = tmp;
				}  
			}
		}
	}

	private void turnExplorationRobotsSides() {
		String temp = this.explorationRobotsSides[0];
		this.explorationRobotsSides[0] = this.explorationRobotsSides[1];
		this.explorationRobotsSides[1] = this.explorationRobotsSides[2];
		this.explorationRobotsSides[2] = temp;
	}
	
	private Action[] getActionSequenceForExplore(String side) {
		Action[] actionSequence = new Action[25];
		Coordinate lastPosition = POSITION;
		if(side == "center") {
			actionSequence[0] = new Action("move", new Coordinate(POSITION.x, POSITION.y+1));
			lastPosition = new Coordinate(POSITION.x, POSITION.y+2);
			actionSequence[0] = new Action("move", lastPosition);
			for(int i=2; i<5; i++) {
				lastPosition = new Coordinate(lastPosition.x+1, lastPosition.y);
				actionSequence[i] = new Action("move", lastPosition);
			}
			for(int i=4; i<9; i++) {
				lastPosition = new Coordinate(lastPosition.x, lastPosition.y-1);
				actionSequence[i] = new Action("move", lastPosition);
			}
			for(int i=8; i<15; i++) {
				lastPosition = new Coordinate(lastPosition.x-1, lastPosition.y);
				actionSequence[i] = new Action("move", lastPosition);
			}
			for(int i=15; i<20; i++) {
				lastPosition = new Coordinate(lastPosition.x, lastPosition.y+1);
				actionSequence[i] = new Action("move", lastPosition);
			}
			for(int i=20; i<23; i++) {
				lastPosition = new Coordinate(lastPosition.x+1, lastPosition.y);
				actionSequence[i] = new Action("move", lastPosition);
			}
			actionSequence[23] = new Action("move", new Coordinate(lastPosition.x, lastPosition.y-1));
			actionSequence[24] = new Action("move", POSITION);
		}else{
			int factor = 1;
			if(side == "left") {
				factor = -1;
			}
			for(int i=0; i<4; i++) {
				lastPosition = new Coordinate(lastPosition.x, lastPosition.y + 1);
				actionSequence[i] = new Action("move", lastPosition);
			}
			for(int i = 4; i<8; i++) {
				lastPosition = new Coordinate(lastPosition.x + factor, lastPosition.y);
				actionSequence[i] = new Action("move", lastPosition);
			}
			for(int i = 8; i<16; i++) {
				lastPosition = new Coordinate(lastPosition.x, lastPosition.y - 1);
				actionSequence[i] = new Action("move", lastPosition);
			}
			for(int i = 16; i<20; i++) {
				lastPosition = new Coordinate(lastPosition.x - factor, lastPosition.y);
				actionSequence[i] = new Action("move", lastPosition);
			}
			for(int i=20; i<24; i++) {
				lastPosition = new Coordinate(lastPosition.x, lastPosition.y + 1);
				actionSequence[i] = new Action("move", lastPosition);
			}
		}
		return actionSequence;
	}
	
	
	
	
}
