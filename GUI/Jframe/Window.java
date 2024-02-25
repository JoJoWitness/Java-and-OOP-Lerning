package GUI;

import javax.swing.JFrame;

public class Window extends JFrame{
  public Window(String title) {
      setSize(700, 700);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setTitle(title);
      // setLocation(100, 100);
      // setBounds(300, 300, 500, 500);
      setLocationRelativeTo(null);
    }
  

}
