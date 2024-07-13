//Investigación 1: ArrayList

//Los ArrayList en Java son extremadamente útiles cuando necesitas manejar colecciones de datos que pueden cambiar de tamaño dinámicamente. Permiten agregar, eliminar, acceder y modificar elementos de manera eficiente

import java.util.ArrayList;
public class arrayList {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("Elementos de el ArrayList: " );
        for(Integer numero : numeros){
            System.out.println(numero);
        }
    }

}