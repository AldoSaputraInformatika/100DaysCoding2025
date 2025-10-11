package day.pkg34;

import java.util.Scanner;

public class Day34 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai a: ");
        int a = input.nextInt();
        final int b = 10;
        if (a > 0 && a % 2 != 0) {
            System.out.println("Bilangan ganjil positif");
            System.out.println("Nilai a: " + a);
            a += b;
            System.out.println("Nilai a: " + a);
        } else if (a < 0 && a % 2 != 0) {
            System.out.println("Bilangan ganjil negatif");
            System.out.println("Nilai a: " + a);
            a -= b;
            System.out.println("Nilai a: " + a);
        } else if (a == 0) {
            System.out.println("Bilangan nol");
        } else {
            System.out.println("Bilangan genap negatif dan positif");
            System.out.println("Nilai a: " + a);
            int m = input.nextInt();
            int x = a + b;
            int y = (m * (a * x)) + b;
            double hasil = y / x;
            System.out.println("Hasil: " + hasil);
        }

    }

}
