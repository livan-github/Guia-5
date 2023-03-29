import java.util.Scanner;
import static java.lang.Math.*;
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calcular el área de un triángulo. ");
        System.out.println("Introduzca la longitud del lado1, lado2 y lado3 respectivamente: ");
        double lado1 = entrada.nextDouble();
        double lado2 = entrada.nextDouble();
        double lado3 = entrada.nextDouble();
        if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
            double area = (double)sqrt((lado1 + lado2 + lado3) * (lado1 + lado2 - lado3) * (lado2 + lado3 - lado1) * (lado1 + lado3 - lado2)) / 4;
            area = round(area * 100.0)/100.0;
            System.out.println("EL área del triángulo es " + area + " unidades cuadradas.");
        }else{
            System.out.println("Las longitudes no son correctas para un triángulo.");
        }      
    }    
}