
import java.util.Scanner;

public class Daya82 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlahh elemen: ");
        int element = input.nextInt();
        int[] array = new int[element];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Masukkan element ke " + (i + 1));
            array[i] = input.nextInt();
        }

        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println("");

    }

}
