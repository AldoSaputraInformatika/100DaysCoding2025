package Latihan;

import java.util.Scanner;

public class LatihanPrat1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       boolean kondisi = input.nextBoolean();
       boolean kondisi2 = input.nextBoolean();
       boolean c = kondisi && kondisi2;
       System.out.println(c);
    }
}
