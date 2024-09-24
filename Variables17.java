import java.util.Scanner;
public class Variables17 {
    public static void main(String[] args) {

     // 17. Calculadora simple usando switch
    Scanner Scanner = new Scanner(System.in);

    System.out.println("Ingrese el primer numero:");
    double num1 = Scanner.nextDouble();
    System.out.println("Ingrese el segundo numero:");
    double num2 = Scanner.nextDouble();
    System.out.println("Elija la operación:");
    System.out.println("1. Sumar");
    System.out.println("2. Restar");
    System.out.println("3. multiplicar");
    System.out.println("4. Dividir");
    System.out.println("Ingrese el numero de la operacion");
    int opcion = Scanner.nextInt();
    double resultado = 0;
    switch (opcion) {
        case 1:
        resultado = num1 + num2;
          break;
        case 2:
        resultado = num1 - num2;
        break;
        case 3:
        resultado = num1 * num2;
        break;
        case 4:
        if (num2 == 0) {
        System.out.println("No se puede dividir entre cero!");}
         else {
        resultado = num1 / num2;
         }
         break;
        default:
    System.out.println("Opción inválida!");
    }
    if (opcion >= 1 && opcion <= 4 && num2 != 0) {
    System.out.println("El resultado es: " + resultado);
        
    }
       
 }
    
}  

