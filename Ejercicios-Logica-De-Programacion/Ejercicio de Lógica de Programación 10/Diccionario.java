package LogicaDeProgramacionJava;

import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
	public static void main(String[] args) {
        
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("hablar", "speak");
        diccionario.put("adiós", "goodbye");
        diccionario.put("cero", "zero");
        diccionario.put("casa", "house");
        diccionario.put("cebra", "zebra");
        diccionario.put("dormir", "sleep");
        diccionario.put("sol", "sun");
        diccionario.put("beber", "drink");
        diccionario.put("bueno", "good");
        diccionario.put("luna", "moon");
        diccionario.put("estrella", "star");
        diccionario.put("perro", "dog");
        diccionario.put("limpio", "clear");
        diccionario.put("computadora", "computer");
        diccionario.put("furia", "fury");
        diccionario.put("padre", "father");
        diccionario.put("carro", "car");
        diccionario.put("manzana", "apple");
        diccionario.put("azul", "blue");
        diccionario.put("cielo", "sky");

        
        String[] palabrasEspañol = diccionario.keySet().toArray(new String[0]);
        String[] palabrasAleatorias = obtenerPalabrasAleatorias(palabrasEspañol, 5);

        
        int solucionessCorrectas = 0;
        int solucionesIncorrectas = 0;
        Scanner scanner = new Scanner(System.in);
        for (String palabraEspañol : palabrasAleatorias) {
            System.out.print("Traducción de '" + palabraEspañol + "' al inglés: ");
            String solucionUsuario = scanner.nextLine().trim().toLowerCase();
            String traduccionCorrecta = diccionario.get(palabraEspañol).toLowerCase();
            if (solucionUsuario.equals(traduccionCorrecta)) {
                solucionesCorrectas++;
            } else {
                solucionesIncorrectas++;
            }
        }

        
        System.out.println("\nResultado:");
        System.out.println("Soluciones correctas: " + solucionesCorrectas);
        System.out.println("Souluciones incorrectas: " + solucionesIncorrectas);
    }

    
    private static String[] obtenerPalabrasAleatorias(String[] palabras, int cantidad) {
        int totalPalabras = palabras.length;
        if (cantidad > totalPalabras) {
            cantidad = totalPalabras;
        }

        String[] palabrasAleatorias = new String[cantidad];
        boolean[] palabrasSeleccionadas = new boolean[totalPalabras];

        int palabrasSeleccionadasCount = 0;
        while (palabrasSeleccionadasCount < cantidad) {
            int indiceAleatorio = (int) (Math.random() * totalPalabras);
            if (!palabrasSeleccionadas[indiceAleatorio]) {
                palabrasAleatorias[palabrasSeleccionadasCount] = palabras[indiceAleatorio];
                palabrasSeleccionadas[indiceAleatorio] = true;
                palabrasSeleccionadasCount++;
            }
        }

        return palabrasAleatorias;
    }

}
