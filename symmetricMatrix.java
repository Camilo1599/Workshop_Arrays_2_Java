
import java.util.Arrays;


public class symmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {5,5,7},
            {3,8,9}
        };
        int[][] matrixT = new int[3][3];
        boolean isSymetric = true;

        for(int i=0; i<matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrixT[j][i] = matrix[i][j];
            }
        }
        

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<i; j++){
                if(matrix[i][j] != matrix[j][i]){
                    isSymetric = false;
                    break;
                }
            }
        }
        if(isSymetric){
            System.out.println("La matriz es simetrica");
        }else {
            System.out.println("La matriz no es simetrica");
        }
        System.out.println("La matriz: " + Arrays.deepToString(matrix) + " es diferente a la matriz: " + Arrays.deepToString(matrixT));
    }

}
