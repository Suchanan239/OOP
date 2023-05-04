/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.blackjack.game;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Suchanan
 */
public class FewFewFew extends JFrame {

    public FewFewFew() {
        super("Frame Picture");

        // set the size of the frame
        setSize(400, 400);

        // create a panel to hold the picture
        JPanel panel = new JPanel();

        // create an image icon to display
        ImageIcon icon = new ImageIcon(("resources/A.PNG"));

        // create a label to hold the image
        JLabel label = new JLabel(icon);

        // add the label to the panel
        panel.add(label);

        // add the panel to the frame
        add(panel);

        // center the frame on the screen
        setLocationRelativeTo(null);

        // make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new FewFewFew();
    }
    
}
