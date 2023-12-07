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

	private Grid grid = Grid.getInstance();
	private JTable table;

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

	/**
	 * Create the frame.
	 */
	public Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(4, 5));

		JPanel header = new JPanel();
		contentPane.add(header, BorderLayout.NORTH);

		JPanel grid = new JPanel();
		contentPane.add(grid, BorderLayout.CENTER);
		grid.setLayout(new GridLayout(11, 11, 0, 0));

		// Génération pour x=0, y=0
		JPanel coordinatex0y0 = new JPanel();
		grid.add(coordinatex0y0);
		JTextPane robotsNamesx0y0 = new JTextPane();
		robotsNamesx0y0.setText(this.grid.coordinates[0][0].getRobots());
		coordinatex0y0.add(robotsNamesx0y0);
		JTextPane nbPeoplex0y0 = new JTextPane();
		nbPeoplex0y0.setText("" + this.grid.coordinates[0][0].nbPeople);
		coordinatex0y0.add(nbPeoplex0y0);

		// Génération pour x=0, y=1
		JPanel coordinatex0y1 = new JPanel();
		grid.add(coordinatex0y1);
		JTextPane robotsNamesx0y1 = new JTextPane();
		robotsNamesx0y1.setText(this.grid.coordinates[0][1].getRobots());
		coordinatex0y1.add(robotsNamesx0y1);
		JTextPane nbPeoplex0y1 = new JTextPane();
		nbPeoplex0y1.setText("" + this.grid.coordinates[0][1].nbPeople);
		coordinatex0y1.add(nbPeoplex0y1);

		// Génération pour x=0, y=2
		JPanel coordinatex0y2 = new JPanel();
		grid.add(coordinatex0y2);
		JTextPane robotsNamesx0y2 = new JTextPane();
		robotsNamesx0y2.setText(this.grid.coordinates[0][2].getRobots());
		coordinatex0y2.add(robotsNamesx0y2);
		JTextPane nbPeoplex0y2 = new JTextPane();
		nbPeoplex0y2.setText("" + this.grid.coordinates[0][2].nbPeople);
		coordinatex0y2.add(nbPeoplex0y2);

		// Génération pour x=0, y=3
		JPanel coordinatex0y3 = new JPanel();
		grid.add(coordinatex0y3);
		JTextPane robotsNamesx0y3 = new JTextPane();
		robotsNamesx0y3.setText(this.grid.coordinates[0][3].getRobots());
		coordinatex0y3.add(robotsNamesx0y3);
		JTextPane nbPeoplex0y3 = new JTextPane();
		nbPeoplex0y3.setText("" + this.grid.coordinates[0][3].nbPeople);
		coordinatex0y3.add(nbPeoplex0y3);

		// Génération pour x=0, y=4
		JPanel coordinatex0y4 = new JPanel();
		grid.add(coordinatex0y4);
		JTextPane robotsNamesx0y4 = new JTextPane();
		robotsNamesx0y4.setText(this.grid.coordinates[0][4].getRobots());
		coordinatex0y4.add(robotsNamesx0y4);
		JTextPane nbPeoplex0y4 = new JTextPane();
		nbPeoplex0y4.setText("" + this.grid.coordinates[0][4].nbPeople);
		coordinatex0y4.add(nbPeoplex0y4);

		// Génération pour x=0, y=5
		JPanel coordinatex0y5 = new JPanel();
		grid.add(coordinatex0y5);
		JTextPane robotsNamesx0y5 = new JTextPane();
		robotsNamesx0y5.setText(this.grid.coordinates[0][5].getRobots());
		coordinatex0y5.add(robotsNamesx0y5);
		JTextPane nbPeoplex0y5 = new JTextPane();
		nbPeoplex0y5.setText("" + this.grid.coordinates[0][5].nbPeople);
		coordinatex0y5.add(nbPeoplex0y5);

		// Génération pour x=0, y=6
		JPanel coordinatex0y6 = new JPanel();
		grid.add(coordinatex0y6);
		JTextPane robotsNamesx0y6 = new JTextPane();
		robotsNamesx0y6.setText(this.grid.coordinates[0][6].getRobots());
		coordinatex0y6.add(robotsNamesx0y6);
		JTextPane nbPeoplex0y6 = new JTextPane();
		nbPeoplex0y6.setText("" + this.grid.coordinates[0][6].nbPeople);
		coordinatex0y6.add(nbPeoplex0y6);

		// Génération pour x=0, y=7
		JPanel coordinatex0y7 = new JPanel();
		grid.add(coordinatex0y7);
		JTextPane robotsNamesx0y7 = new JTextPane();
		robotsNamesx0y7.setText(this.grid.coordinates[0][7].getRobots());
		coordinatex0y7.add(robotsNamesx0y7);
		JTextPane nbPeoplex0y7 = new JTextPane();
		nbPeoplex0y7.setText("" + this.grid.coordinates[0][7].nbPeople);
		coordinatex0y7.add(nbPeoplex0y7);

		// Génération pour x=0, y=8
		JPanel coordinatex0y8 = new JPanel();
		grid.add(coordinatex0y8);
		JTextPane robotsNamesx0y8 = new JTextPane();
		robotsNamesx0y8.setText(this.grid.coordinates[0][8].getRobots());
		coordinatex0y8.add(robotsNamesx0y8);
		JTextPane nbPeoplex0y8 = new JTextPane();
		nbPeoplex0y8.setText("" + this.grid.coordinates[0][8].nbPeople);
		coordinatex0y8.add(nbPeoplex0y8);

		// Génération pour x=0, y=9
		JPanel coordinatex0y9 = new JPanel();
		grid.add(coordinatex0y9);
		JTextPane robotsNamesx0y9 = new JTextPane();
		robotsNamesx0y9.setText(this.grid.coordinates[0][9].getRobots());
		coordinatex0y9.add(robotsNamesx0y9);
		JTextPane nbPeoplex0y9 = new JTextPane();
		nbPeoplex0y9.setText("" + this.grid.coordinates[0][9].nbPeople);
		coordinatex0y9.add(nbPeoplex0y9);

		// Génération pour x=0, y=10
		JPanel coordinatex0y10 = new JPanel();
		grid.add(coordinatex0y10);
		JTextPane robotsNamesx0y10 = new JTextPane();
		robotsNamesx0y10.setText(this.grid.coordinates[0][10].getRobots());
		coordinatex0y10.add(robotsNamesx0y10);
		JTextPane nbPeoplex0y10 = new JTextPane();
		nbPeoplex0y10.setText("" + this.grid.coordinates[0][10].nbPeople);
		coordinatex0y10.add(nbPeoplex0y10);

		// Génération pour x=1, y=0
		JPanel coordinatex1y0 = new JPanel();
		grid.add(coordinatex1y0);
		JTextPane robotsNamesx1y0 = new JTextPane();
		robotsNamesx1y0.setText(this.grid.coordinates[1][0].getRobots());
		coordinatex1y0.add(robotsNamesx1y0);
		JTextPane nbPeoplex1y0 = new JTextPane();
		nbPeoplex1y0.setText("" + this.grid.coordinates[1][0].nbPeople);
		coordinatex1y0.add(nbPeoplex1y0);

		// Génération pour x=1, y=1
		JPanel coordinatex1y1 = new JPanel();
		grid.add(coordinatex1y1);
		JTextPane robotsNamesx1y1 = new JTextPane();
		robotsNamesx1y1.setText(this.grid.coordinates[1][1].getRobots());
		coordinatex1y1.add(robotsNamesx1y1);
		JTextPane nbPeoplex1y1 = new JTextPane();
		nbPeoplex1y1.setText("" + this.grid.coordinates[1][1].nbPeople);
		coordinatex1y1.add(nbPeoplex1y1);

		// Génération pour x=1, y=2
		JPanel coordinatex1y2 = new JPanel();
		grid.add(coordinatex1y2);
		JTextPane robotsNamesx1y2 = new JTextPane();
		robotsNamesx1y2.setText(this.grid.coordinates[1][2].getRobots());
		coordinatex1y2.add(robotsNamesx1y2);
		JTextPane nbPeoplex1y2 = new JTextPane();
		nbPeoplex1y2.setText("" + this.grid.coordinates[1][2].nbPeople);
		coordinatex1y2.add(nbPeoplex1y2);

		// Génération pour x=1, y=3
		JPanel coordinatex1y3 = new JPanel();
		grid.add(coordinatex1y3);
		JTextPane robotsNamesx1y3 = new JTextPane();
		robotsNamesx1y3.setText(this.grid.coordinates[1][3].getRobots());
		coordinatex1y3.add(robotsNamesx1y3);
		JTextPane nbPeoplex1y3 = new JTextPane();
		nbPeoplex1y3.setText("" + this.grid.coordinates[1][3].nbPeople);
		coordinatex1y3.add(nbPeoplex1y3);

		// Génération pour x=1, y=4
		JPanel coordinatex1y4 = new JPanel();
		grid.add(coordinatex1y4);
		JTextPane robotsNamesx1y4 = new JTextPane();
		robotsNamesx1y4.setText(this.grid.coordinates[1][4].getRobots());
		coordinatex1y4.add(robotsNamesx1y4);
		JTextPane nbPeoplex1y4 = new JTextPane();
		nbPeoplex1y4.setText("" + this.grid.coordinates[1][4].nbPeople);
		coordinatex1y4.add(nbPeoplex1y4);

		// Génération pour x=1, y=5
		JPanel coordinatex1y5 = new JPanel();
		grid.add(coordinatex1y5);
		JTextPane robotsNamesx1y5 = new JTextPane();
		robotsNamesx1y5.setText(this.grid.coordinates[1][5].getRobots());
		coordinatex1y5.add(robotsNamesx1y5);
		JTextPane nbPeoplex1y5 = new JTextPane();
		nbPeoplex1y5.setText("" + this.grid.coordinates[1][5].nbPeople);
		coordinatex1y5.add(nbPeoplex1y5);

		// Génération pour x=1, y=6
		JPanel coordinatex1y6 = new JPanel();
		grid.add(coordinatex1y6);
		JTextPane robotsNamesx1y6 = new JTextPane();
		robotsNamesx1y6.setText(this.grid.coordinates[1][6].getRobots());
		coordinatex1y6.add(robotsNamesx1y6);
		JTextPane nbPeoplex1y6 = new JTextPane();
		nbPeoplex1y6.setText("" + this.grid.coordinates[1][6].nbPeople);
		coordinatex1y6.add(nbPeoplex1y6);

		// Génération pour x=1, y=7
		JPanel coordinatex1y7 = new JPanel();
		grid.add(coordinatex1y7);
		JTextPane robotsNamesx1y7 = new JTextPane();
		robotsNamesx1y7.setText(this.grid.coordinates[1][7].getRobots());
		coordinatex1y7.add(robotsNamesx1y7);
		JTextPane nbPeoplex1y7 = new JTextPane();
		nbPeoplex1y7.setText("" + this.grid.coordinates[1][7].nbPeople);
		coordinatex1y7.add(nbPeoplex1y7);

		// Génération pour x=1, y=8
		JPanel coordinatex1y8 = new JPanel();
		grid.add(coordinatex1y8);
		JTextPane robotsNamesx1y8 = new JTextPane();
		robotsNamesx1y8.setText(this.grid.coordinates[1][8].getRobots());
		coordinatex1y8.add(robotsNamesx1y8);
		JTextPane nbPeoplex1y8 = new JTextPane();
		nbPeoplex1y8.setText("" + this.grid.coordinates[1][8].nbPeople);
		coordinatex1y8.add(nbPeoplex1y8);

		// Génération pour x=1, y=9
		JPanel coordinatex1y9 = new JPanel();
		grid.add(coordinatex1y9);
		JTextPane robotsNamesx1y9 = new JTextPane();
		robotsNamesx1y9.setText(this.grid.coordinates[1][9].getRobots());
		coordinatex1y9.add(robotsNamesx1y9);
		JTextPane nbPeoplex1y9 = new JTextPane();
		nbPeoplex1y9.setText("" + this.grid.coordinates[1][9].nbPeople);
		coordinatex1y9.add(nbPeoplex1y9);

		// Génération pour x=1, y=10
		JPanel coordinatex1y10 = new JPanel();
		grid.add(coordinatex1y10);
		JTextPane robotsNamesx1y10 = new JTextPane();
		robotsNamesx1y10.setText(this.grid.coordinates[1][10].getRobots());
		coordinatex1y10.add(robotsNamesx1y10);
		JTextPane nbPeoplex1y10 = new JTextPane();
		nbPeoplex1y10.setText("" + this.grid.coordinates[1][10].nbPeople);
		coordinatex1y10.add(nbPeoplex1y10);

		// Génération pour x=2, y=0
