
import java.util.Scanner;
import java.util.Arrays;

public class Day100 {

    static Integer[] arrayBaru;
    static int n;

    static int retas(int[] arr) {
        n = arr.length;
        arrayBaru = new Integer[n];
        int totalPergeseran = 0;

        for (int x : arr) {
            int targetIndex = x % n;
            int currentShift = 0;

            while (arrayBaru[targetIndex] != null) {
                targetIndex = (targetIndex + 1) % n;
                currentShift++;
            }

            arrayBaru[targetIndex] = x;

            totalPergeseran += currentShift;
        }

        return totalPergeseran;
    }

    static String susunKode(int p) {

        int indexPenentu = p % n;
        int panjangSandi = arrayBaru[indexPenentu];

        StringBuilder sb = new StringBuilder();
        int currentIndex = 0;

        while (sb.length() < panjangSandi) {

            String angka = String.valueOf(arrayBaru[currentIndex]);
            sb.append(angka);

            currentIndex = (currentIndex + 1) % n;
        }

        return sb.substring(0, panjangSandi);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int jumlahData = scanner.nextInt();
            int[] masukan = new int[jumlahData];

            for (int i = 0; i < jumlahData; i++) {
                masukan[i] = scanner.nextInt();
            }

            int p = retas(masukan);

            String hasilSandi = susunKode(p);
            System.out.println(hasilSandi);
        }

        scanner.close();
    }
}
