package evaluasimentor5;

import java.util.Scanner;

public class EvaluasiMentor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama:"  );
        String nama = input.nextLine();
        System.out.println("Masukkan Nim:");
        final String Nim = input.nextLine();
        System.out.println("Masukkan umur:");
        int umur = input.nextInt();
        System.out.println("Masukkan tinggi:");
        double tinggi = input.nextDouble();
        System.out.println("Masukkan JK:");
        char Jk = input.next().charAt(0);
        System.out.print("BIODATA\n--------\n");
        System.out.println("Nama: "+ nama);
        System.out.println("Nim: "+ Nim);
        System.out.println("Umur: "+ umur);
        System.out.println("Tinggi:"+ tinggi+ "CM");
        System.out.println("Jenis Kelamin "+ Jk);
    }
    
}
