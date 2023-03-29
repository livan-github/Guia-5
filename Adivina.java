import java.util.Scanner;
public class Adivina {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Adivinador de un número");
        System.out.println("Piensa un número natural entre 1 y 100. ");

        int contador = 0;
        int minimo = 1; 
        int maximo = 100;

        while(contador <= 7){

            int numero = (int)(minimo + maximo)/2;

            System.out.println("Tú número es" + numero + "?. Responde 'S' si (Sí) o 'N' si (NO).");
            char respuesta = entrada.next().charAt(0);
           
            if(respuesta == 'N'){
               System.out.println("Tú número es mayor que" + numero + "?. Responde 'S' si (Sí) o 'N' si (NO). ");    
               respuesta = entrada.next().charAt(0);    
               
               if(respuesta == 'N'){
                 maximo = numero - 1;
               }else{
                 minimo = numero + 1;
               }
            }else{
                System.out.println("He adivinado el número " + numero);
                contador = 7;
            }

            contador++;

        }

    
    }

        
}
