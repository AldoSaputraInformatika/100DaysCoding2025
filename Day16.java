package day16;
import java.util.Scanner;
public class Day16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka; 
        int angka2;
        int hasil_perkalian;
        int hasil_pembagian;
        
        System.out.print("Masukkan nilai pertama: ");
        angka = input.nextInt();
        System.out.print("Masukkan nilai kedua: ");
        angka2 = input.nextInt();
        hasil_perkalian = angka * angka2;
        hasil_pembagian = angka / angka2;
        
        System.out.println("Hasil = " + hasil_perkalian);
        System.out.println("Hasil = " + hasil_pembagian);
    }
    
}
