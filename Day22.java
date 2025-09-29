package day22;

import java.util.Scanner;

public class Day22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("MASUKKAN NILAI SISI: ");
        int s = input.nextInt();
        // luas persegi s * s
        int luaspersegi = s * s;
        System.out.println("Luas persegi = " + luaspersegi);
       
    }
    
}
