public class Day02 {
    public static void main(String[] args) {
        // "println()" Untuk menampilkan output lalu menampilkannya di baris baru yang telah di tambah.
        System.out.println("Aldo Saputra");
        
        // "print()" Untuk menamplkan output, tapi tetap di satu baris atau tdak menambah baris baru di akhir.
        System.out.print("Aldo ");
        System.out.print("Saputra\n");
        
        // "printf()" atau print formatted untuk menampilkan output dengan format tertentu 
        String nama = "Aldo";
        int umur = 19;
        double berat = 500.3;
        double berat2 = 600.40;
        char nilai = 'u';
        boolean makan = true;
        System.out.printf("nama: %s , umur: %d , berat: %f , berat: %.2f, nilai: %c, makan: %b" , nama , umur , berat, berat2, nilai, makan);
        
    
    }
    
}
