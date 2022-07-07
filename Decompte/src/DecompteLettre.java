import java.util.ArrayList;

public class DecompteLettre {
    private ArrayList<Lettre> liste ;
    public DecompteLettre() {
        liste = new ArrayList<Lettre>() ;
    }
    public int indexOf(char c) {
        for(int i = 0 ; i < liste.size() ; i++) {
            if(liste.get(i).getLettre() == c) {
                return i ;
            }
        }
        return -1 ;
    }
    public void ajouter(char c) {
        liste.add(new Lettre(c, 1) ) ;
    }
    public void incrementer(char c) {
        int i = indexOf(c) ;
        if(i == -1) {
            ajouter(c) ;
        }
        else{
            int nb = liste.get(i). getNb() ;
            liste.liste.get(i).setNb(nb+1) ;
        }
    }
}
