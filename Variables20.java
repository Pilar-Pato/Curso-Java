import java.util.Scanner;
public class Variables20 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
    
    System.out.println("Introduzca un numero:");
    int numero = Scanner.nextInt();

    boolean positivoYPar = (numero > 0) && (numero % 2 == 0);

    boolean negativoODivisible =(numero < 0) || (numero % 3 == 0);

    if (positivoYPar) {
        System.out.println(" El numero es positivo y par");
       }
    else {
        System.out.println("El numero no es positivo y par");
    }
    if (negativoODivisible) {
        System.out.println(" El numero es negativo o divisible por 3");
       }
    else {
        System.out.println("El numero no es negativo o divisible por 3");
    }
    Scanner.close();   

    }
}
