package mail.akshat.calc;
import javax.swing.*;
import java.awt.*;

public class IconExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("My Application");

        // Load the icon image
        Image icon = Toolkit.getDefaultToolkit().getImage("c.png");

        // Set the icon image
        frame.setIconImage(icon);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the frame
        frame.setSize(400, 300);

        // Make the frame visible
        frame.setVisible(true);
    }
}