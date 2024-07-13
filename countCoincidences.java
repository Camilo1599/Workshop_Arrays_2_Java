import java.util.Arrays;

public class countCoincidences{
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 2, 5, 2, 2, 6, 4, 3, 2, 3, 5};

        
        int[] frecuencia = new int[array.length];
        boolean[] visitado = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            int cuenta = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && !visitado[j]) {
                    visitado[j] = true;
                    cuenta++;
                }
            }
            if (!visitado[i]) {
                frecuencia[i] = cuenta;
            }
        }

        System.out.println("lista original: " + Arrays.toString(array));
        System.out.println("Elementos ordenados por frecuencia (de mayor a menor):");
        for (int i = 0; i < frecuencia.length; i++) {
            if (visitado[i]) {
                continue;
            }
            int maxFrecuencia = frecuencia[i];
            int elemento = array[i];
            for (int j = i + 1; j < frecuencia.length; j++) {
                if (frecuencia[j] > maxFrecuencia && !visitado[j]) {
                    maxFrecuencia = frecuencia[j];
                    elemento = array[j];
                }
            }
            visitado[i] = true;
            frecuencia[i] = maxFrecuencia;

            // Imprimir el elemento y su frecuencia
            System.out.println("Elemento " + elemento + ": " + maxFrecuencia + " veces");
        }
    }
}

