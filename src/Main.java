public class Main {
    public static void main(String args[]){
        //exo1
        /*
        AfficheNFois a1 = new AfficheNFois (10, "Bonjour" );
        AfficheNFois a2 = new AfficheNFois (10, "Toto" );
        */

        //exo 2
        /*
        compte_a_rebours a1 = new compte_a_rebours(10);
        compte_a_rebours b1 = new compte_a_rebours(30);

        a1.start();
        b1.start();

        */

        //exo 3
        /*
        exo3_1 alpha1 = new exo3_1();
        exo3_2 nume1 = new exo3_2();
        alpha1.start();
        nume1.start();
        */
         //exo 4
        /*
        occcurence chaine1 = new occcurence("salut bienvenue",'e');
        chaine1.start();
        */


        //exo5 tableau de Thread pour séparer la recherche dans une longue chaine de caractère
        //
        int nbThread = Runtime.getRuntime().availableProcessors();
        // check the number of processors available
        //System.out.println(""+Runtime.getRuntime().availableProcessors());
        int taille;
        String chaine;
        chaine="Salut bienvenue";
        char recherche = 'e';
        taille = chaine.length();
        StringAnalyst tab[] = new StringAnalyst[nbThread];
        for(int i=0;i<nbThread;i++){
            if(i!=nbThread-1){
                tab[i]= new StringAnalyst(chaine,i*(taille/nbThread),(1+i)*(taille/nbThread),recherche);
            }
            else{
                tab[i]= new StringAnalyst(chaine,i*(taille/nbThread),taille,recherche);
            }
        }
        tab[nbThread].start();
    }
}
