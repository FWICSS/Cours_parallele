public class compte_a_rebours extends Thread{
    private int N;

    public compte_a_rebours(int n) {
        N = n;

    }
    @Override
    public void run() {
        for(int i=N;i>=0;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
