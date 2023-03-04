
public class Ejercicio_12 {

    public static void main(String [] args){

        double horasTrabajo = 48;
        double salarioHora = 5000;
        double porcentajeRetencion = 0.125;

        double salarioBruto = horasTrabajo * salarioHora;
        double retencionFuente = salarioBruto * porcentajeRetencion;
        double salarioNeto = salarioBruto - retencionFuente;

        System.out.println("El Salario neto del trabajador es: " + salarioNeto);

    }
}
