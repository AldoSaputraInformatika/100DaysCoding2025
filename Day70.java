
import java.util.Scanner;

public class Day70 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkkan panjang: ");
        int P = input.nextInt();
        System.out.print("Masukkkan lebar: ");
        int L = input.nextInt();
        for (int i = 1; i <= L; i++) {
            for (int j = 1; j <= P; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

    }

}
