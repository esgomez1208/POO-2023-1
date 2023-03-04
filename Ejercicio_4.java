import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la Edad de Juan: ");

        int edJuan = input.nextInt();

        int edAlber = (2 * edJuan)/3;
        int edAna = (4 * edJuan)/3;
        int edMama = edAlber + edAna + edJuan;

        System.out.println("Las edades son: Alberto: " + edAlber + ". Juan: " + edJuan + ". Ana: " + edAna + (". Mama: " + edMama));

    }

}
