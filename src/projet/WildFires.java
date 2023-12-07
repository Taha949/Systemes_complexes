package projet;

import java.util.Arrays;

public class WildFires {

    private static WildFires INSTANCE = null;

    private int fireQuantity;
    private int timeBeforePropagation;

    public Fire[] fires;
    public int timeBeforeNewFire;
    public int nbFiresPutedOut = 0;

    public WildFires(int nbExistingFires, int fireQuantity, int timeBeforePropagation) {
        // Initialisation des feux
        this.fires = new Fire[0];
        for(int i = 0; i < nbExistingFires; i++) {
            this.newFire();
        }
        this.timeBeforeNewFire = 10;
        this.fireQuantity = fireQuantity;
        this.timeBeforePropagation = timeBeforePropagation;
    }

    public static WildFires getInstance(int nbExistingFires, int fireQuantity, int timeBeforePropagation) {
        if (INSTANCE == null){
            INSTANCE = new WildFires(nbExistingFires, fireQuantity, timeBeforePropagation);
        }
        return INSTANCE;
    }

    public static WildFires getInstance() {
        if (INSTANCE == null) {
            getInstance(10, 10, 50);
        }
        return INSTANCE;
    }

    public void next() {
        // Appelle les next des feux, modifie éventuellement this.fires et Grid
        for (Fire fire : this.fires) {
            fire.next();
        }

        // Gestion du temps avant l'apparition d'un nouveau feu
        if (this.timeBeforeNewFire > 0) {
            this.timeBeforeNewFire--;
        } else {
            this.newFire();
            this.timeBeforeNewFire = 10; // Réinitialisation du compte à rebours
        }
    }

    public void newFire() {

        // Utiliser Grid pour déterminer une position pour le nouveau feu
        int x = (int) (Math.random() * 11);
        int y = (int) (Math.random() * 11);
        Coordinate firePosition = Grid.getInstance().coordinates[x][y];

        // Vérifier si la position n'est pas déjà occupée par un feu ou une base
        if (!firePosition.isFire && !firePosition.isBase) {
            // Créer un nouveau feu et l'ajouter à la liste des feux
            Fire newFire = new Fire(firePosition, this.fireQuantity, this.timeBeforePropagation);
            this.addFire(newFire);
            firePosition.isFire = true;
        } else {
            // Choisir une nouvelle position si la première est occupée par
            this.newFire();
        }
    }

    public Fire newVirtualFire(Coordinate coordinate) {
        // Créer un nouveau feu virtuel
        return new Fire(coordinate, this.fireQuantity, this.timeBeforePropagation);
    }

    public void decrementFireAt(Coordinate coordinate) {
        for (Fire fire : this.fires) {
            if (fire.getPosition().sameCoordinate(coordinate)) {
                fire.decrementation();
                if (fire.fireQuantity <= 0) {
                    this.removeFire(fire);
                }
            }
        }
    }

    public void removeFire(Fire fire) {
        // Retirer un feu de la liste des feux
        if(this.getFire(fire.getPosition()) == null) {
            return;
        }
        this.nbFiresPutedOut++;
        Fire[] newFires = new Fire[this.fires.length - 1];
        int cpt = 0;
        for (Fire f : this.fires) {
            if (!f.getPosition().sameCoordinate(fire.getPosition())) {
                newFires[cpt] = f;
                cpt++;
            }
        }
        this.fires = newFires;
    }

    public void addFire(Fire fire) {
        // Ajouter un feu à la liste des feux
        if(this.getFire(fire.getPosition()) != null) {
            return;
        }
        Fire[] newFires = Arrays.copyOf(this.fires, this.fires.length + 1);
        newFires[newFires.length - 1] = fire;
        this.fires = newFires;
    }

    public Fire getFire(Coordinate coordinate) {
        for (Fire fire : this.fires) {
            if (fire.getPosition().sameCoordinate(coordinate)) {
                return fire;
            }
        }
        return null;
    }
}
