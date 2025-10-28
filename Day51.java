
import java.util.Scanner;

public class Day51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka akhir");
        int angka = input.nextInt();
        for (int i = 1; i <= angka; i++) {
            System.out.println("Angka ke-" + i);
        }
    }
    
}
