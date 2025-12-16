
import java.util.Scanner;

public class Day100 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String teks = input.nextLine();
        boolean I = false;
        boolean S = false;
        boolean C = false;
        for (int i = 0; i < teks.length(); i++) {
            char x = teks.charAt(i);
            if (!I) {
                if (x == 'I') {
                    I = true;
                }

            } else if (!S) {
                if (x == 'S') {
                    S = true;
                }
            } else if (!C) {
                if (x == 'C') {
                    C = true;
                    break;
                }
            }
        }
        if( I && S && C){
            System.out.println("CANTIK");
        }else{
            System.out.println("TIDAK CANTIK");
        }
    }
}

