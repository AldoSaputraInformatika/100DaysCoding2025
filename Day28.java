import java.util.Scanner;

public class Day28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        int angka2;
        System.out.println("Masukkan Angka pertama: ");
        angka = input.nextInt();

        System.out.println("Masukkan Angka kedua: ");
        angka2 = input.nextInt();

        boolean perbandingan = angka == angka2;
        boolean perbandingan2 = angka != angka2;

        System.out.println("1. " + perbandingan);
        System.out.println("2. " + perbandingan2);

    }
}
