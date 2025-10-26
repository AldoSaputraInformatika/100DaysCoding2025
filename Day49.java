
import java.util.Scanner;

public class Day49 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        String angka2 = (angka > 10) ? angka + " lebih dari 10" : angka + " kurang dari 10 ";
        System.out.println(angka2);

    }

}
