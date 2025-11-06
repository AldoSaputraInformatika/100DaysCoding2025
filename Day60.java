
import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = N; i > 0; i--) {
            if(i % 2 == 0){
                System.out.print(i +" ");
            }    
        }
        System.out.println();
        for (int i = N; i > 0; i--) {
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
