package LogicaDeProgramacionJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiccionarioEspañolIngles {
	public static void main(String[] args) {
       
        Map<String, String> diccionario = new HashMap<>();

        
        
        diccionario.put("cebra", "zebra");
        diccionario.put("carro", "car");
        diccionario.put("estrella", "star");
        diccionario.put("libro", "book");
        diccionario.put("manzana", "apple");
        diccionario.put("gris", "gray");
        diccionario.put("perro", "dog");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("caballo", "horse");
        diccionario.put("rojo", "red");
        diccionario.put("negro", "black");
        diccionario.put("verde", "green");
        diccionario.put("amarillo", "yellow");
        diccionario.put("cielo", "sky");
        diccionario.put("playa", "beach");
        diccionario.put("sopa", "soup");
        diccionario.put("montaña", "mountain");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Introduce una palabra en español: ");
        String palabraEspañol = scanner.nextLine().toLowerCase();

        scanner.close();

    
        String traduccionIngles = diccionario.get(palabraEspañol);

        if (traduccionIngles != null) {
            System.out.println(traduccionIngles);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }
    }

}
