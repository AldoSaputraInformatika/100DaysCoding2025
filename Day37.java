import java.util.Scanner;

public class Day37 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        byte angka = input.nextByte();
        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " itu Genap");
        } else {
            System.out.println("Angka " + angka + " itu Ganjil");
        }

    }
}
