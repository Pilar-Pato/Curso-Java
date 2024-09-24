import java.util.Random;

public class Variables14 {
    public static void main(String[] args) {

        // 14.Generador de contraseñas aleatorias
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; 
        
        StringBuilder contraseña = new StringBuilder();
        Random random = new Random();
            
        for (int i = 0; i < 8; i++) {
        int indiceAleatorio = random.nextInt(caracteres.length());
        char caracterAleatorio = caracteres.charAt(indiceAleatorio);
        contraseña.append(caracterAleatorio);
            
        }
         
        System.out.println("La contraseña generada es: " + contraseña.toString());
        }
    
        }
    
    
