
import java.util.Scanner;

public class Day40 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        input.nextLine();
        String operator = input.nextLine();
        int angka2 = input.nextInt();
        int hasil = 0;
        if (operator.equals("+")) {
            hasil = angka + angka2;
            System.out.println(angka + " + " + angka2 + " = " + hasil);
        } else if (operator.equals("-")) {
            hasil = angka - angka2;
            System.out.println(angka + " - " + angka2 + " = " + hasil);
        } else if (operator.equals("x")) {
            hasil = angka * angka2;
            System.out.println(angka + " x " + angka2 + " = " + hasil);
        } else if (operator.equals("/")) {
            hasil = angka / angka2;
            System.out.println(angka + " / " + angka2 + " = " + hasil);
        } else if (operator.equals("%")) {
            hasil = angka % angka2;
            System.out.println(angka + " % " + angka2 + " = " + hasil);
        } else {
            System.out.println("Operator tidak valid");
        }

    }
}
