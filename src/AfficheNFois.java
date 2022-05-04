public class AfficheNFois extends Thread{
    private int nb;
    private String message;

    public AfficheNFois(int n,String m) {
        nb = n;
        message = m;
    }

    @Override
    public void run() {
        for(int i=0;i<nb;i++){
            System.out.println(message);
        }
    }
}
