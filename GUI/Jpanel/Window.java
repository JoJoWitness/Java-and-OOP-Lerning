package GUI.Jpanel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.color.*;
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
    
      startComponent();
    }
  
    private void startComponent(){
      JPanel panel = new JPanel();

      this.getContentPane().add(panel);

    }

}
