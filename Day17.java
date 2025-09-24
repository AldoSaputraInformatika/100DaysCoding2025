package day17;
import java .util.Scanner;
public class Day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int angka2 = input.nextInt();
        int hasil_bagi = angka % angka2;
        System.out.println("HASIL BAGI DARI " + angka + " dan " + angka2 + " adalah " + hasil_bagi);
    }
}
