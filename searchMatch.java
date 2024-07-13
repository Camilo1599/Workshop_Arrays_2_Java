
import java.util.Arrays;
import java.util.Scanner;

public class searchMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Alejandro", "Juan", "Fernando", "Diego", "Andres", "Felipe"};
        String search;
        
        System.out.println("Ingrese el nombre a buscar:");
        search = scanner.nextLine();
        search = search.toLowerCase();


        for(int i=0; i<names.length; i++){
            names[i] = names[i].toLowerCase();
        }

        for(int i=0; i<names.length; i++){
            if(names[i].equals(search)){
                System.out.println("El nombre " + names[i] + " se encuentra en la posición: " + i);
                break;
            }else{
                if(i == names.length - 1){
                    System.out.println("El nombre " + search + " no se encuentra en la lista.");
                }
            }

        }

        

        System.out.println(Arrays.toString(names));

        scanner.close();

    }
    
}
