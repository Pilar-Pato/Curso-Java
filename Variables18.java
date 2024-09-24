import java.util.Scanner;
public class Variables18 {
    public static void main(String[] args) {

    // 18. Días de la semana
    Scanner Scanner = new Scanner(System.in);
    System.out.println("Ingrese el numero entre el 1 y el 7");
    int numero = Scanner.nextInt();
    switch (numero) {
    case 1: System.out.println("Es lunes!");
    break;
    case 2: System.out.println("Es martes!");
    break;
    case 3: System.out.println("Es miercoles!");
    break;
    case 4: System.out.println("Es jueves!");
    break;
    case 5: System.out.println("Es viernes!");
    break;
    case 6: System.out.println("Es sábado!");
    break;
    case 7: System.out.println("Es domingo!");
    break;
             
    default: System.out.println("Eso no es día!");
    }

    }

}
