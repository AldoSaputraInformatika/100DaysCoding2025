package day25;

import java.util.Scanner;

public class Day25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MASUKKAN NILAI A: ");
        int a = input.nextInt();
        a++;
        System.out.println(a);
        
        System.out.println("MASUKKAN NILAI B: ");
        int b = input.nextInt();
        b--;
        System.out.println(b);
    }
    
}
