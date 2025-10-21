import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();
        String predikat = null;
        if(nilai >= 90){
            predikat = "A";
        }else if(nilai >= 80){
            predikat = "B";
        }else if(nilai >= 70){
            predikat = "C";
        }else if(nilai >= 60){
            predikat = "D";
        }else {
            predikat = "E";
        }
        
        System.out.println("TOTAL NILAI: " + nilai);
        System.out.println("PREDIKAT   : " + predikat);
    }
    
}
