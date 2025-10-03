package day26;

import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        
        angka += 2;
        System.out.println("Nilai: " + angka);
        angka -= 2;
        System.out.println("Nilai: " + angka);
        angka *= 2;
        System.out.println("Nilai: " + angka);
        angka /= 2;
        System.out.println("Nilai: " + angka);
        angka %= 2;
        System.out.println("Nilai: " + angka);
        
    }
    
}
