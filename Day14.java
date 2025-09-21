package day14;
public class Day14 {
    public static void main(String[] args) {
       /*Untuk mengkonveri tipe data String ke tipe data primitif itu dengan cara menggunakan fungsi pada java,
        dengan Syaratnya nilai yang kita masukkan harus sesuai dengan tipe data yang akan mengkonversi */
       
       String nilai1 = "120";
       String nilai2 = "1200";
       String nilai3 = "1200";
       String nilai4 = "1200";
       String nilai5 = "1200";
       String nilai6 = "1200";
       String nilai7 = "True";
       String nilai8 = "Aldo Saputra";
    
       
       byte nilai11 = Byte.parseByte(nilai1);
       short nilai22 = Short.parseShort(nilai2);
       int nilai33 = Integer.parseInt(nilai3);
       long nilai44 = Long.parseLong(nilai4);
       float nilai55 = Float.parseFloat(nilai5);
       double nilai66 = Double.parseDouble(nilai6);
       boolean nilai77 = Boolean.parseBoolean(nilai7);
       char nilai88 = nilai8.charAt(0);
       
    
        System.out.println("NILAI11: " + nilai11);
        System.out.println("NILAI22: " + nilai22);
        System.out.println("NILAI33: " + nilai33);
        System.out.println("NILAI44: " + nilai44);
        System.out.println("NILAI55: " + nilai55);
        System.out.println("NILAI66: " + nilai66);
        System.out.println("NILAI77: " + nilai77);
        System.out.println("NILAI88: " + nilai88);
    }
}
