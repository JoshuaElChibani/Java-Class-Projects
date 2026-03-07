    //**********************************************************
    // Nom: Joshua
    // Date: 2024051
    // Description: Eval_5
    //**********************************************************
    // Importation de packages
    import javax.swing.JOptionPane;
    import java.io.*;
    public class DiceGame {
    // La méthode main débute l'exécution de l'appl. Java.
        public static void main( String args[] ){
            //ton travail icitte
            // Total des points depuis le début du jeu
            int totalGlobal = 0;
            // Nombre de lancers effectués
            int nombreLances = 0;
            // Contrôle de la boucle de jeu
            boolean continuer = true;
            while (continuer) {
                int d1 = lancerDe(); // Lancer le premier dé
                int d2 = lancerDe(); // Lancer le deuxième dé
                int totalLance = d1 + d2; //calculer la somme des dés
                if (d1 == d2) { // Vérifier si les dés sont doubles et doubler le total du lancer si nécessaire
                    totalLance *= 2;
                }
                if (totalLance != 7) { // Ajouter la somme au total global sauf si la somme est 7
                    totalGlobal += totalLance;
                }
                else { // Arrêter le jeu si la somme est 7
                    continuer = false;
                }
                nombreLances++; // Incrémenter le nombre de lancers
                JOptionPane.showMessageDialog(null, "Roule le dé: D1=" + d1 + " D2=" + d2 + " Total roulé=" + totalLance + "\nTotal à date=" + totalGlobal + "\nNombre de lancers=" + nombreLances); // Vérifier si on continue ou non
                if (continuer) {
                    int reponse = JOptionPane.showConfirmDialog(null, "Veux-tu lancer les dés encore une fois?");
                    if (reponse != JOptionPane.YES_OPTION) {
                        continuer = false; // Arrêter seulement SI l'utilisateur ne veut pas continuer
                    }
                }
            }
            // Afficher le message final
            JOptionPane.showMessageDialog(null, "Tu as obtenu ton 7. Ton total global est " +
            totalGlobal + " et tu as roulé " + nombreLances + " fois.");
            }
            // Méthode pour lancer un dé
            private static int lancerDe (){
                return (int) (Math.random() * 6) + 1;
            } // fin méthode main
    } // fin MonModel
