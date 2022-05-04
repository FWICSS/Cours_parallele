public class exo3_2 extends Thread{
    private int N ;

    public exo3_2(){
        N =26;
    }
    public void run(){
        for(int i=1;i<=N;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
