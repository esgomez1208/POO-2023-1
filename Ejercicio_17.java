import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_17 {

    public static void main(String [] args){
        Scanner num = new Scanner(System.in);

        System.out.println("Ingrese el radio: ");
        double radio = num.nextDouble();

        double areaCirculo = Math.PI * Math.pow(radio, 2);
        double longitudCircunf = 2 * Math.PI * radio;

        System.out.println("El Area del circulo es: " + areaCirculo);
        System.out.println("La longitud de la circunferencia es: " + longitudCircunf);

    }

}
