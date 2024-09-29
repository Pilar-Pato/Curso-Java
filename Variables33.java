import java.util.Scanner;
public class Variables33 {
    public static void main(String[] args) {
        
        //33. Convertir cadena a entero:

        Scanner Scanner = new Scanner(System.in);

        // 
        System.out.print("Ingrese una cadena de texto que represente un numero: ");
        String cadenaNumero = Scanner.nextLine();

        try {
            /*ingresamos caracteres y el programa lo convierte en numero
             como string en int, convertir la cadena a un entero utilizando Integer.parseInt() */
            int numero = Integer.parseInt(cadenaNumero);

            // Se suma 10 la numero
            int resultado = numero + 10;

            System.out.println("El numero resultante es: " + resultado);
            // utilizamos catch para usar la Exception
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena ingresada no es un número válido.");
        } finally {
            Scanner.close(); // Cerramos el Scanner
        }
    }
}
