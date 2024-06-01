import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CircleDrawer extends JFrame {

    private DrawingPanel drawingPanel;

    public CircleDrawer() {
        setTitle("Circle Drawer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CircleDrawer frame = new CircleDrawer();
            frame.setVisible(true);
        });
    }

    private class DrawingPanel extends JPanel {
        private int circleX = -1;
        private int circleY = -1;
        private int radius = -1;

        public DrawingPanel() {
            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    circleX = e.getX();
                    circleY = e.getY();
                    String radiusStr = JOptionPane.showInputDialog("Enter the radius of the circle:");
                    if (radiusStr != null) {
                        try {
                            radius = Integer.parseInt(radiusStr);
                            if (radius > 0) {
                                repaint();
                            } else {
                                JOptionPane.showMessageDialog(DrawingPanel.this, "Please enter a positive number.");
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(DrawingPanel.this, "Invalid input. Please enter a number.");
                        }
                    }
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (circleX >= 0 && circleY >= 0 && radius > 0) {
                g.setColor(Color.BLUE);
                g.drawOval(circleX - radius, circleY - radius, radius * 2, radius * 2);
            }
        }
    }
}