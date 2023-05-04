package net.blackjack.game;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ImageDisplay implements ActionListener{

    private JFrame frame;
    private JButton hitButton, loginButton;
    private JPanel gamePhase, loginPhase;
    private JLabel showCard, title;
    private JTextField playerUserName = new JTextField("Enter your name");//enter player's user name
    private Player player = new Player();
//    Graphics loginBackground;

    public ImageDisplay() {
//        make JFrame
        frame = new JFrame("Image Display");
//        make JPanal
        gamePhase = new JPanel();
        loginPhase = new JPanel();
        
        hitButton = new JButton("Hit");
        title = new JLabel("Untitled-BlackJack");//make game's title
        loginButton = new JButton("Login");//login button
        
        hitButton.addActionListener(this);
        loginButton.addActionListener(this);

        gamePhase.add(hitButton);

        login();
        frame.pack();
        frame.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        //Toolkit.getDefaultToolkit() is a method that returns an instance of the default Toolkit class 
        //getScreenSize() is a method that returns dimension object representing the size of the screen
        //So, We are getting the size of the screen that the Java app is running on (Full screen! :) )
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//can exit with botton X
    }
    
    public void login(){
        JPanel loginPanel = new JPanel();
        JPanel plainPanel1 = new JPanel();
        JPanel plainPanel2 = new JPanel();
        JPanel panel = new JPanel();
        JPanel textfieldPanel = new JPanel();
        JPanel loginButtonPanel = new JPanel();
        
//        loginBackground.drawImage(new ImageIcon("").getImage(), 0, 0, null);
        
        loginPanel.setLayout(new GridLayout(1, 3));
        panel.setLayout(new GridLayout(6, 1));
        textfieldPanel.setLayout(new FlowLayout());
        loginButtonPanel.setLayout(new FlowLayout());
        title.setSize(200, 200);
        title.setFont(new Font("Book Antiqua", Font.BOLD, 50)); //set Font, Font.PLAIN is represent a plain font style
        title.setHorizontalAlignment(SwingConstants.CENTER); //set horizontal alignment to center
        title.setVerticalAlignment(SwingConstants.CENTER); //set vertical alignment to center
        loginButton.setPreferredSize(new Dimension(400, 40));
        playerUserName.setPreferredSize(new Dimension(400, 40));
        
        loginPanel.setBackground(null);
        plainPanel1.setBackground(null);
        plainPanel2.setBackground(null);
        panel.setBackground(null);
        textfieldPanel.setBackground(null);
        loginPanel.setBackground(null);
        
        textfieldPanel.add(playerUserName);
        loginButtonPanel.add(loginButton);
        
        panel.add(textfieldPanel);
        panel.add(loginButtonPanel);

        loginPanel.add(plainPanel1);
        loginPanel.add(panel);
        loginPanel.add(plainPanel2);
             
        loginPhase.setLayout(new GridLayout(2, 1));
        loginPhase.add(title);
        loginPhase.add(loginPanel);
//        loginPhase.paintComponents(loginBackground);
        
        frame.add(loginPhase);
    }

    public void showRandomCard(Card randomCard) {

        Image image  = randomCard.getImage().getImage();//It's ImageIcon icon = randomCard.getImage(); and Image = icon.getImage(); combine together :)
        Image scaledImage = image.getScaledInstance(137, 187, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage); 
        
        showCard = new JLabel(scaledIcon);
        System.out.println(randomCard.getDisplayName());
//        panel.add(image_cards);
        gamePhase.add(showCard);
        gamePhase.add(hitButton);
        frame.add(gamePhase);
        frame.revalidate(); //tells the layout manager to recalculate the layout
        frame.repaint(); //tells Swing that an area of the window is dirty
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == hitButton) {
            Player currentTurn = Judge.getPlayerTurn();
            Card randomCard = Judge.giveCard(currentTurn);
            showRandomCard(randomCard);
        }
        else if (e.getSource() == loginButton){
            player.setName(playerUserName.getText());
            loginPhase.setVisible(false);
            frame.add(gamePhase);
            frame.validate();
        }
    }
}
