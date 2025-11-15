
import java.util.Scanner;

public class Day69 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int l = input.nextInt();
        int hasil = (l + m ) % 24;
        System.out.println(hasil);
    }

}
