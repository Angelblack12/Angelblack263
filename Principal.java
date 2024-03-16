import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner scanner = new Scanner(System.in);
   
      // Prompt the user to enter the person's information
      System.out.println("Introduzca el ID de la Persona:");
      String id = scanner.nextLine();
   
      System.out.println("Introduzca el nombre de la Persona:");
      String nombre = scanner.nextLine();
   
      System.out.println("Introduzca el Apellido de la Persona:");
      String apellido = scanner.nextLine();
   
      System.out.println("Introduzca el Edad de la Persona");
      int edad = scanner.nextInt();
      scanner.nextLine(); // Consume newline left-over
   
      System.out.println("Introduzca el Numero de Telefono:");
      String telefono = scanner.nextLine();
   
      System.out.println("Introduzca la Direccion:");
      String direccion = scanner.nextLine();
   
      System.out.println("Introduzca el Correo:");
      String correo = scanner.nextLine();
   
      System.out.println("Introduzca la Nacionalidad:");
      String nacionalidad = scanner.nextLine();
   
      System.out.println("Introduzca la estatura:");
      double estatura = scanner.nextDouble();
      scanner.nextLine(); // Consume newline left-over
   
      System.out.println("Intruduzca el Peso:");
      double peso = scanner.nextDouble();
      scanner.nextLine(); // Consume newline left-over
   
      // Create a Personas object with the user's input
      Personas unaPersona = new Personas(id, nombre, apellido, edad, telefono, direccion, correo, nacionalidad, estatura, peso);
   
      // Display the person's information
      System.out.println("\nPersonal Information:");
      System.out.println("ID: " + unaPersona.getID());
      System.out.println("Nombre: " + unaPersona.getNombre());
      System.out.println("Apellido: " + unaPersona.getApellido());
      System.out.println("Edad: " + unaPersona.getEdad());
      System.out.println("Numero de Telefono: " + unaPersona.getTelefono());
      System.out.println("Direccion: " + unaPersona.getDireccion());
      System.out.println("Email: " + unaPersona.getCorreo());
      System.out.println("Nacionalidad: " + unaPersona.getNacionalidad());
      System.out.println("Estatura: " + unaPersona.getEstatura());
      System.out.println("Peso: " + unaPersona.getPeso());
   
      // Close the scanner
      scanner.close();
   }
}
