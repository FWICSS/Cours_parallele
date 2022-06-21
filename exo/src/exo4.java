import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class exo4 {
        public static void run() {

            int nbThreaddispo = Runtime.getRuntime().availableProcessors();

            String chaine;

            System.out.println("saisir le charactère a recherché :");
            char recherche = new Scanner(System.in).nextLine().charAt(0);

            int nbThread =0;
            while (nbThread<=0 || nbThread>nbThreaddispo) {
                System.out.println("saisir le nombre de Thread a utilisé : (maximum "+ nbThreaddispo +" Thread )");
                nbThread = Integer.parseInt(new Scanner(System.in).nextLine());
            }

            int taille = chaine.length();
        /* correction prof
        traitementTexte[] tab = new traitementTexte[nbThread];
        for(int i = 0; i<nbThread;i++){
                tab[i] = new traitementTexte(
                         chaine,
                         i*taille/nbThread,
                         (i != taille-1 ? (i+1)*taille/nbThreads : taille-1),c);
              }
         */
            StringAnalyst[] tab = new StringAnalyst[nbThread];
            System.out.println(taille);
            for(int i=0;i<nbThread;i++){
                //if(i!=nbThread-1){
                tab[i]= new StringAnalyst(chaine,i*(taille/nbThread),(1+i)*(taille/nbThread),recherche);
                System.out.println(i*(taille/nbThread)+" - "+ (1+i)*(taille/nbThread));
            }
            //Lancement des threads et attente
            int somme = 0;
            for(int i =0;i<nbThread;i++) {
                tab[i].start();
                tab[i].join();
                somme += tab[i].nb;
            }


            //Sommes des résultats
        /*
        for(int i = 0;i<nbThread; i++){

        }

         */
            System.out.println("Nombre d'occurrence de "+recherche+" : "+somme);
        }
    }
