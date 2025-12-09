import java.util.Scanner;

public class Day93 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka = 7.342452;
        angka = Math.floor(angka);
        System.out.println("Hasil pembulatan ke bawah           : " + angka);
       
        double angka2 = 7.342452;
        angka2 = Math.ceil(angka2);
        System.out.println("Hasil pembulatan ke atas            : " + angka2);
       
        double angka3 = 7.342452;
        angka3 = Math.round(angka3);
        System.out.println("Hasil pembulatan ke angka terdekat  : " + angka3);
       
        

    }
}