JPanel coordinatex2y0 = new JPanel();
grid.add(coordinatex2y0);
JTextPane robotsNamesx2y0 = new JTextPane();
robotsNamesx2y0.setText(this.grid.coordinates[2][0].getRobots());
coordinatex2y0.add(robotsNamesx2y0);
JTextPane nbPeoplex2y0 = new JTextPane();
nbPeoplex2y0.setText("" + this.grid.coordinates[2][0].nbPeople);
coordinatex2y0.add(nbPeoplex2y0);

// Génération pour x=2, y=1
JPanel coordinatex2y1 = new JPanel();
grid.add(coordinatex2y1);
JTextPane robotsNamesx2y1 = new JTextPane();
robotsNamesx2y1.setText(this.grid.coordinates[2][1].getRobots());
coordinatex2y1.add(robotsNamesx2y1);
JTextPane nbPeoplex2y1 = new JTextPane();
nbPeoplex2y1.setText("" + this.grid.coordinates[2][1].nbPeople);
coordinatex2y1.add(nbPeoplex2y1);

// Génération pour x=2, y=2
JPanel coordinatex2y2 = new JPanel();
grid.add(coordinatex2y2);
JTextPane robotsNamesx2y2 = new JTextPane();
robotsNamesx2y2.setText(this.grid.coordinates[2][2].getRobots());
coordinatex2y2.add(robotsNamesx2y2);
JTextPane nbPeoplex2y2 = new JTextPane();
nbPeoplex2y2.setText("" + this.grid.coordinates[2][2].nbPeople);
coordinatex2y2.add(nbPeoplex2y2);

