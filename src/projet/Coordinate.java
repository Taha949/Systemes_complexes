package projet;

public class Coordinate {

	public int x;
	public int y;

	public boolean isBase = false;
	public boolean isFire = false;
	public int nbPeople;
	public int TimeBeforeDead = 50;

	public String[] robots = new String[0];

	public Coordinate(int x, int y) {
		if (x < 0 || x > 11 || y < 0 || y > 11) {
			throw new IllegalArgumentException("les coordonées doivent être entre 0 et 11");
		}
		this.x = x;
		this.y = y;
		this.nbPeople = (int) Math.floor(Math.random() * 10);
	}

	public boolean sameCoordinate(Coordinate c) {
		if (this.x == c.x && this.y == c.y) {
			return true;
		}
		return false;
	}

	public void addRobot(String robotName) {
		String[] newArray = new String[this.robots.length + 1];
		for (int i = 0; i < this.robots.length; i++) {
			newArray[i] = this.robots[i];
		}
		newArray[newArray.length - 1] = robotName;
		this.robots = newArray;
	}

	public void removeRobot(String robotName) {
		String[] newArray = new String[this.robots.length - 1];
		for (int i = 0; i < this.robots.length; i++) {
			if (this.robots[i] != robotName) {
				newArray[i] = this.robots[i];
			}
		}
		this.robots = newArray;
	}

	public void decrementTimeBeforeDead() {
		this.TimeBeforeDead--;
	}

	public void savePeople() {
		this.nbPeople = 0;
		this.TimeBeforeDead = -1;
	}

	public void addPeople(int nbPeople) {
		this.nbPeople += nbPeople;
	}
}
