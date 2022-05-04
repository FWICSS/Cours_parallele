public class exo3_1 extends Thread{

    public void run() {
        for(char c='a'; c<='z';c++){
            System.out.println(c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
