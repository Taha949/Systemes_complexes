package projet;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class App extends JFrame {
    private Grid grid = Grid.getInstance();
    private Base base = Base.getInstance();

    public App() {
        // Initialisation de votre fenêtre
        setTitle("Robots pompiers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        // Création de l'instance de la grille
        this.grid = Grid.getInstance();

        // Récupération du contentPane
        Container contentPane = getContentPane();

        // Ajout du panneau de la grille à contentPane
        GridPanel gridPanel = new GridPanel();
        contentPane.add(gridPanel);

        // Affichage de la fenêtre
        setVisible(true);
    }

    // Classe interne pour représenter le panneau de la grille
    private class GridPanel extends JPanel {

       /*
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawGrid(g, grid);
            drawRobots(g, base);
       
            // drawFires(g, base);
        }
        */

        private void drawGrid(Graphics g, Grid grid) {
            int cellSize = 40;
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 11; j++) {
                    int x = i * cellSize;
                    int y = j * cellSize;


             /*       if (grid.coordinates[i][j].isFire()) {
                        g.setColor(Color.RED); // La couleur pour les cases avec des feux
                    } else {
                        g.setColor(Color.GREEN); // La couleur pour les cases sans feux
                    }*/

                    g.fillRect(x, y, cellSize, cellSize);
                }
            }
        }

        /*     private void drawRobots(Graphics g, Base base) {
            List<Coordinate> robotPositions = base.getRobotPositions();
            int cellSize = 40;
            for (Coordinate position : robotPositions) {
                int x = position.x * cellSize;
                int y = position.y * cellSize;

                g.setColor(Color.BLUE); // La couleur pour les robots
                g.fillOval(x, y, cellSize, cellSize);
            }
        }

    
        private void drawFires(Graphics g, Base base) {
            List<Coordinate> firePositions = base.getFirePositions();
            int cellSize = 40;
            for (Coordinate position : firePositions) {
                int x = position.x * cellSize;
                int y = position.y * cellSize;

                g.setColor(Color.RED); // La couleur pour les feux
                g.fillRect(x, y, cellSize, cellSize);
            }
        }
        */
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new App());
    }
}