package principal;
import salud.persona;
import java.util.*;
public class inicio
{
        public static void main(String[] args) 
    {
    // System.out.println("calcular peso correcto");
    //     persona personita = new persona();
    //     personita.pedirDatos();
    //     personita.mostrarPersona();
    //     personita.mayorEdad();
    System.out.println("calculos del empleado: ");
    persona personita = new persona();
    empleado emple = new empleado();
    Scanner Lectura = new Scanner(System.in);
    personita.pedirDatos();
    
    System.out.println("ingrese el cargo: ");
    emple.setCargo(Lectura.next());
    System.out.println("ingrese el valor de las horas: ");
    emple.setValorHora(Lectura.nextDouble());
    System.out.println("ingrese las horas trabajadas: ");
    emple.setHorasTrabajadas(Lectura.nextDouble());
    System.out.println("ingrese el departamento: ");
    emple.setDepartamento(Lectura.next());
    emple.calcularHonorarios(emple.getValorHora(),emple.getHorasTrabajadas());

    personita.mostrarPersona();
    emple.MostrarDatos();
 
    }
}
