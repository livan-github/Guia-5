import java.util.Scanner;
public class Rectangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dibujo de un rectángulo.");
        System.out.println("Introduce dos valores a y b. ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();

        for(int i = 1; i <= a; i++){

           for(int j = 1; j <= b; j++){
                if(i == 1 || i == a || j == 1 || j == b){
                  System.out.print('*');

            }else{
                  System.out.print(" ");
          }
         
        }
        System.out.println();
    }
          
  }
 }