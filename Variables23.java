import java.util.Scanner;

public class Variables23 {
    public static void main(String[] args) {

        // 23. Imprimir tabla de multiplicar
        
         Scanner Scanner = new Scanner(System.in); 


        System.out.print("Ingrese un numero para ver su tabla de multiplicar: ");
        int numero = Scanner.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        Scanner.close();
    }
}
