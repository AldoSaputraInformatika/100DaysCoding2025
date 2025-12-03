
import java.util.Scanner;

public class Day87 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] teks = {"apel", "mangga", "jeruk", "anggur", "adid"};
        String x = input.nextLine();
        boolean a = false;

        for (int i = 0; i < teks.length; i++) {
            if (teks[i].equalsIgnoreCase(x)) {
                a = true;
                if (a) {
                    System.out.println("Buah tersedia");
                }
            }

        }
        if (a == false) {
            System.out.println("Tidak tersedia");
        }
    }

}
