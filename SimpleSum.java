import javax.swing.JOptionPane;
import java.io.*;

public class SimpleSum {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        JOptionPane.showInputDialog(null, "Quel est votre nom ?");
        while (sum < 100) {
            int number = Integer.parseInt(JOptionPane.showInputDialog("Entrez un nombre (1-10):"));
            if (number >= 1 && number <= 10) {
                sum += number;
                count++;
            } else {
                JOptionPane.showMessageDialog(null, "Veuillez entrer un nombre entre 1 et 10.");
            }
        }
        JOptionPane.showMessageDialog(null, "Total de la somme: " + sum + "\nNombre d'entrées: " + count);
    }
}