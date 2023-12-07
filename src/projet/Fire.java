package projet;

public class Fire {

   public Coordinate position;
    public int fireQuantity; // le nombre de deci-seconde qu'il faut pour éteindre le feu
    public int timeBeforePropagation;
    public int nbPeople;

    public Fire(Coordinate position) {
        this.position = position;
        this.nbPeople = position.nbPeople;
        this.fireQuantity = 10;
        this.timeBeforePropagation = 50;
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

            // Décrémentation de la quantité de feu
            this.decrementation();
            this.killPeople();
        }
    }

    public void propagation() {

    	Coordinate[] neighbors = Grid.getInstance().getNeighbors(position);

        for (Coordinate neighbor : neighbors) {
            int probability = (int) Math.floor(Math.random() * 100);
            if (probability < 33) {
                neighbor.isFire = true;
            }
        }
    }

    public void decrementation(int fireQuantity) {
        this.fireQuantity-= fireQuantity;
    }

     public void decrementation() {
        this.fireQuantity--;
    }

    public Coordinate getPosition() {
        return position;
    }

    public void killPeople() {
        Grid.getInstance().coordinates[position.x][position.y].decrementTimeBeforeDead();
    }
}