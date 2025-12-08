
import java.util.Scanner;

public class Day92 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int hasil = angka1(x) * angka2(y);
        System.out.println("Hasil = " +hasil);
    }

    static int angka1(int a) {
       if(a % 2 == 0){
           a+=5;
       }
        return a;
    }

    static int angka2(int b) {
       if(b % 2 !=0){
           b += 10;
       }
        return b;
    }

}
