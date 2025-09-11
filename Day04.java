public class Escape_sequence {
    public static void main(String[] args) {
        // ESCAPE SEQUENCE
        
        // 1. (\n) membuat baris baru seperti enter.
        System.out.println("Aldo\nSaputra\n");
        // 2. (\t) membuat Tab horizontal/mendatar atau seperti tombol tab pada komputer.
        System.out.println("Aldo\tSaputra\n");
        // 3. (\r) menarik kursor ke tempat awal jika ada teks sebelum (\r) maka akan hilang karna di timpa teks setelah (\r)
        System.out.println("Aldo\rSaputra\n");
        // 4. (\b) seperti tombol backspace pada komputer dia akan menghapus huruf pada teks.
        System.out.println("Aldo\b\b\bSaputra\n");
        // 5. (\f) digunakan untuk memindahkan kertas ke halaman baru pada printer. 
        System.out.println("Aldo\f\fSaputra\n");
        // 6. (\") digunakan untuk menampilkan tanda kutip "
        System.out.println("\"AldoSaputra\"\n");
        // 7. (\') digunakan untuk menampilkan tanda kutip '
        System.out.println("\'AldoSaputra\'\n");
        // 8. (\\) digunakan untuk menampilkan karakter backlash \
        System.out.println("makan\\lapar\n");
        /* 9. (\UXXXX) digunakan untuk menampilkan UNICODE Atau standar internasional pengkodean karakter.
        contohnya sepertii di bawah ini untuk kode ALDO */
        System.out.println("\u0041\u004C\u0044\u004F\n");
        // 10.(\0 hingga 377) Menampilkan karakter ASCII dari nilai oktal (1–3 digit)
        System.out.println("\0\1\2\3");
        
       
    }
    
}
