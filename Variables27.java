import java.util.Scanner;

public class Variables27{

    public static void main(String[] args) {
        
        //27. Encontrar el mayor elemento en un array
        // Pedir al usuario el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo:");
        Scanner Scanner = new Scanner(System.in);
        int tamano = Scanner.nextInt();

        // Crear el arreglo
        int[] arreglo = new int[tamano];

        // Llenar el arreglo con valores ingresados por el usuario
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = Scanner.nextInt();
        }

        // Encontrar el mayor elemento
        int mayor = arreglo[0]; 
        // Inicializamos el mayor con el primer elemento
        for (int i = 1; i < tamano; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }

        // Imprimir el resultado
        System.out.println("El mayor elemento del arreglo es: " + mayor);

        Scanner.close();
    }
}

    

