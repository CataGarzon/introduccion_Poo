package salud;

import java.util.Scanner;

public class persona 
{
 private  static String tipoDoc, nombre, apellido, sexo;
 public static double  documento, estatura;
 public static int edad, peso;    

 public static String getTipoDoc() {
    return tipoDoc;
}

public static void setTipoDoc(String tipoDoc) {
    persona.tipoDoc = tipoDoc;
}

public static String getNombre() {
    return nombre;
}

public static void setNombre(String nombre) {
    persona.nombre = nombre;
}

public static String getApellido() {
    return apellido;
}

public static void setApellido(String apellido) {
    persona.apellido = apellido;
}

public static String getSexo() {
    return sexo;
}

public static void setSexo(String sexo) {
    persona.sexo = sexo;
}

public static double getDocumento() {
    return documento;
}

public static void setDocumento(double documento) {
    persona.documento = documento;
}

public static double getEstatura() {
    return estatura;
}

public static void setEstatura(double estatura) {
    persona.estatura = estatura;
}

public static int getEdad() {
    return edad;
}

public static void setEdad(int edad) {
    persona.edad = edad;
}

public static int getPeso() {
    return peso;
}

public static void setPeso(int peso) {
    persona.peso = peso;
}


static Scanner LECTURA = new Scanner(System.in);


    public static void pedirDatos()
    {
    System.out.println("Ingresa tu tipo de documento: ");
    tipoDoc = LECTURA.nextLine();

    System.out.println("Ingresa tu numero de documento: ");
    documento = LECTURA.nextDouble();

    System.out.println("Ingresa tu nombre: ");
    nombre = LECTURA.next();

    System.out.println("Ingresa tu apellido: ");
    apellido = LECTURA.next();

    System.out.println("Ingresa tu peso en kilogramos: ");
    peso = LECTURA.nextInt();

    System.out.println("Ingresa tu estatura en metros: ");
    estatura = LECTURA.nextDouble();

    System.out.println("Ingresa tu edad: ");
    edad = LECTURA.nextInt();

    System.out.println("Ingresa tu sexo: ");
    sexo = LECTURA.next();
    }

        public static void mostrarPersona()
        {
        System.out.println("Datos de la persona: \n"+ tipoDoc  +documento +"\n "+ nombre +" \n" +apellido +" \n"+ peso +" \n"+ estatura +" \n"+ edad + " \n"+ sexo) ;
        }
                public static void calcularlmc(int peso, double estatura)
                {
                Double pesoActual;
                String respuesta = "";
                pesoActual = peso /(Math.pow(estatura,2));

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
                    System.out.println(respuesta);
                
                 }  
    public static void mayorEdad()
    {
        if(edad >= 18)
        {
            System.out.println("es mayor de edad");
        }
        else
        {
            System.out.println("es menor de edad");
        }
    } 
}
