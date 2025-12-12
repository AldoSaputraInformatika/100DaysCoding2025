
import java.util.Scanner;

public class Day96 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        aritmatika(x, y);
    }

    static int aritmatika(int a, int b) {
        int hasil = 0;
        hasil = a + b;
        System.out.println("Penjumlahan: " + hasil);
        hasil = a - b;
        System.out.println("Pengurangan: " + hasil);
        hasil = a * b;
        System.out.println("Perkalian: " + hasil);
        hasil = a / b;
        System.out.println("Pembagian: " + hasil);

        return hasil;
    }

}
