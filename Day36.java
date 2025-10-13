import java.util.Scanner;

public class Day36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        if (angka >= 1 && angka <= 10) {
            if (angka == 4) {
                System.out.println("Empat");
            } else if (angka == 8) {
                System.out.println("Delapan");
            }
            System.out.println("Nilai: " + angka);
        } else {
            System.out.println("Nilai tidak valid");
        }

    }
}
