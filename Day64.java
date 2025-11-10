import java.util.Scanner;

public class Day64 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan pangkat; ");
        int n = input.nextInt();
        System.out.println("Masukkan basis: ");
        int m = input.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++) {
            total *= m;
        }
        System.out.println(m + "^" + n + " = " + total);
    }

}
