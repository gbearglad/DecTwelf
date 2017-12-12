
import java.util.Scanner;

public class DecTwelf {

    public static void main(String[] args) {
        String[] mois;
        mois = new String[]{"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre", "décembre"};
        Scanner input = new Scanner(System.in);
        int choix;
        boolean quit = false;
        while (quit == false ){
        System.out.println("Entrez un chiffre de 1 à 12, ou 0 pour quitter : ");
        choix = input.nextInt();    
        if (choix > 0 && choix < 13){
            System.out.println("Le mois numéro " + choix + " est : " + mois[choix-1] + ".");
        }
        else if (choix == 0 ){
            quit = true ; 
        }
        else System.out.println("Choix Incorrect");
        }
    }

    }
