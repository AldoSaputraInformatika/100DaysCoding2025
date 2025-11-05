
import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        for (int i = 1; i <= angka; i++) {
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int j = 1; j <= angka; j++) {
            if(j % 2 == 0){
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
}
