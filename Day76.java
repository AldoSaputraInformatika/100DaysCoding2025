
public class Day76 {

    public static void main(String[] args) {

        String b = "Mie Ayam";
        String c = "Mie ayam";
        //.equals() digunakan apabila kita ingin membandingkan nilai dari String secara akurat
        System.out.println(b.equals(c));
        //.equalsIgnoreCase() sama dengan equals, namun tidak peduli dengan besar kecilnya huruf
        System.out.println(b.equalsIgnoreCase(c));
        //.contains() digunakan untuk mengecek apabila teks mengandung kata tertentu
        System.out.println(b.contains("Mie"));
        //.isEmpty()digunakan untuk mengecek nilai dari string apakah tidak ada teks sama sekali
        System.out.println(b.isEmpty());

    }
}