// Génération pour x=2, y=3
JPanel coordinatex2y3 = new JPanel();
grid.add(coordinatex2y3);
JTextPane robotsNamesx2y3 = new JTextPane();
robotsNamesx2y3.setText(this.grid.coordinates[2][3].getRobots());
coordinatex2y3.add(robotsNamesx2y3);
JTextPane nbPeoplex2y3 = new JTextPane();
nbPeoplex2y3.setText("" + this.grid.coordinates[2][3].nbPeople);
coordinatex2y3.add(nbPeoplex2y3);

// Génération pour x=2, y=4
JPanel coordinatex2y4 = new JPanel();
grid.add(coordinatex2y4);
JTextPane robotsNamesx2y4 = new JTextPane();
robotsNamesx2y4.setText(this.grid.coordinates[2][4].getRobots());
coordinatex2y4.add(robotsNamesx2y4);
JTextPane nbPeoplex2y4 = new JTextPane();
nbPeoplex2y4.setText("" + this.grid.coordinates[2][4].nbPeople);
coordinatex2y4.add(nbPeoplex2y4);

// Génération pour x=2, y=5
JPanel coordinatex2y5 = new JPanel();
grid.add(coordinatex2y5);
JTextPane robotsNamesx2y5 = new JTextPane();
robotsNamesx2y5.setText(this.grid.coordinates[2][5].getRobots());
coordinatex2y5.add(robotsNamesx2y5);
JTextPane nbPeoplex2y5 = new JTextPane();
nbPeoplex2y5.setText("" + this.grid.coordinates[2][5].nbPeople);
coordinatex2y5.add(nbPeoplex2y5);

