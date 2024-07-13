
import java.util.Arrays;

public class InvertArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[arr.length];

        for (int i = 0, j = arr.length-1; i < arr.length; i++, j--) {
            arr2[i]=arr[j];

        }
        System.out.println(Arrays.toString(arr2));
    }
}
