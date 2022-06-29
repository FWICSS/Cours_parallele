public class Main {
    public static void main(String[] args){
        HorlogeThread o = new HorlogeThread(1,2);
        o.start();

        ControleHorlogeThread c = new ControleHorlogeThread(o);
        c.start();
    }
}