// Génération pour x=2, y=6
JPanel coordinatex2y6 = new JPanel();
grid.add(coordinatex2y6);
JTextPane robotsNamesx2y6 = new JTextPane();
robotsNamesx2y6.setText(this.grid.coordinates[2][6].getRobots());
coordinatex2y6.add(robotsNamesx2y6);
JTextPane nbPeoplex2y6 = new JTextPane();
nbPeoplex2y6.setText("" + this.grid.coordinates[2][6].nbPeople);
coordinatex2y6.add(nbPeoplex2y6);

// Génération pour x=2, y=7
JPanel coordinatex2y7 = new JPanel();
grid.add(coordinatex2y7);
JTextPane robotsNamesx2y7 = new JTextPane();
robotsNamesx2y7.setText(this.grid.coordinates[2][7].getRobots());
coordinatex2y7.add(robotsNamesx2y7);
JTextPane nbPeoplex2y7 = new JTextPane();
nbPeoplex2y7.setText("" + this.grid.coordinates[2][7].nbPeople);
coordinatex2y7.add(nbPeoplex2y7);

// Génération pour x=2, y=8
JPanel coordinatex2y8 = new JPanel();
grid.add(coordinatex2y8);
JTextPane robotsNamesx2y8 = new JTextPane();
robotsNamesx2y8.setText(this.grid.coordinates[2][8].getRobots());
coordinatex2y8.add(robotsNamesx2y8);
JTextPane nbPeoplex2y8 = new JTextPane();
nbPeoplex2y8.setText("" + this.grid.coordinates[2][8].nbPeople);
coordinatex2y8.add(nbPeoplex2y8);

