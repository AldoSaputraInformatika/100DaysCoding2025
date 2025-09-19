package day12;

import java.util.Scanner;

public class Day12 {

    public static void main(String[] args) {
        // Saya menggunakan scanner untuk membaca input dari saya nantinya
        Scanner input = new Scanner(System.in);
        // lalu saya mendeklarasikan beberapa variabel biodata sederhana
        String nama;
        String tempat_tanggal_lahir;
        String alamat;
        String agama;
        String no_Telp;
        String email;
        String hobi;
        double tinggi;
        double berat;
        char jenis_kelamin;
        
        /* lalu menginisialisasikan variable yg saya buat 
        tadi dengan menggunakan fungsi dari scannner seperti: 
        nextLine(); untuk tipe data string,
        nextDouble(); untuk tipe data desimal, 
        next().charAt(); untuk tipe data char dengan indeks 0*/
        
        System.out.print("MASUKKAN NAMA                         : ");
        nama = input.nextLine();
        System.out.print("MASUKKAN TEMPAT & TANGGAL LAHIR ANDA  : ");
        tempat_tanggal_lahir = input.nextLine();
        System.out.print("MASUKKAN ALAMAT ANDA SAAT INI         : ");
        alamat = input.nextLine();
        System.out.print("MASUKKAN APA KEYAKINAN/AGAMA ANDA     : ");
        agama = input.nextLine();
        System.out.print("MASUKKAN NO TELEPON(WA)               : ");
        no_Telp = input.nextLine();
        System.out.print("MASUKKAN EMAIL ANDA                   : ");
        email = input.nextLine();
        System.out.print("MASUKKAN HOBY ANDA                    : ");
        hobi = input.nextLine();
        System.out.print("MASUKKAN TINGGI BADAN ANDA            : ");
        tinggi = input.nextDouble();
        System.out.print("MASUKKAN BERAT BADAN ANDA             : ");
        berat = input.nextDouble();
        System.out.print("MASUKKAN JENIS KELAMIN ANDA           : ");
        jenis_kelamin = input.next().charAt(0);
        
        /*Lalu saya memanggil variable yg saya buat tadi dan 
        nilainya sudah di input pada saat program berjalan. 
        Di judul saya memberi escape sequence agar outputnya
        terlihat rapi*/
        
        System.out.print("\n\t====BIODATA DIRI PRIBADI====\n");
        System.out.println("NAMA                                  : " + nama);
        System.out.println("TEMPAT DAN TANGGAL LAHIR              : " + tempat_tanggal_lahir);
        System.out.println("ALAMAT                                : " + alamat);
        System.out.println("JENIS_KELAMIN                         : " + jenis_kelamin);
        System.out.println("BERAT                                 : " + berat);
        System.out.println("TINGGI                                : " + tinggi);
        System.out.println("AGAMA                                 : " + agama);
        System.out.println("NO.TELP                               : " + no_Telp);
        System.out.println("EMAIL                                 : " + email);
        System.out.println("HOBI                                  : " + hobi);
    }

}
