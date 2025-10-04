import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang rumah: ");
        int panjang = input.nextInt();
        System.out.println("Masukkan lebar rumah: ");
        int lebar = input.nextInt();
        int luasrumah = panjang * lebar;
        
        int luaskeramik = 2*2;
        
        int minkeramik = luasrumah / luaskeramik;
        
        System.out.println("MINIMAL KERAMIK YANG DI BUTUHKAN ADALAH " + minkeramik);
        
        
    }
}
