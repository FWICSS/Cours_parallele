public class Main {
    public static void main (String[] args) throws InterruptedException {

        String nombre = Mining.getDefi();
        int nbThread = 8;
        //int taille = nombre.length();
        chercheHash[] tab = new chercheHash[nbThread];
        System.out.println(nombre);
        int taille=500000000;
        for(int i=0;i<nbThread;i++){
                tab[i] = new chercheHash(nombre, i * (taille / nbThread), (1 + i) * (taille / nbThread));

                tab[i].start();
        }
    }
}
