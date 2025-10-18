import java.util.Scanner;

public class Day41 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double p = input.nextDouble();
        System.out.print("Masukkan lebar  : ");
        double l = input.nextDouble();
        
        double luas = p * l;
        
        System.out.printf("Luas taman yang akan ditanami rumput adalah %.2f meter persegi\n",luas);
         
    }
}
