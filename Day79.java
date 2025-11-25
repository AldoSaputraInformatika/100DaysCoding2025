
import java.util.Scanner;

public class Day79 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Masukkan username: ");
            boolean username = input.nextBoolean();
            System.out.print("Masukkan password: ");
            boolean password = input.nextBoolean();

            if(username == true && password == true){
                System.out.println("Selamat Datang");
                break;
            }
            System.out.println("Username atau password tidak valid");
            System.out.println("");
            
        } while (true);
    }

}
