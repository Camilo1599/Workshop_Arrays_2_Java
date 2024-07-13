//Investigación 2: Map

//Map  en Java es una interfaz fundamental que proporciona una estructura de datos eficiente para almacenar y manipular pares clave-valor.
import java.util.Map;
import java.util.TreeMap;
public class mapExample {
    public static void main(String[] args) {
        Map<String, Integer> fruitCountMap = new TreeMap<>();

        // Agregar elementos al TreeMap
        fruitCountMap.put("Apple", 5);
        fruitCountMap.put("Banana", 10);
        fruitCountMap.put("Orange", 7);

        // Acceder a un valor usando una clave
        int count = fruitCountMap.get("Banana");
        System.out.println("Cantidad de bananas: " + count);

        // Iterar sobre el TreeMap
        System.out.println("Inventario de frutas:");
        fruitCountMap.forEach((fruta, cantidad) -> System.out.println(fruta + ": " + cantidad));
    }
}

        
