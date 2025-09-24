package day17;
import java .util.Scanner;
public class Day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka pertama: ");
        int angka = input.nextInt();
        System.out.print("Masukkan Angka kedua: ");
        int angka2 = input.nextInt();
        // % merupakan operator aritmatika untuk mencari sisa bagi dari suatu operasiii
        int hasil_bagi = angka % angka2;
        System.out.println("HASIL BAGI DARI " + angka + " dan " + angka2 + " adalah " + hasil_bagi);
    }
}
