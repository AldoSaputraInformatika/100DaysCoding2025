
import java.util.Scanner;

public class Day46 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga = 0;
        System.out.println("========== Toko Helm Murah ==========");
        System.out.println("1. Helm open face");
        System.out.println("2. Helm full face");

        System.out.print("Masukkan Pilihan Menu: ");
        int menu = input.nextInt();
        switch (menu) {
            case 1:
                System.out.println("========== Menu Helm Open Face ==========");
                System.out.println("1. Kyoto: 50000");
                System.out.println("2. Voodoo: 70000");
                System.out.println("3. Forever: 60000");
                System.out.print("Masukkan Pilihan Helm: ");
                int helm = input.nextInt();
                switch (helm) {
                    case 1:
                        harga += 50000;
                        break;
                    case 2:
                        harga += 70000;
                        break;
                    case 3:
                        harga += 60000;
                        break;

                }
                break;
            case 2:
                System.out.println("========== Menu Helm Full Face ==========");
                System.out.println("1. NJS: 350000");
                System.out.println("2. NHK: 600000");
                System.out.println("3. Jitsu: 550000");
                System.out.print("Masukkan Pilihan Helm: ");
                int helm2 = input.nextInt();
                switch (helm2) {
                    case 1:
                        harga += 350000;
                        break;
                    case 2:
                        harga += 600000;
                        break;
                    case 3:
                        harga += 550000;
                        break;
                }
                break;

        }
        System.out.print("Masukkan jumlah beli: ");
        int jumlah = input.nextInt();
        System.out.print("Masukkan jumlah uang: ");
        int uang = input.nextInt();

        int totalh0 = harga * jumlah;
        int kembalian = uang - totalh0;

        if (uang > totalh0) {
            System.out.println("========== Menu Helm Full Face ==========");
            System.out.println("Jumlah harga            : " + harga);
            System.out.println("Jumlah beli             : " + jumlah);
            System.out.println("Jumlah uang             : " + uang);
            System.out.println("Total harga bayar       : " + totalh0);
            System.out.println("Total kembalian         : " + kembalian);
            
            
        } else {
            System.out.println("Uang anda tidak cukup");
        }

    }

}
