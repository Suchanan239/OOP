import java.awt.*;
import javax.swing.*;
public class TellerGUI{
    private JFrame f = new JFrame("Teller GUI");
    private JPanel pl = new JPanel();
    private JPanel pl2 = new JPanel();
    private JButton bl = new JButton("Deposit");
    private JButton bl2 = new JButton("Withdraw");
    private JButton bl3 = new JButton("Exit");
    private JTextField tf = new JTextField();
    private JTextField tf2 = new JTextField("6000");
    private JLabel lb = new JLabel("Balance");
    private JLabel lb2 = new JLabel("Amount");
    public TellerGUI(){
        f.setLayout(new GridLayout(2, 1));
        pl.setLayout(new GridLayout(2, 2));
        pl2.setLayout(new FlowLayout());
        tf2.setEditable(false);
        pl.add(lb);
        pl.add(tf2);
        pl.add(lb2);
        pl.add(tf);
        pl2.add(bl);
        pl2.add(bl2);
        pl2.add(bl3);
        f.add(pl);
        f.add(pl2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(320, 210);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new TellerGUI();
    }
}
