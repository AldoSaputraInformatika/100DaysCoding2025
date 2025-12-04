package Day88;

import java.util.Scanner;

public class Day88 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan elemen: ");
        int elemen = input.nextInt();
        input.nextLine();

        String[] array = new String[elemen];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan element indeks ke- " + i + ": ");
            array[i] = input.nextLine();
        }
        for (String x : array) {
            System.out.print(x + " ");
        }
        System.out.println("");

    }

}
