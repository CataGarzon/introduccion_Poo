package principal;
import salud.persona;
public class inicio
{
        public static void main(String[] args) 
    {
    System.out.println("calcular peso correcto");
        persona personita = new persona();
        personita.pedirDatos();
        personita.mostrarPersona();
        personita.calcularlmc();
        personita.mayorEdad();

    }
}
