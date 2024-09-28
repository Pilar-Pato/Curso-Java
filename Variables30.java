public class Variables30 {
    public static void main(String[] args) {
        
        // 30. Transpuesta de una matriz:
        int[][] matrizOriginal = {{1, 2, 3}, {4, 5, 6}};
        int filas = matrizOriginal.length;
        int columnas = matrizOriginal[0].length;

        // Crear una matriz para almacenar la transpuesta
        int[][] matrizTranspuesta = new int[columnas][filas];

        // Calcular la transpuesta
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        // Imprimir la matriz transpuesta
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matrizTranspuesta[i][j] + " ");
            }
            System.out.println(); 

        }
    }
}

