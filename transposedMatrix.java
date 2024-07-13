
import java.util.Arrays;

public class transposedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5,0}, {9,8,7}};
        
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<i;j++){
                int acum= matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = acum;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
