import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Initialisation du nombre total de mots à 0 */
        int totalMots = 0;

        /* Mettre un try ... catch en cas de fichier pas trouvé ou
        au cas où il y a un autre problème  */
        try {
            File file= new File("Text.txt");
            Scanner fileScanner= new Scanner(file);

             }catch (Exception e) {
            System.out.println("Erreur : fichier introuvable");
        }
    }
}
