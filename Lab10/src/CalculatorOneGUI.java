import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI{
    private JFrame f = new JFrame("Calcullator");
    private JButton b1 = new JButton("Add");
    private JButton b2 = new JButton("Substract");
    private JButton b3 = new JButton("Multiply");
    private JButton b4 = new JButton("Divide");
    private JPanel pl1 = new JPanel();
    private JPanel pl2 = new JPanel();
    private JTextField tf = new JTextField();
    private JTextField tf2 = new JTextField();
    private JTextField tf3 = new JTextField();
    
    public CalculatorOneGUI(){
        pl2.setLayout(new FlowLayout());
        pl2.add(b1);
        pl2.add(b2);
        pl2.add(b3);
        pl2.add(b4);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(4, 1));
        f.add(tf);
        f.add(tf2);
        f.add(pl2);
        f.add(tf3);
        f.setSize(400, 200);
        f.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
    
}
