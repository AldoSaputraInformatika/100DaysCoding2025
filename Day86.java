
public class Day86 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Nilai min: " + min);

    }

}
