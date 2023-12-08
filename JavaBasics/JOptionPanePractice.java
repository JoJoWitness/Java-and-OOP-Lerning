import javax.swing.JOptionPane;

public class JOptionPanePractice {

   
    public static void main(String[] args) {
        String name;
        int num;
        
        name = JOptionPane.showInputDialog("Write a name:");
        num = Integer.parseInt(JOptionPane.showInputDialog("Write a number:"));

        JOptionPane.showMessageDialog(null, "The name is "+name);
        JOptionPane.showMessageDialog(null, "The number is " +num);
    }
    
}
