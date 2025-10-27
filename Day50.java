
import java.util.Scanner;

public class Day50 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        String angka2 = angka % 2 == 0 ? "Genap" : "Ganjil";
        System.out.println(angka + " " + angka2);

    }

}
