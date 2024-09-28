import java.util.Collections;
import java.util.Arrays;
public class Variables28 {
    public static void main(String[] args) {
        
    //28. Invertir un array
    Integer[] numeros = {1, 2, 3, 4, 5};

        // Convertir el arreglo de int a Integer para poder usar Collections
        // Esto es necesario porque Collections trabaja con objetos, no con tipos primitivos
        
        // Invertir el arreglo
        Collections.reverse(Arrays.asList(numeros));

        // Imprimir el arreglo invertido
        System.out.println(Arrays.toString(numeros));
    }
}
