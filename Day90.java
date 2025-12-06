
import java.util.Scanner;

public class Day90 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = input.nextInt();
        angkapositif(a);
    }
    static int angkapositif(int a){
        if (a > 0){
            System.out.println("Angka positif");
        }else{
            System.out.println("Angka negatif");
        }
        return a;
    }
}
