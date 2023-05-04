import java.awt.*;
import javax.swing.*;

public class MDIFromGUI {
    private JFrame f = new JFrame("SubMenuItem Demo");
    private JDesktopPane desktopPane = new JDesktopPane();
    private JInternalFrame f1, f2, f3;
    private JMenuBar mb = new JMenuBar();
    private JMenu m1 , m2, m3, m4;
    private JMenuItem i1, i2, i3, i4, i5;
    
    public MDIFromGUI(){
        f.setJMenuBar(mb);
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        m4 = new JMenu("New");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        m1.add(m4);
        i1 = new JMenuItem("Open");
        m1.add(i1);
        m1.addSeparator();
        i2 = new JMenuItem("Save");
        i3 = new JMenuItem("Exit");
        m1.add(i2);
        m1.addSeparator();
        m1.add(i3);
        i4 = new JMenuItem("Window");
        i5 = new JMenuItem("Message");
        m4.add(i4);
        m4.addSeparator();
        m4.add(i5);
        f1 = new JInternalFrame("Application 01", true, true, true, true);
        f2 = new JInternalFrame("Application 02", true, true, true, true);
        f3 = new JInternalFrame("Application 03", true, true, true, true);
        
        f1.setSize(200, 144);
        f2.setSize(200, 150);
        f3.setSize(250, 190);
        
        f1.setLocation(100, 250);
        f2.setLocation(240, 70);
        f3.setLocation(500, 200);
        
        f1.setVisible(true);
        f2.setVisible(true);
        f3.setVisible(true);
        
        desktopPane.add(f1);
        desktopPane.add(f2);
        desktopPane.add(f3);
        
        f.add(desktopPane, BorderLayout.CENTER);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setMinimumSize(new Dimension(800, 500));
        f.pack();
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e){
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {new MDIFromGUI();});
    }
}
