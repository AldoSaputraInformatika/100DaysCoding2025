
import java.util.Scanner;

public class Day83 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan index ke- " + (i+1) + ": ");
            array[i] = input.nextInt();
        }
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println("Total penjumlahan seluruh elemen array: " + total);
        
    }

}
