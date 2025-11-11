import java.util.Scanner;
public class Day65 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int hasil = 1;
        if(n == 0){
            hasil = 1;
        }
        for(int i = n; i >= 1;i--){
            hasil *=i;
        }
        System.out.println("Hasil faktorial bilangan " + hasil);
    }
}
