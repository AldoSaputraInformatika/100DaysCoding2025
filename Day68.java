
import java.util.Scanner;

public class Day68 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka ; j++) {
                System.out.print("? ");
            }
            System.out.println("");
        }
    }
}
