import java.util.Scanner;
public class ClasificacionTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Clasificación de un triángulo. ");
        System.out.println("Introduzca la longitud del lado1, lado2 y lado3 respectivamente: ");
        double lado1 = entrada.nextDouble();
        double lado2 = entrada.nextDouble();
        double lado3 = entrada.nextDouble();

        if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
            
            if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){

                System.out.println("El triángulo es equilátero.");
                
            }else if(lado1 == lado2 && lado1 != lado3 && lado2 != lado3 || lado2 == lado3 && lado2 != lado1 && lado1 != lado3 || lado1 == lado3 && lado1 != lado2 && lado3 != lado2 ){

                System.out.println("El triángulo es isósceles.");
            }else{
                System.out.println("El triángulo es escaleno.");
            }



        }
    }
   
    
}
