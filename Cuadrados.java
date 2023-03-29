import java.util.Scanner;
public class Cuadrados {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dibujo de un cuadrado.");
        System.out.println("Introduce un número para diseñarlo. ");
        int numero = entrada.nextInt();

        for(int i = 1; i <= numero; i++){

           for(int j = 1; j <= numero; j++){
                if(i == 1 || i == numero || j == 1 || j == numero){
                  System.out.print('*');

            }else{
                  System.out.print(" ");
          }
         
        }
        System.out.println();
    }
          
  }
 }

