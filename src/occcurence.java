public class occcurence extends Thread{
    private int nb ;
    private String C;
    private char R;
    public occcurence(String chaines, char recherche) {
        C = chaines ;
        R = recherche ;
    }

    @Override
    public void run() {
            int nb = 0;
            /*
        for (char occu = 'a'; occu <= 'z'; occu++) {
            for (int i=0; i < C.length(); i++) {
                if (C.charAt(i) == occu) {
                    nb++;
                }
                }
            }*/
        for (int i=0; i < C.length(); i++)
        {
            if (C.charAt(i) == R)
                nb++;
        }
            System.out.println("il y a "+ nb +" occurence de " + R);

    }
}
