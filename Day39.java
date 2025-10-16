import java.util.Scanner;

public class Day39 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("MASUKKAN MENU 1 - 2 ATAU 0 UNTUK KELUAR");
        int menu = input.nextInt();
        if (menu == 1) {
            String nama = "Budi";
            String kelas = "Kelas C";
            final String nim = "D0123456";
            String asal = "New York";
            int umur = 19;
            System.out.println("================== PROFIL ==================");
            System.out.println("Nama : " + nama);
            System.out.println("Kelas : " + kelas);
            System.out.println("NIM : " + nim);
            System.out.println("Asal : " + asal);
            System.out.println("Umur : " + umur);
            System.out.println("============================================");

        }else if(menu == 2){
            System.out.println("================== JADWAL MATA KULIAH ==================");
            System.out.print("MASUKKAN HARI UNTUK MELIHAT JADWAL ANDA");
            input.nextLine();
            String hari = input.nextLine();
            if(hari.equals("senin")){
                System.out.println("Dasar Dasar Pemrograman ------  7.30  ------ ICT01");
            }else if(hari.equals("selasa")){
                System.out.println("Matematika Dasar        ------  15.0  ------ HP05");
            }else if(hari.equals("rabu")){
                System.out.println("Fisika                  ------  7.30  ------ ICT01");
            }else{
                System.out.println("TIDAK ADA JADWAL");
            }
        }else if (menu == 0){
            System.out.println("ANDA KELUAR");
        }else{
            System.out.println("KODE MENU TIDAK DIKETAHUI");
        }
    }

}
