
import java.util.Scanner;

public class Day79 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Buat username: ");
        String username = input.nextLine();
        System.out.print("Buat password: ");
        String password = input.nextLine();
        do {
            System.out.print("Masukkan username: ");
            String username1 = input.nextLine();
            System.out.print("Masukkan password: ");
            String password1 = input.nextLine();

            if(username1.equals(username) && password.equals(password)){
                System.out.println("Selamat Datang");
                break;
            }
            System.out.println("Username atau password tidak valid");
            System.out.println("");
            
        } while (true);
    }

}
