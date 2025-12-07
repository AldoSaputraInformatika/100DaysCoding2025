
import java.util.Scanner;

public class Day91 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String d = input.nextLine();
        int e = input.nextInt();
        double f = input.nextDouble();
        profil(d, e, f);

        total(5, 6, 7);

    }

    static void profil(String a, int b, double c) {
        System.out.println("Nama: " + a);
        System.out.println("Umur: " + b);
        System.out.println("Tinggi: " + c);
    }

    static int total(int x, int y, int z) {
        int hasil = x + y + z;
        System.out.println("Total: " + hasil);
        return hasil;
    }
}
