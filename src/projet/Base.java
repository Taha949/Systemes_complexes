package projet;

import java.util.Arrays;

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
			INSTANCE = new Base(nbRobots, nbExplorationRobots);
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
					int effectiveDecrementedFire = this.storedRobots[j].CreateActionSequence(this.knownFires[i]);
					this.knownFires[i].virtualDecrementation(effectiveDecrementedFire);
					if(effectiveDecrementedFire > 0){
						this.removeRobotFromStorage(this.storedRobots[j]);
					}
					if(this.knownFires[i].fireQuantity == 0) {
						this.removeFire(this.knownFires[i]);
						break;
					}
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
		for(int i = 0; i<this.explorationRobots.length; i++) {
			this.explorationRobots[i].next();
		}
	}

	public void savePeople(int nbPeople){
		Grid.getInstance().coordinates[POSITION.x][POSITION.y].addPeople(nbPeople);;
		this.nbPeopleSaved += nbPeople;
	}

	public void addFire(Fire fire) {
		for(int i = 0; i<this.knownFires.length; i++) {
			if (this.knownFires[i].position.sameCoordinate(fire.position)) {
				return;
			}
		}
		Fire[] newArray = new Fire[this.knownFires.length +1];
		for(int i = 0; i<this.knownFires.length; i++) {
			newArray[i] = this.knownFires[i];
		}
		newArray[newArray.length-1] = WildFires.getInstance().newVirtualFire(fire.position);
		this.knownFires = newArray;
	}

	public void removeFire(Fire fire) {
		Fire[] newArray = new Fire[this.knownFires.length -1];
		int cpt = 0;
		for(int i = 0; i<this.knownFires.length; i++) {
			if (!this.knownFires[i].position.sameCoordinate(fire.position)) {
				newArray[cpt] = this.knownFires[i];
				cpt++;
			}
		}
		this.knownFires = newArray;
	}

	private void addRobotOnStorage(Robot robot) {
		Robot[] newArray = Arrays.copyOf(this.storedRobots, this.storedRobots.length + 1);
		newArray[this.storedRobots.length] = robot;
		this.storedRobots = newArray;
		System.out.println("added robot " + robot.name + ", storage length : " + this.storedRobots.length);
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
		System.out.println("removed robot " + robot.name + ", storage length : " + this.storedRobots.length);

	}

	/**
	 * on trie par distance: les feux les plus loins seront eteints en premier ce qui permet d'explorer la zone en meme temps
	 */
	private void sortFires() {
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
		for (int i = 0; i < this.knownFires.length; i++){  
			for (int j = i + 1; j < this.knownFires.length; j++){  
				Fire tmp = null;  
				if (
					this.knownFires[i].nbPeople < this.knownFires[j].nbPeople
				){
					tmp = this.knownFires[i];  
					this.knownFires[i] = this.knownFires[j];  
					this.knownFires[j] = tmp;  
				}
			}
		}
	}

	public int getUnsavedPeopleCount() {
	    int count = 0;
	    Coordinate[][] coordinates = Grid.getInstance().coordinates;

	    for (int i = 0; i < coordinates.length; i++) {
	        for (int j = 0; j < coordinates[i].length; j++) {
	            Coordinate currentCoordinate = coordinates[i][j];

	            // Vérifier si la case contient des personnes non sauvées
	            if (!currentCoordinate.isBase && currentCoordinate.nbPeople > 0 && currentCoordinate.TimeBeforeDead <= 0) {
	                count += currentCoordinate.nbPeople;
	            }
	        }
	    }

	    return count;
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
		Action[] actionSequence = new Action[24];
		Coordinate lastPosition = POSITION;
		if(side.equals("center")) {
			lastPosition = new Coordinate(lastPosition.x, lastPosition.y+1);
			actionSequence[0] = new Action("move", lastPosition);
			lastPosition = new Coordinate(lastPosition.x, lastPosition.y+1);
			actionSequence[1] = new Action("move", lastPosition);

			for(int i=2; i<5; i++) {
				lastPosition = new Coordinate(lastPosition.x+1, lastPosition.y);
				actionSequence[i] = new Action("move", lastPosition);
			}
			for(int i=5; i<9; i++) {
				lastPosition = new Coordinate(lastPosition.x, lastPosition.y-1);
				actionSequence[i] = new Action("move", lastPosition);
			}
			for(int i=9; i<15; i++) {
				lastPosition = new Coordinate(lastPosition.x-1, lastPosition.y);
				actionSequence[i] = new Action("move", lastPosition);
			}
			for(int i=15; i<19; i++) {
				lastPosition = new Coordinate(lastPosition.x, lastPosition.y+1);
				actionSequence[i] = new Action("move", lastPosition);
			}
			for(int i=19; i<22; i++) {
				lastPosition = new Coordinate(lastPosition.x+1, lastPosition.y);
				actionSequence[i] = new Action("move", lastPosition);
			}
			actionSequence[22] = new Action("move", new Coordinate(lastPosition.x, lastPosition.y-1));
			actionSequence[23] = new Action("move", POSITION);
		}else{
			int factor = 1;
			if(side.equals("left")) {
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
