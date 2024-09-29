import java.util.Scanner;
public class Variables32 {
    public static void main(String[] args) {
        
        //32. Contar vocales en una cadena

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        scanner.close();

        // Convertimos la cadena a minúsculas para facilitar la comparación
        cadena = cadena.toLowerCase();

        int contadorVocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (esVocal(caracter)) {
                contadorVocales++;
            }
        }

        System.out.println("La cadena tiene " + contadorVocales + " vocales.");
       
    }
   
    // Método para verificar si un caracter es una vocal
    public static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}





   