import java.util.Scanner;

public class Variables21 {
    public static void main(String[] args) {

        // 21. Suma de números naturales

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        int suma = 0;
        int naturales = 1;

        while (naturales <= numero) {
            suma += naturales; 
            naturales++;}

        System.out.println("La suma de los numeros naturales hasta " + numero + " es: " + suma);

        scanner.close();
     }
}
