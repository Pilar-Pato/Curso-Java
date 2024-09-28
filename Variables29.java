public class Variables29 {
    public static void main(String[] args) {
        
        //29. Suma de matrices
        int[][] matriz1 = {{3, 2, 3}, {7, 5, 5}};
        int[][] matriz2 = {{1, 8, 5}, {10, 10, 10}};
        int[][] suma = new int[matriz1.length][matriz1[0].length];

        // Sumamos elemento a elemento
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Imprimimos la matriz resultante
        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[0].length; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }
    }
}
