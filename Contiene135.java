import java.util.Scanner;
public class Contiene135 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el valor a evaluar: ");
        String valor = entrada.nextLine();

        char[] array = valor.toCharArray();
        int controlador = 0;

        for(int i = 0; i < valor.length(); i++){            
             
            if(array[i] == '1' || array[i] == '3' || array[i] == '5'){

                 controlador++;
            }            
        }
        if(controlador != 0){
            System.out.println("Se cumple.");
        }else{
            System.out.println("No se cumple.");
        }
    }
}
