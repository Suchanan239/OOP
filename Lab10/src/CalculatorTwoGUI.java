import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI{
    private JFrame f = new JFrame("My Calculator");
    private JPanel pl = new JPanel();
    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16 = new JButton();
    private JTextField tf = new JTextField();
    
    public CalculatorTwoGUI(){
        f.setLayout(new BorderLayout());
        pl.setLayout(new GridLayout(4, 4));
        f.add(tf, BorderLayout.NORTH);
        b1 = new JButton("7");
        b2 = new JButton("8");
        b3 = new JButton("9");
        b4 = new JButton("+");
        b5 = new JButton("4");
        b6 = new JButton("5");
        b7 = new JButton("6");
        b8 = new JButton("-");
        b9 = new JButton("1");
        b10 = new JButton("2");
        b11 = new JButton("3");
        b12 = new JButton("x");
        b13 = new JButton("0");
        b14 = new JButton("c");
        b15 = new JButton("=");
        b16 = new JButton("/");
        pl.add(b1);
        pl.add(b2);
        pl.add(b3);
        pl.add(b4);
        pl.add(b5);
        pl.add(b6);
        pl.add(b7);
        pl.add(b8);
        pl.add(b9);
        pl.add(b10);
        pl.add(b11);
        pl.add(b12);
        pl.add(b13);
        pl.add(b14);
        pl.add(b15);
        pl.add(b16);
        f.add(pl, BorderLayout.CENTER);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
