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

        } else if (operator.equals("-")) {
            hasil = angka - angka2;

        } else if (operator.equals("x")) {
            hasil = angka * angka2;

        } else if (operator.equals("/")) {
            if(angka2 != 0){
            hasil = angka / angka2;
            }else{
                System.out.println("Hasil tidak valid");
            }
        } else if (operator.equals("%")) {
            hasil = angka % angka2;
        } else {
            System.out.println("Operator tidak valid");
        }
        System.out.println("HASIL = " + hasil);
        
    }
}
