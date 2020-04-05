
public class Usuario {
   String nombre;
   int cedula;
   String contarsena;
   int edad;
   int cantHijos;
   int saldo;
   
   //Constructor
   public Usuario(String nombre, int ced,String contrasena,int edad, int chijos,int saldo ){
       nombre = "nombre";
       ced = 1234567;
       contrasena="pass";
       edad=0;
       chijos=0;
       saldo=0;
   }
   //Get & Set
   public String getNombre(){
       return nombre;
   }
   public void setNombre(String nombre){
       this.nombre=nombre;
   }
   public int getCedula(){
       return cedula;
   }
   public void setCedula(int ci){
       this.cedula = ci;           
   }
   public String getContrasena(){
       return contarsena;
   }
   public void setContrasena(String contrasena){
       this.contarsena = contrasena;
   }
   public int getEdad(){
       return edad;
   }
   public void setEdad(int edad){
       this.edad = edad;
   }
   public int getCantHijos(){
       return cantHijos;
   }
   public void setCantHijos(int cant){
       this.cantHijos = cant;
   }
   public int getSaldo(){
       return saldo;
   }
   public void setSaldo(int saldo){
       this.saldo = saldo;
   }
   
   
      
}