// Génération pour x=2, y=9
JPanel coordinatex2y9 = new JPanel();
grid.add(coordinatex2y9);
JTextPane robotsNamesx2y9 = new JTextPane();
robotsNamesx2y9.setText(this.grid.coordinates[2][9].getRobots());
coordinatex2y9.add(robotsNamesx2y9);
JTextPane nbPeoplex2y9 = new JTextPane();
nbPeoplex2y9.setText("" + this.grid.coordinates[2][9].nbPeople);
coordinatex2y9.add(nbPeoplex2y9);

// Génération pour x=2, y=10
JPanel coordinatex2y10 = new JPanel();
grid.add(coordinatex2y10);
JTextPane robotsNamesx2y10 = new JTextPane();
robotsNamesx2y10.setText(this.grid.coordinates[2][10].getRobots());
coordinatex2y10.add(robotsNamesx2y10);
JTextPane nbPeoplex2y10 = new JTextPane();
nbPeoplex2y10.setText("" + this.grid.coordinates[2][10].nbPeople);
coordinatex2y10.add(nbPeoplex2y10);

// Génération pour x=3, y=0
JPanel coordinatex3y0 = new JPanel();
grid.add(coordinatex3y0);
JTextPane robotsNamesx3y0 = new JTextPane();
robotsNamesx3y0.setText(this.grid.coordinates[3][0].getRobots());
coordinatex3y0.add(robotsNamesx3y0);
JTextPane nbPeoplex3y0 = new JTextPane();
nbPeoplex3y0.setText("" + this.grid.coordinates[3][0].nbPeople);
coordinatex3y0.add(nbPeoplex3y0);

// Génération pour x=3, y=1
JPanel coordinatex3y1 = new JPanel();
grid.add(coordinatex3y1);
JTextPane robotsNamesx3y1 = new JTextPane();
robotsNamesx3y1.setText(this.grid.coordinates[3][1].getRobots());
coordinatex3y1.add(robotsNamesx3y1);
JTextPane nbPeoplex3y1 = new JTextPane();
nbPeoplex3y1.setText("" + this.grid.coordinates[3][1].nbPeople);
coordinatex3y1.add(nbPeoplex3y1);

// Génération pour x=3, y=2
JPanel coordinatex3y2 = new JPanel();
grid.add(coordinatex3y2);
JTextPane robotsNamesx3y2 = new JTextPane();
robotsNamesx3y2.setText(this.grid.coordinates[3][2].getRobots());
coordinatex3y2.add(robotsNamesx3y2);
JTextPane nbPeoplex3y2 = new JTextPane();
nbPeoplex3y2.setText("" + this.grid.coordinates[3][2].nbPeople);
coordinatex3y2.add(nbPeoplex3y2);

