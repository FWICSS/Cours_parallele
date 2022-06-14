import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Thread {

        ArrayList<Integer> nombres = new ArrayList<Integer>();
        public void run() {
            System.out.println("Entrez un nombre");
            int N = new Scanner(System.in).nextInt();
        }
        int reste;
        boolean flag = true;

        for (int i = 2; i <= N; i++) {
            //nombre est divisible par lui-meme

            if (i % 2 != (int) i % 2) {
                if (i % 3 != (int) i % 3) {
                nombres.add(N);
                }

            }
        }
    }
}