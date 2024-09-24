public class Variables3 {
    public static void main(String[] args) {
    
    //3. Intercambiar usando operaciones aritméticas
        
    int a = 10;
    int b = 20;
    System.out.println("A es:" + a);
    System.out.println("B es:" + b);

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("Ahora A es:" + a);
    System.out.println("Ahora B es:" + b);
    }
}
