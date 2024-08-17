import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello "+ name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        if(age < 18) {
            JOptionPane.showMessageDialog(null, "You are younger than 18");
        } else if (age == 18) {
            JOptionPane.showMessageDialog(null, "You are 18");
        } else {
            JOptionPane.showMessageDialog(null, "You are older than 18");
        }

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " +height+"cm tall");
    }
}