import java.util.Scanner;

public class ControleHorlogeThread extends Thread{
    public int format;
    public int rafraichissement;
    public HorlogeThread Horloge;

    public ControleHorlogeThread(HorlogeThread h) {
    this.Horloge=h;
    }
    public void run() {

        int a = -1;
        while(a != 0){
            System.out.println("Choisir une option");
            int f = new Scanner(System.in).nextInt();
            switch (f) {
                case 1:     System.out.println("Modifier le temps de rafraichissement!");
                            System.out.println("Entrez le temps de rafraichissement :");
                            Horloge.setTime(new Scanner(System.in).nextInt());
                            break;

                case 2:     System.out.println("Changement de format");
                            int form=Horloge.getFormat();
                            if(form==1){Horloge.setFormat(2);}
                            else Horloge.setFormat(1);
                            break;

                case 3:     System.out.println("Arret de l'horloge");
                            Horloge.setArreter();
                            break;

                case 4:     System.out.println("Démarrage de l'horloge");
                            Horloge.start();
                            break;



            }
        }
    }


}
