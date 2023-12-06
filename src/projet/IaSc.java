package projet;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import projet.Coordinate;
import projet.Grid;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class IaSc extends JFrame {

    private JPanel contentPane;

    private static final int LIGNES = 11;
    private static final int COLONNES = 11;

    private Grid grid;

    private JPanel[][] cells;

    /**
     * Create the frame.
     */
    public IaSc() {
        super("Grid 11*11");
        setResizable(false);

        grid = Grid.getInstance();

        cells = new JPanel[LIGNES][COLONNES];

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 489, 517);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridLayout(1, 0, 0, 0));

        for (int i = 0; i < LIGNES; i++) {
            for (int j = 0; j < COLONNES; j++) {
                JPanel cell = new JPanel();

                Coordinate coordinate = grid.coordinates[i][j];

                if (coordinate.isBase) {
                    cell.setBackground(Color.GREEN);
                } else if (coordinate.isFire) {
                    cell.setBackground(Color.RED);
                } else {
                    cell.setBackground(Color.WHITE);
                }

                cells[i][j] = cell;

                contentPane.add(cell);
            }
        }
    }

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	IaSc frame = new IaSc();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}