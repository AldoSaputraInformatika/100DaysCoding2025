public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // LUAS PERSEGI PANJANG = p * l
        short panjang;
        short lebar;
       
        System.out.print("MASUKKAN PANJANG: ");
        panjang = input.nextShort();
        System.out.print("MASUKKAN LEBAR: ");
        lebar = input.nextShort();
        
         int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang "+ luas);
        
      
        
    }

}
