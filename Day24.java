package day24;

import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //pi r^2
        int radius = input.nextInt();
        double pi = 3.14;
        double luas = pi * (radius * radius);
        System.out.println("Luas lingkaran = " + luas);
           
       
       
    }
    
}
