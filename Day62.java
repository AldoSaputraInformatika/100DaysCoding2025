
import java.util.Scanner;

public class Day62 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int hasil = 0;
        
        for (int i = 1; i <= N; i++) {
            hasil += i;

        }
        System.out.println("Hasil dari 1 Sampai " + N + " = " + hasil);
    }

}
