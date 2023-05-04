import javax.swing.*;
import java.net.URL;

public class NewClass extends JFrame {

    public NewClass() {
        super("My Frame");

        // Get the URL of the image using a relative path
        URL imageURL = getClass().getResource("folder\\02.PNG");

        // Create an ImageIcon using the image URL
        ImageIcon icon = new ImageIcon(imageURL);

        // Create a JLabel and set its icon to the loaded image
        JLabel label = new JLabel(icon);

        // Add the label to the frame
        add(label);

        // Set the size of the frame
        setSize(300, 300);

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        new NewClass();
    }
}
