import java.util.Random;
public class Variables13 {

    public static void main(String[] args) {
  
    // 13. Simulador de tirada de dados
    Random random = new Random();

    int dado1 = random.nextInt(6) + 1;
    int dado2 = random.nextInt(6) + 1;
    int dado3 = random.nextInt(6) + 1;

    //Resultado

    System.out.println("El primer dado aleatorio:" + dado1);
    System.out.println("El segundo dado aleatorio:" + dado2);
    System.out.println("El tercer dado aleatorio:" + dado3);
    }
     
}
