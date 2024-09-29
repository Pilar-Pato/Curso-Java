import java.util.Scanner;
public class Variables26 {
    public static void main(String[] args) {
        
        /*Multiplicación de matrices: Escribe un programa que multiplique dos matrices
ingresadas por el usuario usando bucles anidados.*/
            Scanner scanner = new Scanner(System.in);

            // Pedir al usuario las dimensiones de las matrices
            System.out.print("Ingrese el número de filas de la primera matriz: ");
            int filasA = scanner.nextInt();
            System.out.print("Ingrese el número de columnas de la primera matriz y filas de la segunda: ");
            int columnasA = scanner.nextInt();
            System.out.print("Ingrese el número de columnas de la segunda matriz: ");
            int columnasB = scanner.nextInt();
    
            // Crear las matrices
            int[][] matrizA = new int[filasA][columnasA];
            int[][] matrizB = new int[columnasA][columnasB];
            int[][] resultado = new int[filasA][columnasB];
    
            // Llenar la primera matriz
            System.out.println("Ingrese los elementos de la primera matriz:");
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasA; j++) {
                    matrizA[i][j] = scanner.nextInt();
                }
            }
    
            // Llenar la segunda matriz
            System.out.println("Ingrese los elementos de la segunda matriz:");
            for (int i = 0; i < columnasA; i++) {
                for (int j = 0; j < columnasB; j++) {
                    matrizB[i][j] = scanner.nextInt();
                }
            }
    
            // Multiplicar las matrices
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasB; j++) {
                    for (int k = 0; k < columnasA; k++) {
                        resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }
    
            // Imprimir la matriz resultante   
    
            System.out.println("La matriz resultante es:");
            for (int i = 0; i < filasA; i++) {
                for (int j = 0; j < columnasB; j++) {
                    System.out.print(resultado[i][j] + " ");
                }
                System.out.println();
            }
    
            scanner.close();
        }
    }
