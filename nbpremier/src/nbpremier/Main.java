package nbpremier;
import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static void main (String[] args){

            System.out.println("Entrez un nombre N:");
            int N = new Scanner(System.in).nextInt();
            System.out.println("Saisir le Nombre de Thread: ");
            int nbThread = new Scanner(System.in).nextInt();
            long begin = System.currentTimeMillis();
            threadpremier tab[] = new threadpremier[nbThread];
            for(int i=0; i < nbThread; i++){
                int debut = i*N/nbThread;
                int fin = (i+1)*N/nbThread;

                if(i==0){
                    debut = 2;
                }

                tab[i] = new threadpremier(debut,fin);
                tab[i].start();
            }

            // Attendre que tous les thread soit terminés
            for(int i=0; i<nbThread; i++){
                try {
                    tab[i].join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            // Une fois tous les threads terminés
        // Récupération des nombres premiers

        ArrayList<Integer> listNombres = new ArrayList<Integer>();
            for(int i=0; i <nbThread;i++){
                listNombres.addAll(tab[i].nombre);
            }
        System.out.println(listNombres);
            //Nombre de secondes
        long end = System.currentTimeMillis();
        float time = ((float) end-begin)/ 1000;
        System.out.println(time + " seconde");
    }
}