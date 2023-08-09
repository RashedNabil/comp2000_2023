import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Main window = new Main();
        });
    }

    class Canvas extends JPanel {
        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Set the cell size and offset values
            int cellSize = 35;
            int xOffset = 10;
            int yOffset = 10;

            // Draw the grid
            for (int x = 0; x < 20; x++) {
                for (int y = 0; y < 20; y++) {
                    int xPos = xOffset + x * cellSize;
                    int yPos = yOffset + y * cellSize;

                    g.drawRect(xPos, yPos, cellSize, cellSize);
                }
            }
        }
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }
}
