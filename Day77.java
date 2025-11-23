
public class Day77 {

    public static void main(String[] args) {

        String nama = "Aldo Saputra";
        String nama2 = " Aldo Saputra ";
        //1.
        //.substring() adalah method dari string dimana kita bisa memotong teks dengan menentukan titik awal atau menentukan titik awal dan akhir
        //a. menentukan titik awalnya saja
        System.out.println(nama.substring(2));
        //b. menentukan titik awal dan akhirnya
        System.out.println(nama.substring(2, 4));

        //2.
        //.replace() adalah method dari string untuk menganti semua isi teks atau kata tertantu
        System.out.println(nama.replace("Aldo", "Alde"));
        //3.
        //.trim() adalah method dari string untuk menghapus spasi didepan dana belakang teks namun tidakk menghapus spasi tengah
        System.out.println(nama2.trim());
    }

}
