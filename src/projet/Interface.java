package projet;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.BoxLayout;

public class Interface extends JFrame {

	private JPanel contentPane;
	
	private JPanel gridPanel;


	private Grid grid = Grid.getInstance();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface frame = new Interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void update(){
		this.grid = Grid.getInstance();
		EventQueue.invokeLater(() -> {
			this.gridPanel.removeAll();
			this.createGridPanel(gridPanel);
            this.gridPanel.repaint(); //redessiner la grille
			this.gridPanel.revalidate();
        });
	}

	/**
	 * Create the frame.
	 */
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(4, 5));

		JPanel header = new JPanel();
		contentPane.add(header, BorderLayout.NORTH);

		gridPanel = new JPanel();
		contentPane.add(gridPanel, BorderLayout.CENTER);
		gridPanel.setLayout(new GridLayout(11, 11, 0, 0));

		this.createGridPanel(gridPanel);
	}

	public void createGridPanel(JPanel gridPanel) {

		Coordinate coordinate;

		// Génération pour x=0, y=0
		coordinate = this.grid.coordinates[0][0];
		JPanel coordinatex0y0 = new JPanel();
		if (coordinate.isBase) {
			coordinatex0y0.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex0y0.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex0y0.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex0y0);
		JTextPane robotsNamesx0y0 = new JTextPane();
		robotsNamesx0y0.setText("R: " + coordinate.getRobots());
		coordinatex0y0.add(robotsNamesx0y0);
		JTextPane nbPeoplex0y0 = new JTextPane();
		nbPeoplex0y0.setText("nbH: " + coordinate.nbPeople);
		coordinatex0y0.add(nbPeoplex0y0);

		// Génération pour x=0, y=1
		coordinate = this.grid.coordinates[0][1];
		JPanel coordinatex0y1 = new JPanel();
		if (coordinate.isBase) {
			coordinatex0y1.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex0y1.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex0y1.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex0y1);
		JTextPane robotsNamesx0y1 = new JTextPane();
		robotsNamesx0y1.setText("R: " + coordinate.getRobots());
		coordinatex0y1.add(robotsNamesx0y1);
		JTextPane nbPeoplex0y1 = new JTextPane();
		nbPeoplex0y1.setText("nbH: " + coordinate.nbPeople);
		coordinatex0y1.add(nbPeoplex0y1);

		// Génération pour x=0, y=2
		coordinate = this.grid.coordinates[0][2];
		JPanel coordinatex0y2 = new JPanel();
		if (coordinate.isBase) {
			coordinatex0y2.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex0y2.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex0y2.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex0y2);
		JTextPane robotsNamesx0y2 = new JTextPane();
		robotsNamesx0y2.setText("R: " + coordinate.getRobots());
		coordinatex0y2.add(robotsNamesx0y2);
		JTextPane nbPeoplex0y2 = new JTextPane();
		nbPeoplex0y2.setText("nbH: " + coordinate.nbPeople);
		coordinatex0y2.add(nbPeoplex0y2);

		// Génération pour x=0, y=3
		coordinate = this.grid.coordinates[0][3];
		JPanel coordinatex0y3 = new JPanel();
		if (coordinate.isBase) {
			coordinatex0y3.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex0y3.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex0y3.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex0y3);
		JTextPane robotsNamesx0y3 = new JTextPane();
		robotsNamesx0y3.setText("R: " + coordinate.getRobots());
		coordinatex0y3.add(robotsNamesx0y3);
		JTextPane nbPeoplex0y3 = new JTextPane();
		nbPeoplex0y3.setText("nbH: " + coordinate.nbPeople);
		coordinatex0y3.add(nbPeoplex0y3);

		// Génération pour x=0, y=4
		coordinate = this.grid.coordinates[0][4];
		JPanel coordinatex0y4 = new JPanel();
		if (coordinate.isBase) {
			coordinatex0y4.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex0y4.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex0y4.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex0y4);
		JTextPane robotsNamesx0y4 = new JTextPane();
		robotsNamesx0y4.setText("R: " + coordinate.getRobots());
		coordinatex0y4.add(robotsNamesx0y4);
		JTextPane nbPeoplex0y4 = new JTextPane();
		nbPeoplex0y4.setText("nbH: " + coordinate.nbPeople);
		coordinatex0y4.add(nbPeoplex0y4);

		// Génération pour x=0, y=5
		coordinate = this.grid.coordinates[0][5];
		JPanel coordinatex0y5 = new JPanel();
		if (coordinate.isBase) {
			coordinatex0y5.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex0y5.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex0y5.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex0y5);
		JTextPane robotsNamesx0y5 = new JTextPane();
		robotsNamesx0y5.setText("R: " + coordinate.getRobots());
		coordinatex0y5.add(robotsNamesx0y5);
		JTextPane nbPeoplex0y5 = new JTextPane();
		nbPeoplex0y5.setText("nbH: " + coordinate.nbPeople);
		coordinatex0y5.add(nbPeoplex0y5);

		// Génération pour x=0, y=6
		coordinate = this.grid.coordinates[0][6];
		JPanel coordinatex0y6 = new JPanel();
		if (coordinate.isBase) {
			coordinatex0y6.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex0y6.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex0y6.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex0y6);
		JTextPane robotsNamesx0y6 = new JTextPane();
		robotsNamesx0y6.setText("R: " + coordinate.getRobots());
		coordinatex0y6.add(robotsNamesx0y6);
		JTextPane nbPeoplex0y6 = new JTextPane();
		nbPeoplex0y6.setText("nbH: " + coordinate.nbPeople);
		coordinatex0y6.add(nbPeoplex0y6);

		// Génération pour x=0, y=7
		coordinate = this.grid.coordinates[0][7];
		JPanel coordinatex0y7 = new JPanel();
		if (coordinate.isBase) {
			coordinatex0y7.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex0y7.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex0y7.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex0y7);
		JTextPane robotsNamesx0y7 = new JTextPane();
		robotsNamesx0y7.setText("R: " + coordinate.getRobots());
		coordinatex0y7.add(robotsNamesx0y7);
		JTextPane nbPeoplex0y7 = new JTextPane();
		nbPeoplex0y7.setText("nbH: " + coordinate.nbPeople);
		coordinatex0y7.add(nbPeoplex0y7);

		// Génération pour x=0, y=8
		coordinate = this.grid.coordinates[0][8];
		JPanel coordinatex0y8 = new JPanel();
		if (coordinate.isBase) {
			coordinatex0y8.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex0y8.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex0y8.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex0y8);
		JTextPane robotsNamesx0y8 = new JTextPane();
		robotsNamesx0y8.setText("R: " + coordinate.getRobots());
		coordinatex0y8.add(robotsNamesx0y8);
		JTextPane nbPeoplex0y8 = new JTextPane();
		nbPeoplex0y8.setText("nbH: " + coordinate.nbPeople);
		coordinatex0y8.add(nbPeoplex0y8);

		// Génération pour x=0, y=9
		coordinate = this.grid.coordinates[0][9];
		JPanel coordinatex0y9 = new JPanel();
		if (coordinate.isBase) {
			coordinatex0y9.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex0y9.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex0y9.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex0y9);
		JTextPane robotsNamesx0y9 = new JTextPane();
		robotsNamesx0y9.setText("R: " + coordinate.getRobots());
		coordinatex0y9.add(robotsNamesx0y9);
		JTextPane nbPeoplex0y9 = new JTextPane();
		nbPeoplex0y9.setText("nbH: " + coordinate.nbPeople);
		coordinatex0y9.add(nbPeoplex0y9);

		// Génération pour x=0, y=10
		coordinate = this.grid.coordinates[0][10];
		JPanel coordinatex0y10 = new JPanel();
		if (coordinate.isBase) {
			coordinatex0y10.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex0y10.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex0y10.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex0y10);
		JTextPane robotsNamesx0y10 = new JTextPane();
		robotsNamesx0y10.setText("R: " + coordinate.getRobots());
		coordinatex0y10.add(robotsNamesx0y10);
		JTextPane nbPeoplex0y10 = new JTextPane();
		nbPeoplex0y10.setText("nbH: " + coordinate.nbPeople);
		coordinatex0y10.add(nbPeoplex0y10);

		// Génération pour x=1, y=0
		coordinate = this.grid.coordinates[1][0];
		JPanel coordinatex1y0 = new JPanel();
		if (coordinate.isBase) {
			coordinatex1y0.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex1y0.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex1y0.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex1y0);
		JTextPane robotsNamesx1y0 = new JTextPane();
		robotsNamesx1y0.setText("R: " + coordinate.getRobots());
		coordinatex1y0.add(robotsNamesx1y0);
		JTextPane nbPeoplex1y0 = new JTextPane();
		nbPeoplex1y0.setText("nbH: " + coordinate.nbPeople);
		coordinatex1y0.add(nbPeoplex1y0);

		// Génération pour x=1, y=1
		coordinate = this.grid.coordinates[1][1];
		JPanel coordinatex1y1 = new JPanel();
		if (coordinate.isBase) {
			coordinatex1y1.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex1y1.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex1y1.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex1y1);
		JTextPane robotsNamesx1y1 = new JTextPane();
		robotsNamesx1y1.setText("R: " + coordinate.getRobots());
		coordinatex1y1.add(robotsNamesx1y1);
		JTextPane nbPeoplex1y1 = new JTextPane();
		nbPeoplex1y1.setText("nbH: " + coordinate.nbPeople);
		coordinatex1y1.add(nbPeoplex1y1);

		// Génération pour x=1, y=2
		coordinate = this.grid.coordinates[1][2];
		JPanel coordinatex1y2 = new JPanel();
		if (coordinate.isBase) {
			coordinatex1y2.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex1y2.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex1y2.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex1y2);
		JTextPane robotsNamesx1y2 = new JTextPane();
		robotsNamesx1y2.setText("R: " + coordinate.getRobots());
		coordinatex1y2.add(robotsNamesx1y2);
		JTextPane nbPeoplex1y2 = new JTextPane();
		nbPeoplex1y2.setText("nbH: " + coordinate.nbPeople);
		coordinatex1y2.add(nbPeoplex1y2);

		// Génération pour x=1, y=3
		coordinate = this.grid.coordinates[1][3];
		JPanel coordinatex1y3 = new JPanel();
		if (coordinate.isBase) {
			coordinatex1y3.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex1y3.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex1y3.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex1y3);
		JTextPane robotsNamesx1y3 = new JTextPane();
		robotsNamesx1y3.setText("R: " + coordinate.getRobots());
		coordinatex1y3.add(robotsNamesx1y3);
		JTextPane nbPeoplex1y3 = new JTextPane();
		nbPeoplex1y3.setText("nbH: " + coordinate.nbPeople);
		coordinatex1y3.add(nbPeoplex1y3);

		// Génération pour x=1, y=4
		coordinate = this.grid.coordinates[1][4];
		JPanel coordinatex1y4 = new JPanel();
		if (coordinate.isBase) {
			coordinatex1y4.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex1y4.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex1y4.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex1y4);
		JTextPane robotsNamesx1y4 = new JTextPane();
		robotsNamesx1y4.setText("R: " + coordinate.getRobots());
		coordinatex1y4.add(robotsNamesx1y4);
		JTextPane nbPeoplex1y4 = new JTextPane();
		nbPeoplex1y4.setText("nbH: " + coordinate.nbPeople);
		coordinatex1y4.add(nbPeoplex1y4);

		// Génération pour x=1, y=5
		coordinate = this.grid.coordinates[1][5];
		JPanel coordinatex1y5 = new JPanel();
		if (coordinate.isBase) {
			coordinatex1y5.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex1y5.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex1y5.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex1y5);
		JTextPane robotsNamesx1y5 = new JTextPane();
		robotsNamesx1y5.setText("R: " + coordinate.getRobots());
		coordinatex1y5.add(robotsNamesx1y5);
		JTextPane nbPeoplex1y5 = new JTextPane();
		nbPeoplex1y5.setText("nbH: " + coordinate.nbPeople);
		coordinatex1y5.add(nbPeoplex1y5);

		// Génération pour x=1, y=6
		coordinate = this.grid.coordinates[1][6];
		JPanel coordinatex1y6 = new JPanel();
		if (coordinate.isBase) {
			coordinatex1y6.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex1y6.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex1y6.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex1y6);
		JTextPane robotsNamesx1y6 = new JTextPane();
		robotsNamesx1y6.setText("R: " + coordinate.getRobots());
		coordinatex1y6.add(robotsNamesx1y6);
		JTextPane nbPeoplex1y6 = new JTextPane();
		nbPeoplex1y6.setText("nbH: " + coordinate.nbPeople);
		coordinatex1y6.add(nbPeoplex1y6);

		// Génération pour x=1, y=7
		coordinate = this.grid.coordinates[1][7];
		JPanel coordinatex1y7 = new JPanel();
		if (coordinate.isBase) {
			coordinatex1y7.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex1y7.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex1y7.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex1y7);
		JTextPane robotsNamesx1y7 = new JTextPane();
		robotsNamesx1y7.setText("R: " + coordinate.getRobots());
		coordinatex1y7.add(robotsNamesx1y7);
		JTextPane nbPeoplex1y7 = new JTextPane();
		nbPeoplex1y7.setText("nbH: " + coordinate.nbPeople);
		coordinatex1y7.add(nbPeoplex1y7);

		// Génération pour x=1, y=8
		coordinate = this.grid.coordinates[1][8];
		JPanel coordinatex1y8 = new JPanel();
		if (coordinate.isBase) {
			coordinatex1y8.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex1y8.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex1y8.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex1y8);
		JTextPane robotsNamesx1y8 = new JTextPane();
		robotsNamesx1y8.setText("R: " + coordinate.getRobots());
		coordinatex1y8.add(robotsNamesx1y8);
		JTextPane nbPeoplex1y8 = new JTextPane();
		nbPeoplex1y8.setText("nbH: " + coordinate.nbPeople);
		coordinatex1y8.add(nbPeoplex1y8);

		// Génération pour x=1, y=9
		coordinate = this.grid.coordinates[1][9];
		JPanel coordinatex1y9 = new JPanel();
		if (coordinate.isBase) {
			coordinatex1y9.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex1y9.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex1y9.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex1y9);
		JTextPane robotsNamesx1y9 = new JTextPane();
		robotsNamesx1y9.setText("R: " + coordinate.getRobots());
		coordinatex1y9.add(robotsNamesx1y9);
		JTextPane nbPeoplex1y9 = new JTextPane();
		nbPeoplex1y9.setText("nbH: " + coordinate.nbPeople);
		coordinatex1y9.add(nbPeoplex1y9);

		// Génération pour x=1, y=10
		coordinate = this.grid.coordinates[1][10];
		JPanel coordinatex1y10 = new JPanel();

		if (coordinate.isBase) {
			coordinatex1y10.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex1y10.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex1y10.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex1y10);
		JTextPane robotsNamesx1y10 = new JTextPane();
		robotsNamesx1y10.setText("R: " + coordinate.getRobots());
		coordinatex1y10.add(robotsNamesx1y10);
		JTextPane nbPeoplex1y10 = new JTextPane();
		nbPeoplex1y10.setText("nbH: " + coordinate.nbPeople);
		coordinatex1y10.add(nbPeoplex1y10);

		// Génération pour x=2, y=0
		coordinate = this.grid.coordinates[2][0];
		JPanel coordinatex2y0 = new JPanel();
		if (coordinate.isBase) {
			coordinatex2y0.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex2y0.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex2y0.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex2y0);
		JTextPane robotsNamesx2y0 = new JTextPane();
		robotsNamesx2y0.setText("R: " + coordinate.getRobots());
		coordinatex2y0.add(robotsNamesx2y0);
		JTextPane nbPeoplex2y0 = new JTextPane();
		nbPeoplex2y0.setText("nbH: " + coordinate.nbPeople);
		coordinatex2y0.add(nbPeoplex2y0);

		// Génération pour x=2, y=1
		coordinate = this.grid.coordinates[2][1];
		JPanel coordinatex2y1 = new JPanel();
		if (coordinate.isBase) {
			coordinatex2y1.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex2y1.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex2y1.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex2y1);
		JTextPane robotsNamesx2y1 = new JTextPane();
		robotsNamesx2y1.setText("R: " + coordinate.getRobots());
		coordinatex2y1.add(robotsNamesx2y1);
		JTextPane nbPeoplex2y1 = new JTextPane();
		nbPeoplex2y1.setText("nbH: " + coordinate.nbPeople);
		coordinatex2y1.add(nbPeoplex2y1);

		// Génération pour x=2, y=2
		coordinate = this.grid.coordinates[2][2];
		JPanel coordinatex2y2 = new JPanel();
		if (coordinate.isBase) {
			coordinatex2y2.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex2y2.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex2y2.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex2y2);
		JTextPane robotsNamesx2y2 = new JTextPane();
		robotsNamesx2y2.setText("R: " + coordinate.getRobots());
		coordinatex2y2.add(robotsNamesx2y2);
		JTextPane nbPeoplex2y2 = new JTextPane();
		nbPeoplex2y2.setText("nbH: " + coordinate.nbPeople);
		coordinatex2y2.add(nbPeoplex2y2);

		// Génération pour x=2, y=3
		coordinate = this.grid.coordinates[2][3];
		JPanel coordinatex2y3 = new JPanel();
		if (coordinate.isBase) {
			coordinatex2y3.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex2y3.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex2y3.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex2y3);
		JTextPane robotsNamesx2y3 = new JTextPane();
		robotsNamesx2y3.setText("R: " + coordinate.getRobots());
		coordinatex2y3.add(robotsNamesx2y3);
		JTextPane nbPeoplex2y3 = new JTextPane();
		nbPeoplex2y3.setText("nbH: " + coordinate.nbPeople);
		coordinatex2y3.add(nbPeoplex2y3);

		// Génération pour x=2, y=4
		coordinate = this.grid.coordinates[2][4];
		JPanel coordinatex2y4 = new JPanel();
		if (coordinate.isBase) {
			coordinatex2y4.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex2y4.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex2y4.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex2y4);
		JTextPane robotsNamesx2y4 = new JTextPane();
		robotsNamesx2y4.setText("R: " + coordinate.getRobots());
		coordinatex2y4.add(robotsNamesx2y4);
		JTextPane nbPeoplex2y4 = new JTextPane();
		nbPeoplex2y4.setText("nbH: " + coordinate.nbPeople);
		coordinatex2y4.add(nbPeoplex2y4);

		// Génération pour x=2, y=5
		coordinate = this.grid.coordinates[2][5];
		JPanel coordinatex2y5 = new JPanel();
		if (coordinate.isBase) {
			coordinatex2y5.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex2y5.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex2y5.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex2y5);
		JTextPane robotsNamesx2y5 = new JTextPane();
		robotsNamesx2y5.setText("R: " + coordinate.getRobots());
		coordinatex2y5.add(robotsNamesx2y5);
		JTextPane nbPeoplex2y5 = new JTextPane();
		nbPeoplex2y5.setText("nbH: " + coordinate.nbPeople);
		coordinatex2y5.add(nbPeoplex2y5);

		// Génération pour x=2, y=6
		coordinate = this.grid.coordinates[2][6];
		JPanel coordinatex2y6 = new JPanel();
		if (coordinate.isBase) {
			coordinatex2y6.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex2y6.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex2y6.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex2y6);
		JTextPane robotsNamesx2y6 = new JTextPane();
		robotsNamesx2y6.setText("R: " + coordinate.getRobots());
		coordinatex2y6.add(robotsNamesx2y6);
		JTextPane nbPeoplex2y6 = new JTextPane();
		nbPeoplex2y6.setText("nbH: " + coordinate.nbPeople);
		coordinatex2y6.add(nbPeoplex2y6);

		// Génération pour x=2, y=7
		coordinate = this.grid.coordinates[2][7];
		JPanel coordinatex2y7 = new JPanel();
		if (coordinate.isBase) {
			coordinatex2y7.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex2y7.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex2y7.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex2y7);
		JTextPane robotsNamesx2y7 = new JTextPane();
		robotsNamesx2y7.setText("R: " + coordinate.getRobots());
		coordinatex2y7.add(robotsNamesx2y7);
		JTextPane nbPeoplex2y7 = new JTextPane();
		nbPeoplex2y7.setText("nbH: " + coordinate.nbPeople);
		coordinatex2y7.add(nbPeoplex2y7);

		// Génération pour x=2, y=8
		coordinate = this.grid.coordinates[2][8];
		JPanel coordinatex2y8 = new JPanel();
		if (coordinate.isBase) {
			coordinatex2y8.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex2y8.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex2y8.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex2y8);
		JTextPane robotsNamesx2y8 = new JTextPane();
		robotsNamesx2y8.setText("R: " + coordinate.getRobots());
		coordinatex2y8.add(robotsNamesx2y8);
		JTextPane nbPeoplex2y8 = new JTextPane();
		nbPeoplex2y8.setText("nbH: " + coordinate.nbPeople);
		coordinatex2y8.add(nbPeoplex2y8);

		// Génération pour x=2, y=9
		coordinate = this.grid.coordinates[2][9];
		JPanel coordinatex2y9 = new JPanel();
		if (coordinate.isBase) {
			coordinatex2y9.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex2y9.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex2y9.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex2y9);
		JTextPane robotsNamesx2y9 = new JTextPane();
		robotsNamesx2y9.setText("R: " + coordinate.getRobots());
		coordinatex2y9.add(robotsNamesx2y9);
		JTextPane nbPeoplex2y9 = new JTextPane();
		nbPeoplex2y9.setText("nbH: " + coordinate.nbPeople);
		coordinatex2y9.add(nbPeoplex2y9);

		// Génération pour x=2, y=10
		coordinate = this.grid.coordinates[2][10];
		JPanel coordinatex2y10 = new JPanel();
		if (coordinate.isBase) {
			coordinatex2y10.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex2y10.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex2y10.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex2y10);
		JTextPane robotsNamesx2y10 = new JTextPane();
		robotsNamesx2y10.setText("R: " + coordinate.getRobots());
		coordinatex2y10.add(robotsNamesx2y10);
		JTextPane nbPeoplex2y10 = new JTextPane();
		nbPeoplex2y10.setText("nbH: " + coordinate.nbPeople);
		coordinatex2y10.add(nbPeoplex2y10);

		// Génération pour x=3, y=0
		coordinate = this.grid.coordinates[3][0];
		JPanel coordinatex3y0 = new JPanel();
		if (coordinate.isBase) {
			coordinatex3y0.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex3y0.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex3y0.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex3y0);
		JTextPane robotsNamesx3y0 = new JTextPane();
		robotsNamesx3y0.setText("R: " + coordinate.getRobots());
		coordinatex3y0.add(robotsNamesx3y0);
		JTextPane nbPeoplex3y0 = new JTextPane();
		nbPeoplex3y0.setText("nbH: " + coordinate.nbPeople);
		coordinatex3y0.add(nbPeoplex3y0);

		// Génération pour x=3, y=1
		coordinate = this.grid.coordinates[3][1];
		JPanel coordinatex3y1 = new JPanel();
		if (coordinate.isBase) {
			coordinatex3y1.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex3y1.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex3y1.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex3y1);
		JTextPane robotsNamesx3y1 = new JTextPane();
		robotsNamesx3y1.setText("R: " + coordinate.getRobots());
		coordinatex3y1.add(robotsNamesx3y1);
		JTextPane nbPeoplex3y1 = new JTextPane();
		nbPeoplex3y1.setText("nbH: " + coordinate.nbPeople);
		coordinatex3y1.add(nbPeoplex3y1);

		// Génération pour x=3, y=2
		coordinate = this.grid.coordinates[3][2];
		JPanel coordinatex3y2 = new JPanel();
		if (coordinate.isBase) {
			coordinatex3y2.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex3y2.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex3y2.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex3y2);
		JTextPane robotsNamesx3y2 = new JTextPane();
		robotsNamesx3y2.setText("R: " + coordinate.getRobots());
		coordinatex3y2.add(robotsNamesx3y2);
		JTextPane nbPeoplex3y2 = new JTextPane();
		nbPeoplex3y2.setText("nbH: " + coordinate.nbPeople);
		coordinatex3y2.add(nbPeoplex3y2);

		// Génération pour x=3, y=3
		coordinate = this.grid.coordinates[3][3];
		JPanel coordinatex3y3 = new JPanel();
		if (coordinate.isBase) {
			coordinatex3y3.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex3y3.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex3y3.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex3y3);
		JTextPane robotsNamesx3y3 = new JTextPane();
		robotsNamesx3y3.setText("R: " + coordinate.getRobots());
		coordinatex3y3.add(robotsNamesx3y3);
		JTextPane nbPeoplex3y3 = new JTextPane();
		nbPeoplex3y3.setText("nbH: " + coordinate.nbPeople);
		coordinatex3y3.add(nbPeoplex3y3);

		// Génération pour x=3, y=4
		coordinate = this.grid.coordinates[3][4];
		JPanel coordinatex3y4 = new JPanel();
		if (coordinate.isBase) {
			coordinatex3y4.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex3y4.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex3y4.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex3y4);
		JTextPane robotsNamesx3y4 = new JTextPane();
		robotsNamesx3y4.setText("R: " + coordinate.getRobots());
		coordinatex3y4.add(robotsNamesx3y4);
		JTextPane nbPeoplex3y4 = new JTextPane();
		nbPeoplex3y4.setText("nbH: " + coordinate.nbPeople);
		coordinatex3y4.add(nbPeoplex3y4);

		// Génération pour x=3, y=5
		coordinate = this.grid.coordinates[3][5];
		JPanel coordinatex3y5 = new JPanel();
		if (coordinate.isBase) {
			coordinatex3y5.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex3y5.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex3y5.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex3y5);
		JTextPane robotsNamesx3y5 = new JTextPane();
		robotsNamesx3y5.setText("R: " + coordinate.getRobots());
		coordinatex3y5.add(robotsNamesx3y5);
		JTextPane nbPeoplex3y5 = new JTextPane();
		nbPeoplex3y5.setText("nbH: " + coordinate.nbPeople);
		coordinatex3y5.add(nbPeoplex3y5);

		// Génération pour x=3, y=6
		coordinate = this.grid.coordinates[3][6];
		JPanel coordinatex3y6 = new JPanel();
		if (coordinate.isBase) {
			coordinatex3y6.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex3y6.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex3y6.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex3y6);
		JTextPane robotsNamesx3y6 = new JTextPane();
		robotsNamesx3y6.setText("R: " + coordinate.getRobots());
		coordinatex3y6.add(robotsNamesx3y6);
		JTextPane nbPeoplex3y6 = new JTextPane();
		nbPeoplex3y6.setText("nbH: " + coordinate.nbPeople);
		coordinatex3y6.add(nbPeoplex3y6);

		// Génération pour x=3, y=7
		coordinate = this.grid.coordinates[3][7];
		JPanel coordinatex3y7 = new JPanel();
		if (coordinate.isBase) {
			coordinatex3y7.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex3y7.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex3y7.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex3y7);
		JTextPane robotsNamesx3y7 = new JTextPane();
		robotsNamesx3y7.setText("R: " + coordinate.getRobots());
		coordinatex3y7.add(robotsNamesx3y7);
		JTextPane nbPeoplex3y7 = new JTextPane();
		nbPeoplex3y7.setText("nbH: " + coordinate.nbPeople);
		coordinatex3y7.add(nbPeoplex3y7);

		// Génération pour x=3, y=8
		coordinate = this.grid.coordinates[3][8];
		JPanel coordinatex3y8 = new JPanel();
		if (coordinate.isBase) {
			coordinatex3y8.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex3y8.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex3y8.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex3y8);
		JTextPane robotsNamesx3y8 = new JTextPane();
		robotsNamesx3y8.setText("R: " + coordinate.getRobots());
		coordinatex3y8.add(robotsNamesx3y8);
		JTextPane nbPeoplex3y8 = new JTextPane();
		nbPeoplex3y8.setText("nbH: " + coordinate.nbPeople);
		coordinatex3y8.add(nbPeoplex3y8);

		// Génération pour x=3, y=9
		coordinate = this.grid.coordinates[3][9];
		JPanel coordinatex3y9 = new JPanel();
		if (coordinate.isBase) {
			coordinatex3y9.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex3y9.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex3y9.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex3y9);
		JTextPane robotsNamesx3y9 = new JTextPane();
		robotsNamesx3y9.setText("R: " + coordinate.getRobots());
		coordinatex3y9.add(robotsNamesx3y9);
		JTextPane nbPeoplex3y9 = new JTextPane();
		nbPeoplex3y9.setText("nbH: " + coordinate.nbPeople);
		coordinatex3y9.add(nbPeoplex3y9);

		// Génération pour x=3, y=10
		coordinate = this.grid.coordinates[3][10];
		JPanel coordinatex3y10 = new JPanel();
		if (coordinate.isBase) {
			coordinatex3y10.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex3y10.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex3y10.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex3y10);
		JTextPane robotsNamesx3y10 = new JTextPane();
		robotsNamesx3y10.setText("R: " + coordinate.getRobots());
		coordinatex3y10.add(robotsNamesx3y10);
		JTextPane nbPeoplex3y10 = new JTextPane();
		nbPeoplex3y10.setText("nbH: " + coordinate.nbPeople);
		coordinatex3y10.add(nbPeoplex3y10);

		// Génération pour x=4, y=0
		coordinate = this.grid.coordinates[4][0];
		JPanel coordinatex4y0 = new JPanel();
		if (coordinate.isBase) {
			coordinatex4y0.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex4y0.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex4y0.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex4y0);
		JTextPane robotsNamesx4y0 = new JTextPane();
		robotsNamesx4y0.setText("R: " + coordinate.getRobots());
		coordinatex4y0.add(robotsNamesx4y0);
		JTextPane nbPeoplex4y0 = new JTextPane();
		nbPeoplex4y0.setText("nbH: " + coordinate.nbPeople);
		coordinatex4y0.add(nbPeoplex4y0);

		// Génération pour x=4, y=1
		coordinate = this.grid.coordinates[4][1];
		JPanel coordinatex4y1 = new JPanel();
		if (coordinate.isBase) {
			coordinatex4y1.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex4y1.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex4y1.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex4y1);
		JTextPane robotsNamesx4y1 = new JTextPane();
		robotsNamesx4y1.setText("R: " + coordinate.getRobots());
		coordinatex4y1.add(robotsNamesx4y1);
		JTextPane nbPeoplex4y1 = new JTextPane();
		nbPeoplex4y1.setText("nbH: " + coordinate.nbPeople);
		coordinatex4y1.add(nbPeoplex4y1);

		// Génération pour x=4, y=2
		coordinate = this.grid.coordinates[4][2];
		JPanel coordinatex4y2 = new JPanel();
		if (coordinate.isBase) {
			coordinatex4y2.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex4y2.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex4y2.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex4y2);
		JTextPane robotsNamesx4y2 = new JTextPane();
		robotsNamesx4y2.setText("R: " + coordinate.getRobots());
		coordinatex4y2.add(robotsNamesx4y2);
		JTextPane nbPeoplex4y2 = new JTextPane();
		nbPeoplex4y2.setText("nbH: " + coordinate.nbPeople);
		coordinatex4y2.add(nbPeoplex4y2);

		// Génération pour x=4, y=3
		coordinate = this.grid.coordinates[4][3];
		JPanel coordinatex4y3 = new JPanel();
		if (coordinate.isBase) {
			coordinatex4y3.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex4y3.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex4y3.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex4y3);
		JTextPane robotsNamesx4y3 = new JTextPane();
		robotsNamesx4y3.setText("R: " + coordinate.getRobots());
		coordinatex4y3.add(robotsNamesx4y3);
		JTextPane nbPeoplex4y3 = new JTextPane();
		nbPeoplex4y3.setText("nbH: " + coordinate.nbPeople);
		coordinatex4y3.add(nbPeoplex4y3);

		// Génération pour x=4, y=4
		coordinate = this.grid.coordinates[4][4];
		JPanel coordinatex4y4 = new JPanel();
		if (coordinate.isBase) {
			coordinatex4y4.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex4y4.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex4y4.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex4y4);
		JTextPane robotsNamesx4y4 = new JTextPane();
		robotsNamesx4y4.setText("R: " + coordinate.getRobots());
		coordinatex4y4.add(robotsNamesx4y4);
		JTextPane nbPeoplex4y4 = new JTextPane();
		nbPeoplex4y4.setText("nbH: " + coordinate.nbPeople);
		coordinatex4y4.add(nbPeoplex4y4);

		// Génération pour x=4, y=5
		coordinate = this.grid.coordinates[4][5];
		JPanel coordinatex4y5 = new JPanel();
		if (coordinate.isBase) {
			coordinatex4y5.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex4y5.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex4y5.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex4y5);
		JTextPane robotsNamesx4y5 = new JTextPane();
		robotsNamesx4y5.setText("R: " + coordinate.getRobots());
		coordinatex4y5.add(robotsNamesx4y5);
		JTextPane nbPeoplex4y5 = new JTextPane();
		nbPeoplex4y5.setText("nbH: " + coordinate.nbPeople);
		coordinatex4y5.add(nbPeoplex4y5);

		// Génération pour x=4, y=6
		coordinate = this.grid.coordinates[4][6];
		JPanel coordinatex4y6 = new JPanel();
		if (coordinate.isBase) {
			coordinatex4y6.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex4y6.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex4y6.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex4y6);
		JTextPane robotsNamesx4y6 = new JTextPane();
		robotsNamesx4y6.setText("R: " + coordinate.getRobots());
		coordinatex4y6.add(robotsNamesx4y6);
		JTextPane nbPeoplex4y6 = new JTextPane();
		nbPeoplex4y6.setText("nbH: " + coordinate.nbPeople);
		coordinatex4y6.add(nbPeoplex4y6);

		// Génération pour x=4, y=7
		coordinate = this.grid.coordinates[4][7];
		JPanel coordinatex4y7 = new JPanel();
		if (coordinate.isBase) {
			coordinatex4y7.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex4y7.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex4y7.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex4y7);
		JTextPane robotsNamesx4y7 = new JTextPane();
		robotsNamesx4y7.setText("R: " + coordinate.getRobots());
		coordinatex4y7.add(robotsNamesx4y7);
		JTextPane nbPeoplex4y7 = new JTextPane();
		nbPeoplex4y7.setText("nbH: " + coordinate.nbPeople);
		coordinatex4y7.add(nbPeoplex4y7);

		// Génération pour x=4, y=8
		coordinate = this.grid.coordinates[4][8];
		JPanel coordinatex4y8 = new JPanel();
		if (coordinate.isBase) {
			coordinatex4y8.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex4y8.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex4y8.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex4y8);
		JTextPane robotsNamesx4y8 = new JTextPane();
		robotsNamesx4y8.setText("R: " + coordinate.getRobots());
		coordinatex4y8.add(robotsNamesx4y8);
		JTextPane nbPeoplex4y8 = new JTextPane();
		nbPeoplex4y8.setText("nbH: " + coordinate.nbPeople);
		coordinatex4y8.add(nbPeoplex4y8);

		// Génération pour x=4, y=9
		coordinate = this.grid.coordinates[4][9];
		JPanel coordinatex4y9 = new JPanel();
		if (coordinate.isBase) {
			coordinatex4y9.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex4y9.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex4y9.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex4y9);
		JTextPane robotsNamesx4y9 = new JTextPane();
		robotsNamesx4y9.setText("R: " + coordinate.getRobots());
		coordinatex4y9.add(robotsNamesx4y9);
		JTextPane nbPeoplex4y9 = new JTextPane();
		nbPeoplex4y9.setText("nbH: " + coordinate.nbPeople);
		coordinatex4y9.add(nbPeoplex4y9);

		// Génération pour x=4, y=10
		coordinate = this.grid.coordinates[4][10];
		JPanel coordinatex4y10 = new JPanel();
		if (coordinate.isBase) {
			coordinatex4y10.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex4y10.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex4y10.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex4y10);
		JTextPane robotsNamesx4y10 = new JTextPane();
		robotsNamesx4y10.setText("R: " + coordinate.getRobots());
		coordinatex4y10.add(robotsNamesx4y10);
		JTextPane nbPeoplex4y10 = new JTextPane();
		nbPeoplex4y10.setText("nbH: " + coordinate.nbPeople);
		coordinatex4y10.add(nbPeoplex4y10);

		// Génération pour x=5, y=0
		coordinate = this.grid.coordinates[5][0];
		JPanel coordinatex5y0 = new JPanel();
		if (coordinate.isBase) {
			coordinatex5y0.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex5y0.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex5y0.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex5y0);
		JTextPane robotsNamesx5y0 = new JTextPane();
		robotsNamesx5y0.setText("R: " + coordinate.getRobots());
		coordinatex5y0.add(robotsNamesx5y0);
		JTextPane nbPeoplex5y0 = new JTextPane();
		nbPeoplex5y0.setText("nbH: " + coordinate.nbPeople);
		coordinatex5y0.add(nbPeoplex5y0);

		// Génération pour x=5, y=1
		coordinate = this.grid.coordinates[5][1];
		JPanel coordinatex5y1 = new JPanel();
		if (coordinate.isBase) {
			coordinatex5y1.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex5y1.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex5y1.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex5y1);
		JTextPane robotsNamesx5y1 = new JTextPane();
		robotsNamesx5y1.setText("R: " + coordinate.getRobots());
		coordinatex5y1.add(robotsNamesx5y1);
		JTextPane nbPeoplex5y1 = new JTextPane();
		nbPeoplex5y1.setText("nbH: " + coordinate.nbPeople);
		coordinatex5y1.add(nbPeoplex5y1);

		// Génération pour x=5, y=2
		coordinate = this.grid.coordinates[5][2];
		JPanel coordinatex5y2 = new JPanel();
		if (coordinate.isBase) {
			coordinatex5y2.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex5y2.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex5y2.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex5y2);
		JTextPane robotsNamesx5y2 = new JTextPane();
		robotsNamesx5y2.setText("R: " + coordinate.getRobots());
		coordinatex5y2.add(robotsNamesx5y2);
		JTextPane nbPeoplex5y2 = new JTextPane();
		nbPeoplex5y2.setText("nbH: " + coordinate.nbPeople);
		coordinatex5y2.add(nbPeoplex5y2);

		// Génération pour x=5, y=3
		coordinate = this.grid.coordinates[5][3];
		JPanel coordinatex5y3 = new JPanel();
		if (coordinate.isBase) {
			coordinatex5y3.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex5y3.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex5y3.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex5y3);
		JTextPane robotsNamesx5y3 = new JTextPane();
		robotsNamesx5y3.setText("R: " + coordinate.getRobots());
		coordinatex5y3.add(robotsNamesx5y3);
		JTextPane nbPeoplex5y3 = new JTextPane();
		nbPeoplex5y3.setText("nbH: " + coordinate.nbPeople);
		coordinatex5y3.add(nbPeoplex5y3);

		// Génération pour x=5, y=4
		coordinate = this.grid.coordinates[5][4];
		JPanel coordinatex5y4 = new JPanel();
		if (coordinate.isBase) {
			coordinatex5y4.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex5y4.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex5y4.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex5y4);
		JTextPane robotsNamesx5y4 = new JTextPane();
		robotsNamesx5y4.setText("R: " + coordinate.getRobots());
		coordinatex5y4.add(robotsNamesx5y4);
		JTextPane nbPeoplex5y4 = new JTextPane();
		nbPeoplex5y4.setText("nbH: " + coordinate.nbPeople);
		coordinatex5y4.add(nbPeoplex5y4);

		// Génération pour x=5, y=5
		coordinate = this.grid.coordinates[5][5];
		JPanel coordinatex5y5 = new JPanel();
		if (coordinate.isBase) {
			coordinatex5y5.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex5y5.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex5y5.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex5y5);
		JTextPane robotsNamesx5y5 = new JTextPane();
		robotsNamesx5y5.setText("R: " + coordinate.getRobots());
		coordinatex5y5.add(robotsNamesx5y5);
		JTextPane nbPeoplex5y5 = new JTextPane();
		nbPeoplex5y5.setText("nbH: " + coordinate.nbPeople);
		coordinatex5y5.add(nbPeoplex5y5);

		// Génération pour x=5, y=6
		coordinate = this.grid.coordinates[5][6];
		JPanel coordinatex5y6 = new JPanel();
		if (coordinate.isBase) {
			coordinatex5y6.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex5y6.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex5y6.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex5y6);
		JTextPane robotsNamesx5y6 = new JTextPane();
		robotsNamesx5y6.setText("R: " + coordinate.getRobots());
		coordinatex5y6.add(robotsNamesx5y6);
		JTextPane nbPeoplex5y6 = new JTextPane();
		nbPeoplex5y6.setText("nbH: " + coordinate.nbPeople);
		coordinatex5y6.add(nbPeoplex5y6);

		// Génération pour x=5, y=7
		coordinate = this.grid.coordinates[5][7];
		JPanel coordinatex5y7 = new JPanel();
		if (coordinate.isBase) {
			coordinatex5y7.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex5y7.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex5y7.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex5y7);
		JTextPane robotsNamesx5y7 = new JTextPane();
		robotsNamesx5y7.setText("R: " + coordinate.getRobots());
		coordinatex5y7.add(robotsNamesx5y7);
		JTextPane nbPeoplex5y7 = new JTextPane();
		nbPeoplex5y7.setText("nbH: " + coordinate.nbPeople);
		coordinatex5y7.add(nbPeoplex5y7);

		// Génération pour x=5, y=8
		coordinate = this.grid.coordinates[5][8];
		JPanel coordinatex5y8 = new JPanel();
		if (coordinate.isBase) {
			coordinatex5y8.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex5y8.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex5y8.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex5y8);
		JTextPane robotsNamesx5y8 = new JTextPane();
		robotsNamesx5y8.setText("R: " + coordinate.getRobots());
		coordinatex5y8.add(robotsNamesx5y8);
		JTextPane nbPeoplex5y8 = new JTextPane();
		nbPeoplex5y8.setText("nbH: " + coordinate.nbPeople);
		coordinatex5y8.add(nbPeoplex5y8);

		// Génération pour x=5, y=9
		coordinate = this.grid.coordinates[5][9];
		JPanel coordinatex5y9 = new JPanel();
		if (coordinate.isBase) {
			coordinatex5y9.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex5y9.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex5y9.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex5y9);
		JTextPane robotsNamesx5y9 = new JTextPane();
		robotsNamesx5y9.setText("R: " + coordinate.getRobots());
		coordinatex5y9.add(robotsNamesx5y9);
		JTextPane nbPeoplex5y9 = new JTextPane();
		nbPeoplex5y9.setText("nbH: " + coordinate.nbPeople);
		coordinatex5y9.add(nbPeoplex5y9);

		// Génération pour x=5, y=10
		coordinate = this.grid.coordinates[5][10];
		JPanel coordinatex5y10 = new JPanel();
		if (coordinate.isBase) {
			coordinatex5y10.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex5y10.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex5y10.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex5y10);
		JTextPane robotsNamesx5y10 = new JTextPane();
		robotsNamesx5y10.setText("R: " + coordinate.getRobots());
		coordinatex5y10.add(robotsNamesx5y10);
		JTextPane nbPeoplex5y10 = new JTextPane();
		nbPeoplex5y10.setText("nbH: " + coordinate.nbPeople);
		coordinatex5y10.add(nbPeoplex5y10);

		// Génération pour x=6, y=0
		coordinate = this.grid.coordinates[6][0];
		JPanel coordinatex6y0 = new JPanel();
		if (coordinate.isBase) {
			coordinatex6y0.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex6y0.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex6y0.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex6y0);
		JTextPane robotsNamesx6y0 = new JTextPane();
		robotsNamesx6y0.setText("R: " + coordinate.getRobots());
		coordinatex6y0.add(robotsNamesx6y0);
		JTextPane nbPeoplex6y0 = new JTextPane();
		nbPeoplex6y0.setText("nbH: " + coordinate.nbPeople);
		coordinatex6y0.add(nbPeoplex6y0);

		// Génération pour x=6, y=1
		coordinate = this.grid.coordinates[6][1];
		JPanel coordinatex6y1 = new JPanel();
		if (coordinate.isBase) {
			coordinatex6y1.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex6y1.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex6y1.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex6y1);
		JTextPane robotsNamesx6y1 = new JTextPane();
		robotsNamesx6y1.setText("R: " + coordinate.getRobots());
		coordinatex6y1.add(robotsNamesx6y1);
		JTextPane nbPeoplex6y1 = new JTextPane();
		nbPeoplex6y1.setText("nbH: " + coordinate.nbPeople);
		coordinatex6y1.add(nbPeoplex6y1);

		// Génération pour x=6, y=2
		coordinate = this.grid.coordinates[6][2];
		JPanel coordinatex6y2 = new JPanel();
		if (coordinate.isBase) {
			coordinatex6y2.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex6y2.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex6y2.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex6y2);
		JTextPane robotsNamesx6y2 = new JTextPane();
		robotsNamesx6y2.setText("R: " + coordinate.getRobots());
		coordinatex6y2.add(robotsNamesx6y2);
		JTextPane nbPeoplex6y2 = new JTextPane();
		nbPeoplex6y2.setText("nbH: " + coordinate.nbPeople);
		coordinatex6y2.add(nbPeoplex6y2);

		// Génération pour x=6, y=3
		coordinate = this.grid.coordinates[6][3];
		JPanel coordinatex6y3 = new JPanel();
		if (coordinate.isBase) {
			coordinatex6y3.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex6y3.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex6y3.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex6y3);
		JTextPane robotsNamesx6y3 = new JTextPane();
		robotsNamesx6y3.setText("R: " + coordinate.getRobots());
		coordinatex6y3.add(robotsNamesx6y3);
		JTextPane nbPeoplex6y3 = new JTextPane();
		nbPeoplex6y3.setText("nbH: " + coordinate.nbPeople);
		coordinatex6y3.add(nbPeoplex6y3);

		// Génération pour x=6, y=4
		coordinate = this.grid.coordinates[6][4];
		JPanel coordinatex6y4 = new JPanel();
		if (coordinate.isBase) {
			coordinatex6y4.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex6y4.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex6y4.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex6y4);
		JTextPane robotsNamesx6y4 = new JTextPane();
		robotsNamesx6y4.setText("R: " + coordinate.getRobots());
		coordinatex6y4.add(robotsNamesx6y4);
		JTextPane nbPeoplex6y4 = new JTextPane();
		nbPeoplex6y4.setText("nbH: " + coordinate.nbPeople);
		coordinatex6y4.add(nbPeoplex6y4);

		// Génération pour x=6, y=5
		coordinate = this.grid.coordinates[6][5];
		JPanel coordinatex6y5 = new JPanel();
		if (coordinate.isBase) {
			coordinatex6y5.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex6y5.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex6y5.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex6y5);
		JTextPane robotsNamesx6y5 = new JTextPane();
		robotsNamesx6y5.setText("R: " + coordinate.getRobots());
		coordinatex6y5.add(robotsNamesx6y5);
		JTextPane nbPeoplex6y5 = new JTextPane();
		nbPeoplex6y5.setText("nbH: " + coordinate.nbPeople);
		coordinatex6y5.add(nbPeoplex6y5);

		// Génération pour x=6, y=6
		coordinate = this.grid.coordinates[6][6];
		JPanel coordinatex6y6 = new JPanel();
		if (coordinate.isBase) {
			coordinatex6y6.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex6y6.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex6y6.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex6y6);
		JTextPane robotsNamesx6y6 = new JTextPane();
		robotsNamesx6y6.setText("R: " + coordinate.getRobots());
		coordinatex6y6.add(robotsNamesx6y6);
		JTextPane nbPeoplex6y6 = new JTextPane();
		nbPeoplex6y6.setText("nbH: " + coordinate.nbPeople);
		coordinatex6y6.add(nbPeoplex6y6);

		// Génération pour x=6, y=7
		coordinate = this.grid.coordinates[6][7];
		JPanel coordinatex6y7 = new JPanel();
		if (coordinate.isBase) {
			coordinatex6y7.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex6y7.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex6y7.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex6y7);
		JTextPane robotsNamesx6y7 = new JTextPane();
		robotsNamesx6y7.setText("R: " + coordinate.getRobots());
		coordinatex6y7.add(robotsNamesx6y7);
		JTextPane nbPeoplex6y7 = new JTextPane();
		nbPeoplex6y7.setText("nbH: " + coordinate.nbPeople);
		coordinatex6y7.add(nbPeoplex6y7);

		// Génération pour x=6, y=8
		coordinate = this.grid.coordinates[6][8];
		JPanel coordinatex6y8 = new JPanel();
		if (coordinate.isBase) {
			coordinatex6y8.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex6y8.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex6y8.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex6y8);
		JTextPane robotsNamesx6y8 = new JTextPane();
		robotsNamesx6y8.setText("R: " + coordinate.getRobots());
		coordinatex6y8.add(robotsNamesx6y8);
		JTextPane nbPeoplex6y8 = new JTextPane();
		nbPeoplex6y8.setText("nbH: " + coordinate.nbPeople);
		coordinatex6y8.add(nbPeoplex6y8);

		// Génération pour x=6, y=9
		coordinate = this.grid.coordinates[6][9];
		JPanel coordinatex6y9 = new JPanel();
		if (coordinate.isBase) {
			coordinatex6y9.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex6y9.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex6y9.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex6y9);
		JTextPane robotsNamesx6y9 = new JTextPane();
		robotsNamesx6y9.setText("R: " + coordinate.getRobots());
		coordinatex6y9.add(robotsNamesx6y9);
		JTextPane nbPeoplex6y9 = new JTextPane();
		nbPeoplex6y9.setText("nbH: " + coordinate.nbPeople);
		coordinatex6y9.add(nbPeoplex6y9);

		// Génération pour x=6, y=10
		coordinate = this.grid.coordinates[6][10];
		JPanel coordinatex6y10 = new JPanel();
		if (coordinate.isBase) {
			coordinatex6y10.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex6y10.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex6y10.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex6y10);
		JTextPane robotsNamesx6y10 = new JTextPane();
		robotsNamesx6y10.setText("R: " + coordinate.getRobots());
		coordinatex6y10.add(robotsNamesx6y10);
		JTextPane nbPeoplex6y10 = new JTextPane();
		nbPeoplex6y10.setText("nbH: " + coordinate.nbPeople);
		coordinatex6y10.add(nbPeoplex6y10);

		// Génération pour x=7, y=0
		coordinate = this.grid.coordinates[7][0];
		JPanel coordinatex7y0 = new JPanel();
		if (coordinate.isBase) {
			coordinatex7y0.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex7y0.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex7y0.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex7y0);
		JTextPane robotsNamesx7y0 = new JTextPane();
		robotsNamesx7y0.setText("R: " + coordinate.getRobots());
		coordinatex7y0.add(robotsNamesx7y0);
		JTextPane nbPeoplex7y0 = new JTextPane();
		nbPeoplex7y0.setText("nbH: " + coordinate.nbPeople);
		coordinatex7y0.add(nbPeoplex7y0);

		// Génération pour x=7, y=1
		coordinate = this.grid.coordinates[7][1];
		JPanel coordinatex7y1 = new JPanel();
		if (coordinate.isBase) {
			coordinatex7y1.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex7y1.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex7y1.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex7y1);
		JTextPane robotsNamesx7y1 = new JTextPane();
		robotsNamesx7y1.setText("R: " + coordinate.getRobots());
		coordinatex7y1.add(robotsNamesx7y1);
		JTextPane nbPeoplex7y1 = new JTextPane();
		nbPeoplex7y1.setText("nbH: " + coordinate.nbPeople);
		coordinatex7y1.add(nbPeoplex7y1);

		// Génération pour x=7, y=2
		coordinate = this.grid.coordinates[7][2];
		JPanel coordinatex7y2 = new JPanel();
		if (coordinate.isBase) {
			coordinatex7y2.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex7y2.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex7y2.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex7y2);
		JTextPane robotsNamesx7y2 = new JTextPane();
		robotsNamesx7y2.setText("R: " + coordinate.getRobots());
		coordinatex7y2.add(robotsNamesx7y2);
		JTextPane nbPeoplex7y2 = new JTextPane();
		nbPeoplex7y2.setText("nbH: " + coordinate.nbPeople);
		coordinatex7y2.add(nbPeoplex7y2);

		// Génération pour x=7, y=3
		coordinate = this.grid.coordinates[7][3];
		JPanel coordinatex7y3 = new JPanel();
		if (coordinate.isBase) {
			coordinatex7y3.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex7y3.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex7y3.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex7y3);
		JTextPane robotsNamesx7y3 = new JTextPane();
		robotsNamesx7y3.setText("R: " + coordinate.getRobots());
		coordinatex7y3.add(robotsNamesx7y3);
		JTextPane nbPeoplex7y3 = new JTextPane();
		nbPeoplex7y3.setText("nbH: " + coordinate.nbPeople);
		coordinatex7y3.add(nbPeoplex7y3);

		// Génération pour x=7, y=4
		coordinate = this.grid.coordinates[7][4];
		JPanel coordinatex7y4 = new JPanel();
		if (coordinate.isBase) {
			coordinatex7y4.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex7y4.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex7y4.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex7y4);
		JTextPane robotsNamesx7y4 = new JTextPane();
		robotsNamesx7y4.setText("R: " + coordinate.getRobots());
		coordinatex7y4.add(robotsNamesx7y4);
		JTextPane nbPeoplex7y4 = new JTextPane();
		nbPeoplex7y4.setText("nbH: " + coordinate.nbPeople);
		coordinatex7y4.add(nbPeoplex7y4);

		// Génération pour x=7, y=5
		coordinate = this.grid.coordinates[7][5];
		JPanel coordinatex7y5 = new JPanel();
		if (coordinate.isBase) {
			coordinatex7y5.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex7y5.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex7y5.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex7y5);
		JTextPane robotsNamesx7y5 = new JTextPane();
		robotsNamesx7y5.setText("R: " + coordinate.getRobots());
		coordinatex7y5.add(robotsNamesx7y5);
		JTextPane nbPeoplex7y5 = new JTextPane();
		nbPeoplex7y5.setText("nbH: " + coordinate.nbPeople);
		coordinatex7y5.add(nbPeoplex7y5);

		// Génération pour x=7, y=6
		coordinate = this.grid.coordinates[7][6];
		JPanel coordinatex7y6 = new JPanel();
		if (coordinate.isBase) {
			coordinatex7y6.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex7y6.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex7y6.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex7y6);
		JTextPane robotsNamesx7y6 = new JTextPane();
		robotsNamesx7y6.setText("R: " + coordinate.getRobots());
		coordinatex7y6.add(robotsNamesx7y6);
		JTextPane nbPeoplex7y6 = new JTextPane();
		nbPeoplex7y6.setText("nbH: " + coordinate.nbPeople);
		coordinatex7y6.add(nbPeoplex7y6);

		// Génération pour x=7, y=7
		coordinate = this.grid.coordinates[7][7];
		JPanel coordinatex7y7 = new JPanel();
		if (coordinate.isBase) {
			coordinatex7y7.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex7y7.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex7y7.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex7y7);
		JTextPane robotsNamesx7y7 = new JTextPane();
		robotsNamesx7y7.setText("R: " + coordinate.getRobots());
		coordinatex7y7.add(robotsNamesx7y7);
		JTextPane nbPeoplex7y7 = new JTextPane();
		nbPeoplex7y7.setText("nbH: " + coordinate.nbPeople);
		coordinatex7y7.add(nbPeoplex7y7);

		// Génération pour x=7, y=8
		coordinate = this.grid.coordinates[7][8];
		JPanel coordinatex7y8 = new JPanel();
		if (coordinate.isBase) {
			coordinatex7y8.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex7y8.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex7y8.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex7y8);
		JTextPane robotsNamesx7y8 = new JTextPane();
		robotsNamesx7y8.setText("R: " + coordinate.getRobots());
		coordinatex7y8.add(robotsNamesx7y8);
		JTextPane nbPeoplex7y8 = new JTextPane();
		nbPeoplex7y8.setText("nbH: " + coordinate.nbPeople);
		coordinatex7y8.add(nbPeoplex7y8);

		// Génération pour x=7, y=9
		coordinate = this.grid.coordinates[7][9];
		JPanel coordinatex7y9 = new JPanel();
		if (coordinate.isBase) {
			coordinatex7y9.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex7y9.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex7y9.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex7y9);
		JTextPane robotsNamesx7y9 = new JTextPane();
		robotsNamesx7y9.setText("R: " + coordinate.getRobots());
		coordinatex7y9.add(robotsNamesx7y9);
		JTextPane nbPeoplex7y9 = new JTextPane();
		nbPeoplex7y9.setText("nbH: " + coordinate.nbPeople);
		coordinatex7y9.add(nbPeoplex7y9);

		// Génération pour x=7, y=10
		coordinate = this.grid.coordinates[7][10];
		JPanel coordinatex7y10 = new JPanel();
		if (coordinate.isBase) {
			coordinatex7y10.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex7y10.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex7y10.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex7y10);
		JTextPane robotsNamesx7y10 = new JTextPane();
		robotsNamesx7y10.setText("R: " + coordinate.getRobots());
		coordinatex7y10.add(robotsNamesx7y10);
		JTextPane nbPeoplex7y10 = new JTextPane();
		nbPeoplex7y10.setText("nbH: " + coordinate.nbPeople);
		coordinatex7y10.add(nbPeoplex7y10);

		// Génération pour x=8, y=0
		coordinate = this.grid.coordinates[8][0];
		JPanel coordinatex8y0 = new JPanel();
		if (coordinate.isBase) {
			coordinatex8y0.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex8y0.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex8y0.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex8y0);
		JTextPane robotsNamesx8y0 = new JTextPane();
		robotsNamesx8y0.setText("R: " + coordinate.getRobots());
		coordinatex8y0.add(robotsNamesx8y0);
		JTextPane nbPeoplex8y0 = new JTextPane();
		nbPeoplex8y0.setText("nbH: " + coordinate.nbPeople);
		coordinatex8y0.add(nbPeoplex8y0);

		// Génération pour x=8, y=1
		coordinate = this.grid.coordinates[8][1];
		JPanel coordinatex8y1 = new JPanel();
		if (coordinate.isBase) {
			coordinatex8y1.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex8y1.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex8y1.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex8y1);
		JTextPane robotsNamesx8y1 = new JTextPane();
		robotsNamesx8y1.setText("R: " + coordinate.getRobots());
		coordinatex8y1.add(robotsNamesx8y1);
		JTextPane nbPeoplex8y1 = new JTextPane();
		nbPeoplex8y1.setText("nbH: " + coordinate.nbPeople);
		coordinatex8y1.add(nbPeoplex8y1);

		// Génération pour x=8, y=2
		coordinate = this.grid.coordinates[8][2];
		JPanel coordinatex8y2 = new JPanel();
		if (coordinate.isBase) {
			coordinatex8y2.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex8y2.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex8y2.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex8y2);
		JTextPane robotsNamesx8y2 = new JTextPane();
		robotsNamesx8y2.setText("R: " + coordinate.getRobots());
		coordinatex8y2.add(robotsNamesx8y2);
		JTextPane nbPeoplex8y2 = new JTextPane();
		nbPeoplex8y2.setText("nbH: " + coordinate.nbPeople);
		coordinatex8y2.add(nbPeoplex8y2);

		// Génération pour x=8, y=3
		coordinate = this.grid.coordinates[8][3];
		JPanel coordinatex8y3 = new JPanel();
		if (coordinate.isBase) {
			coordinatex8y3.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex8y3.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex8y3.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex8y3);
		JTextPane robotsNamesx8y3 = new JTextPane();
		robotsNamesx8y3.setText("R: " + coordinate.getRobots());
		coordinatex8y3.add(robotsNamesx8y3);
		JTextPane nbPeoplex8y3 = new JTextPane();
		nbPeoplex8y3.setText("nbH: " + coordinate.nbPeople);
		coordinatex8y3.add(nbPeoplex8y3);

		// Génération pour x=8, y=4
		coordinate = this.grid.coordinates[8][4];
		JPanel coordinatex8y4 = new JPanel();
		if (coordinate.isBase) {
			coordinatex8y4.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex8y4.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex8y4.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex8y4);
		JTextPane robotsNamesx8y4 = new JTextPane();
		robotsNamesx8y4.setText("R: " + coordinate.getRobots());
		coordinatex8y4.add(robotsNamesx8y4);
		JTextPane nbPeoplex8y4 = new JTextPane();
		nbPeoplex8y4.setText("nbH: " + coordinate.nbPeople);
		coordinatex8y4.add(nbPeoplex8y4);

		// Génération pour x=8, y=5
		coordinate = this.grid.coordinates[8][5];
		JPanel coordinatex8y5 = new JPanel();
		if (coordinate.isBase) {
			coordinatex8y5.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex8y5.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex8y5.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex8y5);
		JTextPane robotsNamesx8y5 = new JTextPane();
		robotsNamesx8y5.setText("R: " + coordinate.getRobots());
		coordinatex8y5.add(robotsNamesx8y5);
		JTextPane nbPeoplex8y5 = new JTextPane();
		nbPeoplex8y5.setText("nbH: " + coordinate.nbPeople);
		coordinatex8y5.add(nbPeoplex8y5);

		// Génération pour x=8, y=6
		coordinate = this.grid.coordinates[8][6];
		JPanel coordinatex8y6 = new JPanel();
		if (coordinate.isBase) {
			coordinatex8y6.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex8y6.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex8y6.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex8y6);
		JTextPane robotsNamesx8y6 = new JTextPane();
		robotsNamesx8y6.setText("R: " + coordinate.getRobots());
		coordinatex8y6.add(robotsNamesx8y6);
		JTextPane nbPeoplex8y6 = new JTextPane();
		nbPeoplex8y6.setText("nbH: " + coordinate.nbPeople);
		coordinatex8y6.add(nbPeoplex8y6);

		// Génération pour x=8, y=7
		coordinate = this.grid.coordinates[8][7];
		JPanel coordinatex8y7 = new JPanel();
		if (coordinate.isBase) {
			coordinatex8y7.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex8y7.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex8y7.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex8y7);
		JTextPane robotsNamesx8y7 = new JTextPane();
		robotsNamesx8y7.setText("R: " + coordinate.getRobots());
		coordinatex8y7.add(robotsNamesx8y7);
		JTextPane nbPeoplex8y7 = new JTextPane();
		nbPeoplex8y7.setText("nbH: " + coordinate.nbPeople);
		coordinatex8y7.add(nbPeoplex8y7);

		// Génération pour x=8, y=8
		coordinate = this.grid.coordinates[8][8];
		JPanel coordinatex8y8 = new JPanel();
		if (coordinate.isBase) {
			coordinatex8y8.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex8y8.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex8y8.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex8y8);
		JTextPane robotsNamesx8y8 = new JTextPane();
		robotsNamesx8y8.setText("R: " + coordinate.getRobots());
		coordinatex8y8.add(robotsNamesx8y8);
		JTextPane nbPeoplex8y8 = new JTextPane();
		nbPeoplex8y8.setText("nbH: " + coordinate.nbPeople);
		coordinatex8y8.add(nbPeoplex8y8);

		// Génération pour x=8, y=9
		coordinate = this.grid.coordinates[8][9];
		JPanel coordinatex8y9 = new JPanel();
		if (coordinate.isBase) {
			coordinatex8y9.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex8y9.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex8y9.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex8y9);
		JTextPane robotsNamesx8y9 = new JTextPane();
		robotsNamesx8y9.setText("R: " + coordinate.getRobots());
		coordinatex8y9.add(robotsNamesx8y9);
		JTextPane nbPeoplex8y9 = new JTextPane();
		nbPeoplex8y9.setText("nbH: " + coordinate.nbPeople);
		coordinatex8y9.add(nbPeoplex8y9);

		// Génération pour x=8, y=10
		coordinate = this.grid.coordinates[8][10];
		JPanel coordinatex8y10 = new JPanel();
		if (coordinate.isBase) {
			coordinatex8y10.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex8y10.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex8y10.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex8y10);
		JTextPane robotsNamesx8y10 = new JTextPane();
		robotsNamesx8y10.setText("R: " + coordinate.getRobots());
		coordinatex8y10.add(robotsNamesx8y10);
		JTextPane nbPeoplex8y10 = new JTextPane();
		nbPeoplex8y10.setText("nbH: " + coordinate.nbPeople);
		coordinatex8y10.add(nbPeoplex8y10);

		// Génération pour x=9, y=0
		coordinate = this.grid.coordinates[9][0];
		JPanel coordinatex9y0 = new JPanel();
		if (coordinate.isBase) {
			coordinatex9y0.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex9y0.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex9y0.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex9y0);
		JTextPane robotsNamesx9y0 = new JTextPane();
		robotsNamesx9y0.setText("R: " + coordinate.getRobots());
		coordinatex9y0.add(robotsNamesx9y0);
		JTextPane nbPeoplex9y0 = new JTextPane();
		nbPeoplex9y0.setText("nbH: " + coordinate.nbPeople);
		coordinatex9y0.add(nbPeoplex9y0);

		// Génération pour x=9, y=1
		coordinate = this.grid.coordinates[9][1];
		JPanel coordinatex9y1 = new JPanel();
		if (coordinate.isBase) {
			coordinatex9y1.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex9y1.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex9y1.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex9y1);
		JTextPane robotsNamesx9y1 = new JTextPane();
		robotsNamesx9y1.setText("R: " + coordinate.getRobots());
		coordinatex9y1.add(robotsNamesx9y1);
		JTextPane nbPeoplex9y1 = new JTextPane();
		nbPeoplex9y1.setText("nbH: " + coordinate.nbPeople);
		coordinatex9y1.add(nbPeoplex9y1);

		// Génération pour x=9, y=2
		coordinate = this.grid.coordinates[9][2];
		JPanel coordinatex9y2 = new JPanel();
		if (coordinate.isBase) {
			coordinatex9y2.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex9y2.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex9y2.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex9y2);
		JTextPane robotsNamesx9y2 = new JTextPane();
		robotsNamesx9y2.setText("R: " + coordinate.getRobots());
		coordinatex9y2.add(robotsNamesx9y2);
		JTextPane nbPeoplex9y2 = new JTextPane();
		nbPeoplex9y2.setText("nbH: " + coordinate.nbPeople);
		coordinatex9y2.add(nbPeoplex9y2);

		// Génération pour x=9, y=3
		coordinate = this.grid.coordinates[9][3];
		JPanel coordinatex9y3 = new JPanel();
		if (coordinate.isBase) {
			coordinatex9y3.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex9y3.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex9y3.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex9y3);
		JTextPane robotsNamesx9y3 = new JTextPane();
		robotsNamesx9y3.setText("R: " + coordinate.getRobots());
		coordinatex9y3.add(robotsNamesx9y3);
		JTextPane nbPeoplex9y3 = new JTextPane();
		nbPeoplex9y3.setText("nbH: " + coordinate.nbPeople);
		coordinatex9y3.add(nbPeoplex9y3);

		// Génération pour x=9, y=4
		coordinate = this.grid.coordinates[9][4];
		JPanel coordinatex9y4 = new JPanel();
		if (coordinate.isBase) {
			coordinatex9y4.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex9y4.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex9y4.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex9y4);
		JTextPane robotsNamesx9y4 = new JTextPane();
		robotsNamesx9y4.setText("R: " + coordinate.getRobots());
		coordinatex9y4.add(robotsNamesx9y4);
		JTextPane nbPeoplex9y4 = new JTextPane();
		nbPeoplex9y4.setText("nbH: " + coordinate.nbPeople);
		coordinatex9y4.add(nbPeoplex9y4);

		// Génération pour x=9, y=5
		coordinate = this.grid.coordinates[9][5];
		JPanel coordinatex9y5 = new JPanel();
		if (coordinate.isBase) {
			coordinatex9y5.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex9y5.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex9y5.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex9y5);
		JTextPane robotsNamesx9y5 = new JTextPane();
		robotsNamesx9y5.setText("R: " + coordinate.getRobots());
		coordinatex9y5.add(robotsNamesx9y5);
		JTextPane nbPeoplex9y5 = new JTextPane();
		nbPeoplex9y5.setText("nbH: " + coordinate.nbPeople);
		coordinatex9y5.add(nbPeoplex9y5);

		// Génération pour x=9, y=6
		coordinate = this.grid.coordinates[9][6];
		JPanel coordinatex9y6 = new JPanel();
		if (coordinate.isBase) {
			coordinatex9y6.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex9y6.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex9y6.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex9y6);
		JTextPane robotsNamesx9y6 = new JTextPane();
		robotsNamesx9y6.setText("R: " + coordinate.getRobots());
		coordinatex9y6.add(robotsNamesx9y6);
		JTextPane nbPeoplex9y6 = new JTextPane();
		nbPeoplex9y6.setText("nbH: " + coordinate.nbPeople);
		coordinatex9y6.add(nbPeoplex9y6);

		// Génération pour x=9, y=7
		coordinate = this.grid.coordinates[9][7];
		JPanel coordinatex9y7 = new JPanel();
		if (coordinate.isBase) {
			coordinatex9y7.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex9y7.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex9y7.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex9y7);
		JTextPane robotsNamesx9y7 = new JTextPane();
		robotsNamesx9y7.setText("R: " + coordinate.getRobots());
		coordinatex9y7.add(robotsNamesx9y7);
		JTextPane nbPeoplex9y7 = new JTextPane();
		nbPeoplex9y7.setText("nbH: " + coordinate.nbPeople);
		coordinatex9y7.add(nbPeoplex9y7);

		// Génération pour x=9, y=8
		coordinate = this.grid.coordinates[9][8];
		JPanel coordinatex9y8 = new JPanel();
		if (coordinate.isBase) {
			coordinatex9y8.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex9y8.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex9y8.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex9y8);
		JTextPane robotsNamesx9y8 = new JTextPane();
		robotsNamesx9y8.setText("R: " + coordinate.getRobots());
		coordinatex9y8.add(robotsNamesx9y8);
		JTextPane nbPeoplex9y8 = new JTextPane();
		nbPeoplex9y8.setText("nbH: " + coordinate.nbPeople);
		coordinatex9y8.add(nbPeoplex9y8);

		// Génération pour x=9, y=9
		coordinate = this.grid.coordinates[9][9];
		JPanel coordinatex9y9 = new JPanel();
		if (coordinate.isBase) {
			coordinatex9y9.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex9y9.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex9y9.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex9y9);
		JTextPane robotsNamesx9y9 = new JTextPane();
		robotsNamesx9y9.setText("R: " + coordinate.getRobots());
		coordinatex9y9.add(robotsNamesx9y9);
		JTextPane nbPeoplex9y9 = new JTextPane();
		nbPeoplex9y9.setText("nbH: " + coordinate.nbPeople);
		coordinatex9y9.add(nbPeoplex9y9);

		// Génération pour x=9, y=10
		coordinate = this.grid.coordinates[9][10];
		JPanel coordinatex9y10 = new JPanel();
		if (coordinate.isBase) {
			coordinatex9y10.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex9y10.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex9y10.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex9y10);
		JTextPane robotsNamesx9y10 = new JTextPane();
		robotsNamesx9y10.setText("R: " + coordinate.getRobots());
		coordinatex9y10.add(robotsNamesx9y10);
		JTextPane nbPeoplex9y10 = new JTextPane();
		nbPeoplex9y10.setText("nbH: " + coordinate.nbPeople);
		coordinatex9y10.add(nbPeoplex9y10);

		// Génération pour x=10, y=0
		coordinate = this.grid.coordinates[10][0];
		JPanel coordinatex10y0 = new JPanel();
		if (coordinate.isBase) {
			coordinatex10y0.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex10y0.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex10y0.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex10y0);
		JTextPane robotsNamesx10y0 = new JTextPane();
		robotsNamesx10y0.setText("R: " + coordinate.getRobots());
		coordinatex10y0.add(robotsNamesx10y0);
		JTextPane nbPeoplex10y0 = new JTextPane();
		nbPeoplex10y0.setText("nbH: " + coordinate.nbPeople);
		coordinatex10y0.add(nbPeoplex10y0);

		// Génération pour x=10, y=1
		coordinate = this.grid.coordinates[10][1];
		JPanel coordinatex10y1 = new JPanel();
		if (coordinate.isBase) {
			coordinatex10y1.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex10y1.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex10y1.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex10y1);
		JTextPane robotsNamesx10y1 = new JTextPane();
		robotsNamesx10y1.setText("R: " + coordinate.getRobots());
		coordinatex10y1.add(robotsNamesx10y1);
		JTextPane nbPeoplex10y1 = new JTextPane();
		nbPeoplex10y1.setText("nbH: " + coordinate.nbPeople);
		coordinatex10y1.add(nbPeoplex10y1);

		// Génération pour x=10, y=2
		coordinate = this.grid.coordinates[10][2];
		JPanel coordinatex10y2 = new JPanel();
		if (coordinate.isBase) {
			coordinatex10y2.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex10y2.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex10y2.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex10y2);
		JTextPane robotsNamesx10y2 = new JTextPane();
		robotsNamesx10y2.setText("R: " + coordinate.getRobots());
		coordinatex10y2.add(robotsNamesx10y2);
		JTextPane nbPeoplex10y2 = new JTextPane();
		nbPeoplex10y2.setText("nbH: " + coordinate.nbPeople);
		coordinatex10y2.add(nbPeoplex10y2);

		// Génération pour x=10, y=3
		coordinate = this.grid.coordinates[10][3];
		JPanel coordinatex10y3 = new JPanel();
		if (coordinate.isBase) {
			coordinatex10y3.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex10y3.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex10y3.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex10y3);
		JTextPane robotsNamesx10y3 = new JTextPane();
		robotsNamesx10y3.setText("R: " + coordinate.getRobots());
		coordinatex10y3.add(robotsNamesx10y3);
		JTextPane nbPeoplex10y3 = new JTextPane();
		nbPeoplex10y3.setText("nbH: " + coordinate.nbPeople);
		coordinatex10y3.add(nbPeoplex10y3);

		// Génération pour x=10, y=4
		coordinate = this.grid.coordinates[10][4];
		JPanel coordinatex10y4 = new JPanel();
		if (coordinate.isBase) {
			coordinatex10y4.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex10y4.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex10y4.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex10y4);
		JTextPane robotsNamesx10y4 = new JTextPane();
		robotsNamesx10y4.setText("R: " + coordinate.getRobots());
		coordinatex10y4.add(robotsNamesx10y4);
		JTextPane nbPeoplex10y4 = new JTextPane();
		nbPeoplex10y4.setText("nbH: " + coordinate.nbPeople);
		coordinatex10y4.add(nbPeoplex10y4);

		// Génération pour x=10, y=5
		coordinate = this.grid.coordinates[10][5];
		JPanel coordinatex10y5 = new JPanel();
		if (coordinate.isBase) {
			coordinatex10y5.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex10y5.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex10y5.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex10y5);
		JTextPane robotsNamesx10y5 = new JTextPane();
		robotsNamesx10y5.setText("R: " + coordinate.getRobots());
		coordinatex10y5.add(robotsNamesx10y5);
		JTextPane nbPeoplex10y5 = new JTextPane();
		nbPeoplex10y5.setText("nbH: " + coordinate.nbPeople);
		coordinatex10y5.add(nbPeoplex10y5);

		// Génération pour x=10, y=6
		coordinate = this.grid.coordinates[10][6];
		JPanel coordinatex10y6 = new JPanel();
		if (coordinate.isBase) {
			coordinatex10y6.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex10y6.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex10y6.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex10y6);
		JTextPane robotsNamesx10y6 = new JTextPane();
		robotsNamesx10y6.setText("R: " + coordinate.getRobots());
		coordinatex10y6.add(robotsNamesx10y6);
		JTextPane nbPeoplex10y6 = new JTextPane();
		nbPeoplex10y6.setText("nbH: " + coordinate.nbPeople);
		coordinatex10y6.add(nbPeoplex10y6);

		// Génération pour x=10, y=7
		coordinate = this.grid.coordinates[10][7];
		JPanel coordinatex10y7 = new JPanel();
		if (coordinate.isBase) {
			coordinatex10y7.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex10y7.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex10y7.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex10y7);
		JTextPane robotsNamesx10y7 = new JTextPane();
		robotsNamesx10y7.setText("R: " + coordinate.getRobots());
		coordinatex10y7.add(robotsNamesx10y7);
		JTextPane nbPeoplex10y7 = new JTextPane();
		nbPeoplex10y7.setText("nbH: " + coordinate.nbPeople);
		coordinatex10y7.add(nbPeoplex10y7);

		// Génération pour x=10, y=8
		coordinate = this.grid.coordinates[10][8];
		JPanel coordinatex10y8 = new JPanel();
		if (coordinate.isBase) {
			coordinatex10y8.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex10y8.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex10y8.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex10y8);
		JTextPane robotsNamesx10y8 = new JTextPane();
		robotsNamesx10y8.setText("R: " + coordinate.getRobots());
		coordinatex10y8.add(robotsNamesx10y8);
		JTextPane nbPeoplex10y8 = new JTextPane();
		nbPeoplex10y8.setText("nbH: " + coordinate.nbPeople);
		coordinatex10y8.add(nbPeoplex10y8);

		// Génération pour x=10, y=9
		coordinate = this.grid.coordinates[10][9];
		JPanel coordinatex10y9 = new JPanel();
		if (coordinate.isBase) {
			coordinatex10y9.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex10y9.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex10y9.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex10y9);
		JTextPane robotsNamesx10y9 = new JTextPane();
		robotsNamesx10y9.setText("R: " + coordinate.getRobots());
		coordinatex10y9.add(robotsNamesx10y9);
		JTextPane nbPeoplex10y9 = new JTextPane();
		nbPeoplex10y9.setText("nbH: " + coordinate.nbPeople);
		coordinatex10y9.add(nbPeoplex10y9);

		// Génération pour x=10, y=10
		coordinate = this.grid.coordinates[10][10];
		JPanel coordinatex10y10 = new JPanel();
		if (coordinate.isBase) {
			coordinatex10y10.setBackground(new Color(200, 200, 0));
		} else if (coordinate.isFire) {
			coordinatex10y10.setBackground(new Color(255, 0, 0));
		} else {
			coordinatex10y10.setBackground(new Color(0, 200, 0));
		}
		gridPanel.add(coordinatex10y10);
		JTextPane robotsNamesx10y10 = new JTextPane();
		robotsNamesx10y10.setText("R: " + coordinate.getRobots());
		coordinatex10y10.add(robotsNamesx10y10);
		JTextPane nbPeoplex10y10 = new JTextPane();
		nbPeoplex10y10.setText("nbH: " + coordinate.nbPeople);
		coordinatex10y10.add(nbPeoplex10y10);

	}
}