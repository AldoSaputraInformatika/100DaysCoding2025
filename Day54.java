
import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();
        for (int i = 1; i <= angka; i++) {
            if(i == 5){
                continue;
            }
            System.out.println("Angka ke-" + i );
        }
                
        
    }
    
}
