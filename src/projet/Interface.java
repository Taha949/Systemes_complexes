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
		
		JPanel coordinate02 = new JPanel();
		grid.add(coordinate02);
		
		JPanel robotsNames02 = new JPanel();
		coordinate02.add(robotsNames02);
		
		JPanel nbPeople2 = new JPanel();
		coordinate02.add(nbPeople2);
		
		JPanel coordinate03 = new JPanel();
		grid.add(coordinate03);
		
		JPanel robotsNames03 = new JPanel();
		coordinate03.add(robotsNames03);
		
		JPanel nbPeople3 = new JPanel();
		coordinate03.add(nbPeople3);
		
		JPanel coordinate04 = new JPanel();
		grid.add(coordinate04);
		
		JPanel robotsNames04 = new JPanel();
		coordinate04.add(robotsNames04);
		
		JPanel nbPeople4 = new JPanel();
		coordinate04.add(nbPeople4);
		
		JPanel coordinate05 = new JPanel();
		grid.add(coordinate05);
		
		JPanel robotsNames05 = new JPanel();
		coordinate05.add(robotsNames05);
		
		JPanel nbPeople05 = new JPanel();
		coordinate05.add(nbPeople05);
		
		JPanel coordinate06 = new JPanel();
		grid.add(coordinate06);
		
		JPanel robotsNames06 = new JPanel();
		coordinate06.add(robotsNames06);
		
		JPanel nbPeople06 = new JPanel();
		coordinate06.add(nbPeople06);
		
		JPanel coordinate07 = new JPanel();
		grid.add(coordinate07);
		
		JPanel robotsNames07 = new JPanel();
		coordinate07.add(robotsNames07);
		
		JPanel nbPeople07 = new JPanel();
		coordinate07.add(nbPeople07);
		
		JPanel coordinate08 = new JPanel();
		grid.add(coordinate08);
		
		JPanel robotsNames08 = new JPanel();
		coordinate08.add(robotsNames08);
		
		JPanel nbPeople08 = new JPanel();
		coordinate08.add(nbPeople08);
		
		JPanel coordinate09 = new JPanel();
		grid.add(coordinate09);
		JPanel coordinate10 = new JPanel();
		grid.add(coordinate010);
		
		
	}

}
