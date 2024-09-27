import java.util.Scanner;
import java.util.Random;

public class Variables22 {
    public static void main(String[] args) {
        
// 22. Juego de adivinar el número:
        Scanner Scanner = new Scanner(System.in);
        Random  random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;

        System.out.println("¡Bienvenido al juego Adivina el Número!");
        System.out.println("Adivina el número entre 1 y 100.");

        do {
            System.out.print("Ingresa su numero: ");
             intento = Scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El numero es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El numero es menor.");
            } else {
                System.out.println("¡Felicitaciones! Adivinaste el número.");
            }
        } while (intento != numeroSecreto);

        Scanner.close();


    }
}
