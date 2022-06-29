import java.util.Scanner;

public class ControleHorlogeThread extends Thread{
    public int format;
    public int rafraichissement;
    public HorlogeThread Horloge = new HorlogeThread(format,rafraichissement);

    public ControleHorlogeThread() {

    }
    public void run() {
        int a = -1;
        while(a != 0){
            switch (a) {
                case 1:System.out.println("Modifier le temps de rafraichissement ? (oui :1)");
                        int t=new Scanner(System.in).nextInt();
                        if(t==1){
                            System.out.println("Entrez le temps de rafraichissement :");
                                Horloge.setTime(new Scanner(System.in).nextInt());
                        }
                    break;
                case 2:    int form=Horloge.getFormat();
                            if(form==1){
                                Horloge.setFormat(2);
                            }
                            else Horloge.setFormat(1);
                        break;

                case 3: break;



            }
        }
    }


}
