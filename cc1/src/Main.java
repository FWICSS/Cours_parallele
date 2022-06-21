
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) throws InterruptedException {
        System.out.println("Entrez le message a chiffrer");
        String message = new Scanner(System.in).next();

        int clé = 0;
        while (clé<=0 || clé>26) {
            System.out.println("Saisissez la clé :");
            clé = new Scanner(System.in).nextInt();
        }
        System.out.println("Saisir le Nombre de Thread de parralélisation: ");
        int nbThread = new Scanner(System.in).nextInt();
        int taille = message.length();
        Chiffrement[] tab = new Chiffrement[nbThread];
        if(taille<10){
            nbThread=2;
        }
        for(int i=0;i<nbThread;i++){
            tab[i]= new Chiffrement(message,i*(taille/nbThread),(1+i)*(taille/nbThread),clé);

        }
        //Lancement des threads et attente
        String message_chiffrer = "";
        for(int i =0;i<nbThread;i++) {
            tab[i].start();
            tab[i].join();
            message_chiffrer = message_chiffrer + tab[i].chaine_chif;
            System.out.println(message_chiffrer);

        }
        System.out.println(message_chiffrer);
    }
}
