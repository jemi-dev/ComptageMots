import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Initialisation du nombre total de mots à 0 */
        int totalMots = 0;

        /* Mettre un try ... catch en cas de fichier pas trouvé ou
        au cas où il y a un autre problème  */
        try {
            File file= new File("src/TestExercice3.txt");
            Scanner fileScanner= new Scanner(file);

            /* Création d'une Boucle qui lit chaque ligne */
            while (fileScanner.hasNextLine()) {
                String ligne = fileScanner.nextLine();

                /* Separation de la ligne par les espaces */
                String[] mots = ligne.split(" ");

                /* Ajout du nombre de mots de cette ligne au total */
                totalMots = totalMots + mots.length;
            }

            fileScanner.close();

            /* Affichage du résultat */
            System.out.println("Nombre total de mots : " + totalMots);
        }catch (Exception e) {
            System.out.println("Erreur : fichier introuvable");
        }
    }
}
