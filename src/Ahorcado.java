
import java.util.Scanner;

public class Ahorcado{
    public static void main(String[] args) throws Exception {
        
        // clase escanner que nos permite que el usuario escriba
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabrasecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Arreglos
        char[] letrasAdivinadas = new char[palabrasecreta.length()];

        //Estructura de control: Iteractiva (bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.print(letrasAdivinadas[i]);
        }

        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabrasecreta.length() + " letras)" );
            System.out.println("Introduce una letra, por favor: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            boolean letraCorrecta = false;

            for (int i = 0; i < palabrasecreta.length(); i++) { 
                // estructura de control: condicional
                if (letra == palabrasecreta.charAt(i)) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡ inCorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos");
            } 
            if(String.valueOf(letrasAdivinadas).equals(palabrasecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades! Has adivinado la palabra secreta: " + palabrasecreta);
            }
        }

        if (!palabraAdivinada) {
            System.out.println("!que pena, te has quedado sin intentos");
            
        } 
        scanner.close();
     
}

}
