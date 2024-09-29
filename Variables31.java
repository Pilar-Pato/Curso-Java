public class Variables31 {
    public static void main(String[] args) {
        
        //31. Palíndromo de cadena

        String palabra = "ojo";
         // Puedes cambiar esta palabra por la que quieras probar"

        // Convertimos toda la palabra a minúsculas para evitar problemas con mayúsculas
        palabra = palabra.toLowerCase();

        // Eliminamos espacios y otros caracteres no alfanuméricos
        palabra = palabra.replaceAll("\\s+", "");

        // Invertimos la palabra
        String palabraInvertida = new StringBuilder(palabra).reverse().toString();

        // Comparamos si la palabra original es igual a la invertida
        if (palabra.equals(palabraInvertida)) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");  

        }
    }
}
