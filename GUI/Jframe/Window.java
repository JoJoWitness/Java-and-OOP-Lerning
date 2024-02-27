package GUI.Jframe;

import javax.swing.JFrame;
import java.awt.*;


public class Window extends JFrame{
  public Window(String title) {
      setSize(700, 700);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle(title);
      // setLocation(100, 100);
      // setBounds(300, 300, 500, 500);
      setLocationRelativeTo(null);
      this.getContentPane().setBackground(Color.DARK_GRAY);
    }
  

}