// Génération pour x=3, y=3
JPanel coordinatex3y3 = new JPanel();
grid.add(coordinatex3y3);
JTextPane robotsNamesx3y3 = new JTextPane();
robotsNamesx3y3.setText(this.grid.coordinates[3][3].getRobots());
coordinatex3y3.add(robotsNamesx3y3);
JTextPane nbPeoplex3y3 = new JTextPane();
nbPeoplex3y3.setText("" + this.grid.coordinates[3][3].nbPeople);
coordinatex3y3.add(nbPeoplex3y3);

// Génération pour x=3, y=4
JPanel coordinatex3y4 = new JPanel();
grid.add(coordinatex3y4);
JTextPane robotsNamesx3y4 = new JTextPane();
robotsNamesx3y4.setText(this.grid.coordinates[3][4].getRobots());
coordinatex3y4.add(robotsNamesx3y4);
JTextPane nbPeoplex3y4 = new JTextPane();
nbPeoplex3y4.setText("" + this.grid.coordinates[3][4].nbPeople);
coordinatex3y4.add(nbPeoplex3y4);

// Génération pour x=3, y=5
JPanel coordinatex3y5 = new JPanel();
grid.add(coordinatex3y5);
JTextPane robotsNamesx3y5 = new JTextPane();
robotsNamesx3y5.setText(this.grid.coordinates[3][5].getRobots());
coordinatex3y5.add(robotsNamesx3y5);
JTextPane nbPeoplex3y5 = new JTextPane();
nbPeoplex3y5.setText("" + this.grid.coordinates[3][5].nbPeople);
coordinatex3y5.add(nbPeoplex3y5);

// Génération pour x=3, y=6
JPanel coordinatex3y6 = new JPanel();
grid.add(coordinatex3y6);
JTextPane robotsNamesx3y6 = new JTextPane();
robotsNamesx3y6.setText(this.grid.coordinates[3][6].getRobots());
coordinatex3y6.add(robotsNamesx3y6);
JTextPane nbPeoplex3y6 = new JTextPane();
nbPeoplex3y6.setText("" + this.grid.coordinates[3][6].nbPeople);
coordinatex3y6.add(nbPeoplex3y6);

// Génération pour x=3, y=7
JPanel coordinatex3y7 = new JPanel();
grid.add(coordinatex3y7);
JTextPane robotsNamesx3y7 = new JTextPane();
robotsNamesx3y7.setText(this.grid.coordinates[3][7].getRobots());
coordinatex3y7.add(robotsNamesx3y7);
JTextPane nbPeoplex3y7 = new JTextPane();
nbPeoplex3y7.setText("" + this.grid.coordinates[3][7].nbPeople);
coordinatex3y7.add(nbPeoplex3y7);

// Génération pour x=3, y=8
JPanel coordinatex3y8 = new JPanel();
grid.add(coordinatex3y8);
JTextPane robotsNamesx3y8 = new JTextPane();
robotsNamesx3y8.setText(this.grid.coordinates[3][8].getRobots());
coordinatex3y8.add(robotsNamesx3y8);
JTextPane nbPeoplex3y8 = new JTextPane();
nbPeoplex3y8.setText("" + this.grid.coordinates[3][8].nbPeople);
coordinatex3y8.add(nbPeoplex3y8);

// Génération pour x=3, y=9
JPanel coordinatex3y9 = new JPanel();
grid.add(coordinatex3y9);
JTextPane robotsNamesx3y9 = new JTextPane();
robotsNamesx3y9.setText(this.grid.coordinates[3][9].getRobots());
coordinatex3y9.add(robotsNamesx3y9);
JTextPane nbPeoplex3y9 = new JTextPane();
nbPeoplex3y9.setText("" + this.grid.coordinates[3][9].nbPeople);
coordinatex3y9.add(nbPeoplex3y9);

// Génération pour x=3, y=10
JPanel coordinatex3y10 = new JPanel();
grid.add(coordinatex3y10);
JTextPane robotsNamesx3y10 = new JTextPane();
robotsNamesx3y10.setText(this.grid.coordinates[3][9].getRobots());
coordinatex3y10.add(robotsNamesx3y10);
JTextPane nbPeoplex3y10 = new JTextPane();
nbPeoplex3y10.setText("" + this.grid.coordinates[3][9].nbPeople);
coordinatex3y10.add(nbPeoplex3y10);

	}
}