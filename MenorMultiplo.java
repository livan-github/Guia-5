import java.util.Scanner;
public class MenorMultiplo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un valor: ");
        double num = entrada.nextDouble();        
        double mult = num;
        while(mult % 2 != 0){
            mult += num;
        }
        System.out.println("El menor múltiplo de " + num + " que sea múltiplo de 2 es " + mult );

    }
    
}
