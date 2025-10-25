
import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        input.nextLine();
        String operator = input.nextLine();
        int angka2 = input.nextInt();
        
        double hasil = 0;
        switch (operator){
            case "+":
                hasil = angka + angka2;
                break;
            case "-":
                hasil = angka - angka2;
                break;
            case "x":
                hasil = angka * angka2;
                break;
            case "/":
                hasil = angka / angka2;
                break;
            case "%":
                hasil = angka % angka2;
                break;
            default:
                System.out.println("Operator tidak valid");
        }
        System.out.println(hasil);
    }
    
}
