
import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Warung Sederhana =====");
        System.out.println("1. Kopi");
        System.out.println("2. Susu");
        System.out.println("3. Teh");
        System.out.println("4. Jus");
        do{
            System.out.print("Masukkan pilihan: ");
            int pilih = input.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("Anda memilih kopi");
                    break;
                case 2:
                    System.out.println("Anda memilih susu");
                    break;
                case 3:
                    System.out.println("Anda memilih teh");
                    break;
                case 4:
                    System.out.println("Anda memilih jus");
                    break;
                case 0:
                    System.out.println("Anda keluar");
                    break;
                default:
                    System.out.println("Kode pilihan tidak di ketahui");
                    break;
            }
            if(pilih == 0) break;
        }while(true);
    }
    
}
