import java.util.Scanner;
public class CalculadoraIa {
  public static void main(String[] args) {
  Scanner Scanner = new Scanner(System.in);
  System.out.println("¡Vamos a calcular!");
  // Pedir al usuario los números
  System.out.print("Ingrese el primer número: ");
  double num1 = Scanner.nextDouble();
  System.out.print("Ingrese el segundo número: ");
  double num2 = Scanner.nextDouble();
  // Pedir al usuario que elija la operación
  System.out.println("Elija la operación:");
  System.out.println("1. Sumar");
  System.out.println("2. Restar");
  System.out.println("3. Dividir");
  System.out.print("Ingrese el número de la operación: ");
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
  if (num2 == 0) {
  System.out.println("Error: No se puede dividir entre cero.");
  } else {
  resultado = num1 / num2;
  }
  break;
  default:
  System.out.println("Opción inválida.");
  }
  // Mostrar el resultado
  if (opcion >= 1 && opcion <= 3 && num2 != 0) {
  System.out.println("El resultado es: " + resultado);
  }
  }
  }
  

      
      
    

     
      
       

    

