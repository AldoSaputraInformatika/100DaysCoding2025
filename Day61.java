
import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai m: ");
        int m = input.nextInt();
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        System.out.println("Kelipatan angka " + m + ":");
        for (int i = 1; i <= n; i++) {
            if(i % m == 0 ){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
}
