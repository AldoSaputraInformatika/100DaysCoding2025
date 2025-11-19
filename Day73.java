import java.util.Scanner;
public class Day73 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int total = 0 ;
        while(true){
            System.out.print("Masukkan angka: ");
            int a = input.nextInt();
            if(a < 0){
                System.out.println("Total: " + total);
                break;
            }
            total+=a;
        }
    }
}
