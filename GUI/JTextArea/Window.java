package GUI.JTextArea;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.color.*;
import java.awt.*;

public class Window extends JFrame{
  public JPanel panel;

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
      
      createPanels();
      addLabels();
      addTextArea();
    }

    private void createPanels(){
      panel = new JPanel();
      // panel.setLayout(null);
      this.getContentPane().add(panel);

    }

    private void addLabels(){

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

    private void addButtons(){
      JButton button = new JButton("I agree that Ryuk is Not a Criminal");
      button.setBounds(100, 100, 300, 40);
      button.setFont(new Font("arial", Font.PLAIN, 20));
      button.setMnemonic('a');
      panel.add(button);
    }

    private void addRadioButtons(){
      JRadioButton radioButton4 = new JRadioButton("R", true);
      radioButton4.setBounds(100, 100, 50, 40);
      panel.add(radioButton4);

      JRadioButton radioButton1 = new JRadioButton("Ru", true);
      radioButton1.setBounds(100, 100, 50, 40);
      panel.add(radioButton1);

      JRadioButton radioButton2 = new JRadioButton("Ryu", false);
      radioButton2.setBounds(100, 100, 50, 40);
      panel.add(radioButton2);

      JRadioButton radioButton3 = new JRadioButton("Ryuk", false);
      radioButton3.setBounds(100, 100, 50, 40);
      panel.add(radioButton3);

      ButtonGroup buttonGroup = new ButtonGroup();
      buttonGroup.add(radioButton1);
      buttonGroup.add(radioButton2);
      buttonGroup.add(radioButton3);
      buttonGroup.add(radioButton4);

    }

    private void addTextField(){
      JTextField fieldText = new JTextField("Ryuk", 50);
      fieldText.setBounds(100, 100, 300, 40);
      panel.add(fieldText);
    }
    
    private void addTextArea(){
      JTextArea textArea = new JTextArea("Ryuk", 20, 100);
      textArea.setBounds(100, 100, 300, 40);
      textArea.setEditable(true);
      panel.add(textArea);
    }

}