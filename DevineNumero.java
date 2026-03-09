import javax.swing.JOptionPane;
import java.io.*;

public class DevineNumero {

    public static void main(String[] args) {
        int secret = (int)(System.currentTimeMillis() % 100) + 1;
        int essais = 0;

        JOptionPane.showMessageDialog(null,
            "Bienvenue au jeu Devine le Nombre!\n\nJe pense a un nombre entre 1 et 100.\nEssaie de le trouver!", "Devine le Nombre", JOptionPane.INFORMATION_MESSAGE);

        while (true) {
            String input = JOptionPane.showInputDialog(null, "Entre un nombre entre 1 et 100 :", "Devine le Nombre",
                JOptionPane.QUESTION_MESSAGE);

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Au revoir!", "Fin", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            int guess;
            try {
                guess = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entree invalide. Ecris un nombre entier.", "Erreur", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            essais++;

            if (guess < secret) {
                JOptionPane.showMessageDialog(null, "Trop petit! Essaie encore.", "Indice", JOptionPane.WARNING_MESSAGE);
            } else if (guess > secret) {
                JOptionPane.showMessageDialog(null, "Trop grand! Essaie encore.", "Indice", JOptionPane.WARNING_MESSAGE);
            } else {
                int rejouer = JOptionPane.showConfirmDialog(null,
                    "Bravo! Tu as trouve " + secret + " en " + essais + " essai(s)!\n\nJouer encore?", "Gagne!", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (rejouer == JOptionPane.YES_OPTION) {
                    secret = (int)(System.currentTimeMillis() % 100) + 1;
                    essais = 0;
                } else {
                    JOptionPane.showMessageDialog(null, "Merci d'avoir joue! Au revoir!", "Fin", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        }
    }
}