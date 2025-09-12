public class Tipedatanumerik{
    public static void main(String[]args){
        byte umur = 127;
        // rentang nilai byte -128 sampai 127 (8 bit)
        short jarak_lari = -32768;
        // rentang nilai short -32768 sampai 32767 (16 bit)
        int jarak_tempuh_roket = 2147483647;
        // rentang nilai int -2147483648 (32 bit)
        long jarak_tempuh_roket2 = 9223372036854775807L;
        /* rentang nilai -9223372036854775808 sampe 9223372036854775807 
           pake L untuk menandakan bilangan besar*/
        System.out.println("byte: "+ umur);
        System.out.println("short: "+ jarak_lari);
        System.out.println("int: "+ jarak_tempuh_roket);
        System.out.println("long: "+ jarak_tempuh_roket2);
    }
}
