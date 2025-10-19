import java.util.Scanner;

public class Day42 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan gaji: ");
        int gajip = input.nextInt();
        System.out.print("Masukkan tunjangan: ");
        int tunjangan = input.nextInt();
        System.out.print("Masukkan pajak: ");
        int pajak = (gajip + tunjangan) * 10 / 100;

        int total = (gajip + tunjangan) - pajak;
        String kategori = null;
        if (total >= 5000000) {
            kategori = "Gaji tinggi";
        } else if (total >= 3000000 && total < 5000000) {
            kategori = "Gaji sedang";
        }else{
            kategori = "Gaji rendah";
        }
        
        System.out.println("\n=============== GAJI BERSIH ===============");
        System.out.printf(" Gaji pokok       : %d\n", gajip);
        System.out.printf(" Tunjangan        : %d\n", tunjangan);
        System.out.printf(" Total Pajak      : %d\n", pajak);
        System.out.printf(" Gaji bersih      : %d\n", total);
        System.out.printf(" Kategori gaji    : %s\n", kategori);
        
    }
}
