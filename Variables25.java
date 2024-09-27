import java.util.Scanner;
   
public class Variables25 {
    public static void main(String[] args) {

        // 25.Imprimir patrones

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas deseadas: ");
        int filas = Scanner.nextInt();
        

        for (int i = 1; i <= filas; i++) {
            // Imprime espacios en blanco antes de las estrellas
            for (int j = 1; j <= filas - i; j++) {
                System.out.print(" ");
            }
            // Imprime las estrellas
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println(); // Saltar a la siguiente línea
            
         }
         Scanner.close();
        }
}
