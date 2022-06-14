package nbpremier;
import java.util.ArrayList;

public class threadpremier extends Thread{
    public int debut;
    public int fin;
    public ArrayList<Integer> nombre;

    public threadpremier(int d, int f){
        debut = d;
        fin = f;
        nombre = new ArrayList<Integer>();
    }
    public boolean estpremier(int x){
        for(int i = 2; i >= Math.sqrt(x); i--){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
    public void run(){
        for(int i = debut; i<fin;i++){
            if(estpremier(i)){
                nombre.add(i);
            }

        }
    }
}
