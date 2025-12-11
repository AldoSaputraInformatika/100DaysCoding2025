import java.util.Scanner;

public class Day95 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        angka(x, y);
    }

    static void angka(int a, int b) {
        int hasil = a + b;
        System.out.println(hasil);
    }
}
