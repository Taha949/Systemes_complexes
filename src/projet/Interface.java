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
		
		JPanel coordinate00 = new JPanel();
		grid.add(coordinate00);

		JTextPane robotsNames00 = new JTextPane();
		robotsNames00.setText("" + this.grid.coordinates[0][0].nbPeople);
		coordinate00.add(robotsNames00);
		
		JTextPane nbPeople = new JTextPane();
		coordinate00.add(nbPeople);
		
		JPanel coordinate01 = new JPanel();
		grid.add(coordinate01);

		JTextPane robotsNames01 = new JTextPane();
		robotsNames01.setText("" + this.grid.coordinates[0][1].nbPeople);
		coordinate01.add(robotsNames01);
		
		JTextPane nbPeople1 = new JTextPane();
		coordinate01.add(nbPeople1);
		
		
	}

}
