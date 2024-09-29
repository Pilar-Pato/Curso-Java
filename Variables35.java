import java.util.ArrayList;
import java.util.Scanner;

public class Variables35 {
    public static void main(String[] args) {
        
        /*35. Lista dinámica de enteros: Escribe un programa que permita al usuario
        ingresar enteros en un ArrayList, luego muestre la lista y su suma.*/

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;  


        System.out.println("Ingresa números enteros. Para terminar, ingresa 0.");

        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            
            if (numero != 0) {
                 numeros.add(numero);
            }
        } while (numero != 0);

        System.out.println("\nLista de números ingresados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        // Calcular la suma
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        System.out.println("\nLa suma de los números es: " + suma);

        scanner.close();
    }
}
