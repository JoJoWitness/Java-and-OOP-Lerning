package GUI.JLabel;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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
    // this.getContentPane().setBackground(Color.DARK_GRAY);
  
    startComponent();
  }
  
  private void startComponent(){
    JPanel panel = new JPanel();
  
    // panel.setLayout(null);
  
  
    this.getContentPane().add(panel);
  
    JLabel label = new JLabel();
    // label.setOpaque(true);
    // label.setBackground(Color.BLACK);
    // label.setForeground(Color.white);
  
    label.setText("My Ryuk is NOT a criminal");
    label.setBounds(50, 50, 300, 45);
    label.setHorizontalAlignment(SwingConstants.CENTER);
    label.setFont(new Font("arial", Font.PLAIN, 20));
    panel.add(label);
  
    ImageIcon image = new ImageIcon("/home/ryuk/Repos/Java-and-OOP-Lerning/GUI/JLabel/CAM01241.jpg");
    JLabel ryukLabel = new JLabel(new ImageIcon(image.getImage().getScaledInstance(600, 350, Image.SCALE_SMOOTH)));
    panel.add(ryukLabel);
  
  
    JLabel leyend = new JLabel("Look at him", SwingConstants.CENTER);
    leyend.setFont(new Font("arial", Font.PLAIN, 20));
    leyend.setBounds(50, 400, 150, 45);
    panel.add(leyend);
  }
  
 
      
}

