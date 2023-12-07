package projet;

public class Robot {

	
	public int battery = 30;
	public int water = 20;
	public Coordinate position;
	public String name;
	private Action[] actionSequence;
	
	public Robot(String robotName, Coordinate position) {
		this.name = robotName;
		this.position = position;
		this.actionSequence = new Action[0];
	}
	
	/**
	 * 
	 * @param destination
	 * @param fireToDecrement
	 * @return le nombre de deciseconde que le robot aura enlevé au feu une fois son parcours terminé
	 */
	public int CreateActionSequence(Fire fire) {
		Coordinate destination = fire.position;
		int fireToDecrement = fire.fireQuantity;
		Coordinate[] path = Grid.getInstance().getPath(this.position, destination);
		int pathLength = path.length;
		int effectiveDecrementedFire = Math.min(this.battery - pathLength * 2, fireToDecrement);
		int actionSequenceLenght = pathLength * 2 + effectiveDecrementedFire;
		this.actionSequence = new Action[actionSequenceLenght];
		for(int i = 0; i<actionSequenceLenght; i++){
			if(i<pathLength) {
				this.actionSequence[i] = new Action("move", path[i]);//aller
			} else if(i < pathLength + effectiveDecrementedFire) {
				this.actionSequence[i] = new Action("putOut", destination);//eteindre
			} else {
				this.actionSequence[i] = new Action("move", path[pathLength - i -1]);//retour
			}
		}
		return effectiveDecrementedFire;
	}
	
	public boolean next() {
		System.out.println(this.name + " : b" + this.battery + " x" + this.position.x + " y" + this.position.y + " al"+ this.actionSequence.length);
		if(this.actionSequence.length != 0) {
			//reduit la batterie
			this.battery--;
			// unshift l'action
			System.out.println("ancien: " + this.actionSequence.length);
			System.out.println(this.actionSequence[this.actionSequence.length - 1].actionType);
			Action action = this.actionSequence[0];
			Action[] newActionSequence = new Action[this.actionSequence.length -1];
			for(int i=0; i<newActionSequence.length; i++) {
				newActionSequence[i] = this.actionSequence[i+1];
			}
			this.actionSequence = newActionSequence;
			System.out.println("nouveau: " + this.actionSequence.length);

			Grid grid = Grid.getInstance();
			Base base = Base.getInstance();
			//sauve les personnes si il y a le feu
			Coordinate actualPosition = grid.coordinates[this.position.x][this.position.y];
			if (!actualPosition.isBase && actualPosition.isFire && actualPosition.TimeBeforeDead>0){
				base.savePeople(actualPosition.nbPeople);
				actualPosition.savePeople();
			}
			// regarde les voisins
			Coordinate[] neighbors = grid.getNeighbors(this.position);
			for (int i = 0; i < neighbors.length; i++) {
				if(neighbors[i].isFire) {
					base.addFire(WildFires.getInstance().getFire(neighbors[i]));
				}
			}
			//execution de l'action
			if(action.actionType == "move") {
				grid.moveRobot(this.name,  this.position,  action.coordinate);
				this.position = action.coordinate;
			}else {
				WildFires.getInstance().decrementFireAt(action.coordinate);
			}
			if(this.actionSequence.length == 0) {
				//le robot est de retour
				return true;
			}
		}else {
			//le robot est dans la base
			if(this.battery != 30) {
				this.battery++;
			}
			if(this.water != 20) {
				this.water++;
			}
		}
		return false;
	}
	
	public void setActionSequence(Action[] actionSequence) {
		this.actionSequence = actionSequence;
		System.out.println("al: " + this.actionSequence.length + " " + this.actionSequence[actionSequence.length -1].actionType);
	}
}
