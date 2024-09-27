import java.util.Scanner;
public class Variables19 {
    public static void main(String[] args) {
        
    //19. Verificación de elegibilidad para votar
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad, por favor: ");
        int edad = Scanner.nextInt();

        if (edad >=18) {
            System.out.println("Eres mayor de edad, puedes votar");
         }
        else {
            System.out.println("Eres menor de edad, no puedes votar");
        }
        Scanner.close();

    }

    }

    
