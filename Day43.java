
import java.util.Scanner;

public class Day43 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();
        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("Kelipatan 3 & 5");
        } else if (angka % 3 == 0) {
            System.out.println("Kelipatan 3");
        } else if (angka % 5 == 0) {
            System.out.println("Kelipatan 5");
        }

    }

}
