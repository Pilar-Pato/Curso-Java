import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Variables36 {
    public static void main(String[] args) {
        
        /*36. Eliminar duplicados: Escribe un programa que elimine los elementos
    duplicados de un ArrayList de cadenas de texto.*/
    List<String> listaConDuplicados = new ArrayList<>();
    listaConDuplicados.add("perro");
    listaConDuplicados.add("gato");
    listaConDuplicados.add("pez");
    listaConDuplicados.add("perro");
    listaConDuplicados.add("hormiga");

    System.out.println("Lista original: " + listaConDuplicados);

    // Eliminar duplicados usando HashSet
    HashSet<String> SinDuplicados = new HashSet<>(listaConDuplicados);
    List<String> listaSinDuplicados = new ArrayList<>(SinDuplicados);

    System.out.println("Lista sin duplicados: " + listaSinDuplicados);
}
}
