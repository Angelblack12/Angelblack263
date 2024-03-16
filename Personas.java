public class Personas {
   // Attributes declaration
   private String id;
   private String nombre;
   private String apellido;
   private int edad;
   private String telefono;
   private String direccion;
   private String correo;
   private String nacionalidad;
   private double estatura;
   private double peso;

   // Constructor
   public Personas(String id, String nombre, String apellido, int edad, String telefono, String direccion, String correo, String nacionalidad, double estatura, double peso) {
      this.id = id;
      this.nombre = nombre;
      this.apellido = apellido;
      this.edad = edad;
      this.telefono = telefono;
      this.direccion = direccion;
      this.correo = correo;
      this.nacionalidad = nacionalidad;
      this.estatura = estatura;
      this.peso = peso;
   }

   // Setters and Getters
   public void setID(String id) {
      this.id = id;
   }

   public String getID() {
      return id;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getNombre() {
      return nombre;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public String getApellido() {
      return apellido;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   public int getEdad() {
      return edad;
   }

   public void setTelefono(String telefono) {
      this.telefono = telefono;
   }

   public String getTelefono() {
      return telefono;
   }

   public void setDireccion(String direccion) {
      this.direccion = direccion;
   }

   public String getDireccion() {
      return direccion;
   }

   public void setCorreo(String correo) {
      this.correo = correo;
   }

   public String getCorreo() {
      return correo;
   }

   public void setNacionalidad(String nacionalidad) {
      this.nacionalidad = nacionalidad;
   }

   public String getNacionalidad() {
      return nacionalidad;
   }

   public void setEstatura(double estatura) {
      this.estatura = estatura;
   }

   public double getEstatura() {
      return estatura;
   }

   public void setPeso(double peso) {
      this.peso = peso;
   }

   public double getPeso() {
      return peso;
   }
}

