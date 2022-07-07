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
            if(Mining.hash(i) == Hash){
                nombre= Mining.proposerReponse(i,"AIGLE_Dimitri");
                System.out.println(nombre);
            }
        }
    }
}
