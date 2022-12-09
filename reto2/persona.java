private  static String tipoDoc, nombre, apellido, sexo;
 public static double  documento, estatura,peso;
 private static int edad ;    

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
    sexo = LECTURA.nextLine();
    }

    public static void mostrarPersona()
    {
    System.out.println("Datos de la persona: \n"+ tipoDoc  +documento +"\n "+ nombre +" \n" +apellido +" \n"+ peso +" \n"+ estatura +" \n"+ edad + " \n"+ sexo) ;
    }


    public String calcularlmc(double estatura, double peso)
    {
    Double pesoActual;
  
    pesoActual = peso /(Math.pow(estatura,2));

    
        System.out.println(pesoActual);
        return pesoActual;
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