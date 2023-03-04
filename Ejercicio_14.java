import java.util.Scanner;
import java.lang.Math;

public class Ejercicio_14 {

    public static void main(String [] args){

        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese el numero X: ");
        double x = num.nextDouble();

        double square = Math.pow(x, 2);
        double cube = Math.pow(x, 3);

        System.out.println("El cuadrado de X es: " + square);
        System.out.println("El cubo de X es: " + cube);
    }
}
