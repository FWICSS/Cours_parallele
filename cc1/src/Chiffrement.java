public class Chiffrement extends Thread{

  public int clé;

 public String chaine;

  private int debut;

  private int fin;

 public String chaine_chif = "";


 public Chiffrement(String message,int d,int f,int c){
  chaine=message;
  debut=d;
  fin=f;
  clé=c;

 }
 public void run() {
  for (int i = debut; i <= fin; i++) {
   char lettre = (char) (chaine.charAt(i)+clé);
   chaine_chif = chaine_chif + lettre;
  }
 }

}
