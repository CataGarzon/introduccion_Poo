package principal;
import salud.persona;
public class inicio
{
    public static void main(String[] args) 
    {
        double respuesta;
    System.out.println("calcular peso correcto");
        persona personita = new persona();
        personita.pedirDatos();
        personita.mostrarPersona();
       respuesta = personita.calcularlmc(personita.estatura, personita.peso);
       if (pesoActual< 20)

       {
           respuesta = "PESOBAJO";
       }
       else if (pesoActual >=20 && pesoActual <=25)
       {
           respuesta = "PESOIDEAL";
       }
       else if (pesoActual>25)
       {
           respuesta = "SOBREPESO";
       }
        personita.mayorEdad();

    }
}

