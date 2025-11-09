
import java.util.Scanner;

public class Day63 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long N = input.nextLong();
        long hasil = 1l;
        for (long i = 1; i <= N; i++) {
            hasil *= i;
        }
        System.out.println("Hasil kali dari 1 sampai " + N + " adalah " + hasil);
    }

}
