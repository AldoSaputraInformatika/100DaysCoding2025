
import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
    do{
        int a = input.nextInt();
        total += a;
        if(a == 0){
            break;
        }
    }while(true);
        System.out.println("Total: " + total);
    }
}
