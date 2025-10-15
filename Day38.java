import java.util.Scanner;

public class Day38 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("MASUKKAN ANGKA: ");
        int angka = input.nextInt();

        if (angka == 0) {
            System.out.println("Angka: 0");
        } else if (angka > 0) {
            System.out.println("Angka: positif");
        } else {
            System.out.println("Angka: negatif");
        }
    }

}
