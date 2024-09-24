import java.util.Scanner;
public class Variables15 {
    public static void main(String[] args) {
        
        //15. Verificar si un número es par o impar
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero +"El numero es par");
            }
         else {
            System.out.println(numero +"El numero es impar");
         }
    }

}
