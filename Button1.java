import javax.swing.*;
import java.awt.*;

public class Button1 {

  public static void main(String[] args) {
    Button1 gui = new Button1();
    gui.go();
  }

  public void go() {
    JFrame frame = new JFrame();
    JButton button1 = new JButton("West");
    JButton button2 = new JButton("East");
    JButton button3 = new JButton("North");
    JButton button4 = new JButton("South");
    JButton button5 = new JButton("Center");
    Font bigFont = new Font("serif", Font.BOLD, 28);
    button1.setFont(bigFont);
    button2.setFont(bigFont);
    button3.setFont(bigFont);
    button4.setFont(bigFont);
    button5.setFont(bigFont);
    frame.getContentPane().add(BorderLayout.WEST, button1);
    frame.getContentPane().add(BorderLayout.EAST, button2);
    frame.getContentPane().add(BorderLayout.NORTH, button3);
    frame.getContentPane().add(BorderLayout.SOUTH, button4);
    frame.getContentPane().add(BorderLayout.CENTER, button5);
    frame.setSize(200, 200);
    frame.setVisible(true);
  }

}
