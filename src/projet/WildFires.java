package projet;

public class WildFires {

    private static WildFires INSTANCE = null;

    public Fire[] fires;
    public int timeBeforeNewFire;

    public WildFires(int nbExistingFires) {
        // Initialisation des feux
        this.fires = new Fire[0];
        for(int i = 0; i < nbExistingFires; i++) {
            this.newFire();
        }
        this.timeBeforeNewFire = 10;
    }

    public static WildFires getInstance(int nbExistingFires) {
        if (INSTANCE == null){
            INSTANCE = new WildFires(nbExistingFires);
        }
        return INSTANCE;
    }

    public static WildFires getInstance() {
        if (INSTANCE == null) {
            getInstance(10);
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
            Fire newFire = new Fire(firePosition);
            this.addFire(newFire);
            firePosition.isFire = true;
        } else {
            // Choisir une nouvelle position si la première est occupée par
            this.newFire();
        }
    }

    public void decrementFireAt(Coordinate coordinate) {
        for (Fire fire : this.fires) {
            if (fire.getPosition().sameCoordinate(coordinate)) {
                fire.decrementation();
                break;
            }
        }
    }

    public void addFire(Fire fire) {
        // Ajouter un feu à la liste des feux
        Fire[] newFires = new Fire[this.fires.length + 1];
        System.arraycopy(this.fires, 0, newFires, 0, this.fires.length);
        newFires[newFires.length - 1] = fire;
        this.fires = newFires;
    }
}
