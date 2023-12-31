package projet;

public class Fire {

   public Coordinate position;
    public int fireQuantity; // le nombre de deci-seconde qu'il faut pour éteindre le feu
    public int timeBeforePropagation;
    public int nbPeople;
    private int maxFireQuantity;
    private int maxTimeBeforePropagation;

    public Fire(Coordinate position, int fireQuantity, int timeBeforePropagation) {
        this.position = position;
        this.nbPeople = position.nbPeople;
        this.fireQuantity = fireQuantity;
        this.timeBeforePropagation = timeBeforePropagation;
        this.maxFireQuantity = fireQuantity;
        this.maxTimeBeforePropagation = timeBeforePropagation;
    }

    public void next() {
        // Logique pour le déroulement du feu à chaque itération (à faire)
        if (this.fireQuantity > 0) {
            // Éventuellement propagation
            if (this.timeBeforePropagation == 0) {
                this.propagation();
                this.timeBeforePropagation = 50; // Exemple de délai avant la prochaine propagation
            } else {
                this.timeBeforePropagation--;
            }
            this.killPeople();
        }
    }

    public void propagation() {

    	Coordinate[] neighbors = Grid.getInstance().getNeighbors(position);

        for (Coordinate neighbor : neighbors) {
            int probability = (int) Math.floor(Math.random() * 100);
            if (probability < 33) {
                neighbor.isFire = true;
                WildFires.getInstance().addFire(new Fire(neighbor, this.maxFireQuantity, this.maxTimeBeforePropagation));
            }
        }
    }

    public void virtualDecrementation(int fireQuantity) {
        this.fireQuantity-= fireQuantity;
    }

     public void decrementation() {
        this.fireQuantity--;
        if(this.fireQuantity <= 0){
            this.position.isFire = false;
        }
    }

    public Coordinate getPosition() {
        return position;
    }

    public void killPeople() {
        Grid.getInstance().coordinates[position.x][position.y].decrementTimeBeforeDead();
    }
}