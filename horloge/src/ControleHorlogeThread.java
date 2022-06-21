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
            System.out.println("1. Modifier le temps de rafraichissement");
            System.out.println("2. Modifier le format d’affichage");
            System.out.println("3. Arrêter");
            switch (a) {
                case 1:System.out.println("Modifier le temps de rafraichissement ? (oui :1)");
                        int t=new Scanner(System.in).nextInt();
                        if(t==1){
                            System.out.println("Entrez le temps de rafraichissement :");
                                Horloge.setTime(new Scanner(System.in).nextInt());
                        }
                    break;
                case 2: System.out.println("Modifier le format d'affichage ? (oui :1)");
                        int r=new Scanner(System.in).nextInt();
                        if(r==1){
                            int form=Horloge.getFormat();
                            if(form==1){
                                Horloge.setFormat(2);
                            }
                            else Horloge.setFormat(1);
                        }
                        break;
                case 3: System.out.println("Arrêtez l'Horloge ? (oui :1)");
                        int s=new Scanner(System.in).nextInt();
                        if (s==1){

                        }


            }
        }
    }


}
