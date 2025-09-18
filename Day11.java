package day11;
import java.util.Scanner;
public class Day11 {
    public static void main(String[] args) {
        Scanner com = new Scanner(System.in);
        //Cetak beberapa kata terlebih dahulu agar lebih memperjelas input data nantinya.
        System.out.println("Masukkan nama kamu: ");
        String nama = com.nextLine();
        System.out.println("Masukkan umur kamu: ");
        int umur = com.nextInt();
        System.out.println("Masukkan berat badan: ");
        double berat = com.nextDouble();
        System.out.println("Masukkan nilai ujian: ");
        char Grade = com.next().charAt(0);
        
        System.out.println("Nama: "+nama);
        System.out.println("Umur: "+umur);
        System.out.println("Berat: "+berat);
        System.out.println("Nilai: "+Grade);
    }
}
