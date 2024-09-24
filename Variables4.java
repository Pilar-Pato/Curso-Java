public class Variables4 {
    public static void main(String[] args) {

        // Intercambiar usando XOR bit a bit:
        int a = 10;
        int b = 20;
        System.out.println("a es: " +a);
        System.out.println("a es: " +b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Ahora a es: " +a);
        System.out.println("Ahora b es: " +b);

        
    }

}
