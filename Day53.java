import java.util.Scanner;

public class Day53 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        while(angka <= 10){
            System.out.print(angka + " ");
            angka++;
            if(angka == 6){
                break;
            }
        }
        System.out.println();
    }

}
