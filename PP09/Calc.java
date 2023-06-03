import java.awt.BorderLayout;
import javax.swing.UIManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calc extends JFrame {
  public Calc() throws Exception {
    super("Calculadora");
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(350, 350);
    setLocation(400, 200);

    setLayout(new BorderLayout());

    TextPanel textPanel = new TextPanel();
    add(BorderLayout.NORTH, textPanel);

    JPanel digitsPanel = new JPanel();
    digitsPanel.setLayout(new BorderLayout());
    digitsPanel.add(BorderLayout.CENTER, new NumbersPanel(textPanel.getTxtNumber()));
    digitsPanel.add(BorderLayout.EAST, new OperationsPanel(textPanel.getTxtNumber()));

    add(BorderLayout.CENTER, digitsPanel);

    setVisible(true);
  }

  public static void main(String[] args) throws Exception {
    new Calc();
  }
}