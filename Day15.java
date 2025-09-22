package day15;

import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int A;
        int B;
        int hasil_penjumlahan;
        int hasil_pengurangan;
    
        System.out.print("Masukkan nilai:");
        A = input.nextInt();
        System.out.print("Masukkan nilai2: ");
        B = input.nextInt();
        hasil_penjumlahan = A + B;
        hasil_pengurangan = A - B;
    
        System.out.printf("HASIL PENJUMLAHAN: %d \n" , hasil_penjumlahan);
        System.out.printf("HASIL PENGURANGAN: %d \n" , hasil_pengurangan);
    
    
    
    }
    
}
