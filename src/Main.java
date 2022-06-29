

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        ArrayList<Integer> nombres = new ArrayList<Integer>();
            System.out.println("Entrez un nombre");
            int N = new Scanner(System.in).nextInt();

        boolean flag = true;

        for(int i = 2; i <= N; i++) {
            //nombre est divisible par lui-meme

            if (i % 2 != (int) i % 2) {
                if (i % 3 != (int) i % 3) {
                nombres.add(N);
                }

            }
        }
    }
}