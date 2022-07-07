import java.util.Scanner;

public class Main_decompte {
    public static void main(String[] args){
        System.out.println("Entrez le message a desscompter");
        String message = new Scanner(System.in).next();
        System.out.println("Saisir le Nombre de Thread de parralélisation: ");
        int nbThreaddispo = Runtime.getRuntime().availableProcessors();
        int nbThread = (new Scanner(System.in).nextInt())%nbThreaddispo;
        int taille = message.length();
        DecompteLettre[] tab = new DecompteLettre[nbThread];
        for(int i=0;i<nbThread;i++){
            tab[i]= new DecompteLettre();

        }
    }
}
