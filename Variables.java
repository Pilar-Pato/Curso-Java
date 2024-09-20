import java.util.Scanner;

import javax.swing.JOptionPane;

public class Variables {

  public static void main(String[] args) {
      // 1. Declaración e inicialización de variables
      int entera = 8;
      float decimales = 13.3f;
      char simbolo = '&';
      boolean seguro = false;
    
      System.out.println(entera);
      System.out.println(decimales);
      System.out.println(simbolo);
      System.out.println(seguro);

    // 2. Intercambio de 2 variables enteras, sin una tercera variable
    //3. Intercambiar usando operaciones aritméticas

    int a = 10;
    int b = 20;
    System.out.println("A es:" + a);
    System.out.println("B es:" + b);

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("Ahora A es:" + a);
    System.out.println("Ahora B es:" + b);

    //4. Intercambiar usando XOR bit a bit 


    // 5. Leer y mostrar entrada del usuario

    int entero = 78;
    double decimal = 3.14;
    String hi = "Hola";
    System.out.println(entero);
    System.out.println(decimal);
    System.out.println(hi);

    // 6. Suma de dos números

    int x = 10;
    int y = 20;
    int suma  = x + y;
    System.out.println(x + y);

    // 7. Expresiones aritméticas simples

    int simple1 = 3;
    int simple2= 5;
    int simples = a + b * 2;
    System.out.println(simples);

    // 8. Calcular área de un círculo

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el radio: ");
        double radio = scanner.nextDouble();
    double area = Math.PI * Math.pow(radio, 2);
    System.out.println("El área del círculo es: " + area);

    // 9. Aplicación GUI simple
    String name = JOptionPane.showInputDialog("Enter your name");
    JOptionPane.showMessageDialog(null,"Hello " + name); 

       



    }
    }








 
