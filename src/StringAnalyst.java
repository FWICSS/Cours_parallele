public class StringAnalyst extends Thread{
    private String chaine;

    private char recherche;
    private int debut;

    private int fin;
    public StringAnalyst(String ch,int d,int f,char c){
            chaine=ch;
            debut=d;
            fin=f;
            recherche=c;
    }
    public void run(){
        int nb = 0;
        for (int i=0; i < chaine.length(); i++)
        {
            if (chaine.charAt(i) == recherche)
                nb++;
        }
        System.out.println("il y a "+ nb +" occurence de " + recherche);

    }
    }
