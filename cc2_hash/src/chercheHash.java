public class chercheHash extends Thread {
    public String Hash;
    private int debut;
    private int fin;
    private String nombre ="";

    public chercheHash(String H,int d,int f){
        Hash =  H;
        debut = d;
        fin = f;
    }

    public void run() {
        for (int i = debut; i <= fin; i++) {
            int chiffre = i;
            String testhash = Mining.hash(chiffre);
            if(testhash.equals(Hash)){
                System.out.println("WIN");
                nombre = Mining.proposerReponse(chiffre,"AIGLE");
                System.out.println(nombre);
                i = fin+1;
            }
        }
    }
}
