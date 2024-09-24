import java.util.Scanner;

public class Variables8 {
    public static void main(String[] args) {
        
    // 8. Calcular área de un círculo

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese el radio: ");
    double radio = scanner.nextDouble();
    double area = Math.PI * Math.pow(radio, 2);
    System.out.println("El área del círculo es: " + area);
    }
}
