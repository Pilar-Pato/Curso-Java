import java.util.Scanner;
public class Variables16 {
    public static void main(String[] args) {

        // 16. Comprobar si un año es bisiesto
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el año");
        int año = scanner.nextInt();
        if (año % 4 == 0) {
            System.out.println(año + " Su año es bisiesto");
        }
        else {
            System.out.println(año + " Su año no es bisiesto");
        }
            
        }

    }


        