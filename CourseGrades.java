import java.util.Scanner;
import java.util.Arrays;
public class CourseGrades {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int amount;
        System.out.println("Cuantas notas tienes hasta el momento:");
        amount = scanner.nextInt();
        double necessaryAverage, missingScore;
        int notesRemaining = 8 - amount;
        double sum=0;
        double[] califications = new double[amount];

        if(amount == 8){
            for (int i = 1; i <= amount ; i++){
                System.out.println("Ingresa tu nota" + " numero: " + i );
                double grade = scanner.nextDouble();
                califications[i-1] = grade;
                
            }
            for (double grade : califications) {
                sum += grade;
            }
            sum /= 8;
    
            if(sum < 76){
                System.out.println("lo siento no aprobaste");
            } else{
                System.out.println("Felicidades aprobaste");
            }

        }else if(amount < 8){
            for (int i = 1; i <= amount ; i++){
                System.out.println("Ingresa tu nota" + " numero: " + i );
                double grade = scanner.nextDouble();
                califications[i-1] = grade;
                
            }
            for (double grade : califications) {
                sum += grade;
            }
            missingScore = 608 - sum;
            necessaryAverage = missingScore/notesRemaining;
    
            System.out.println("Tus notas son: " + Arrays.toString(califications));
    
            System.out.println("El promedio que necesitas en las notas faltantes es: " + necessaryAverage);

        } else{
            System.out.println("No puedes ingresar mas de 8 notas");
        }
        

        scanner.close();



    }    
}
