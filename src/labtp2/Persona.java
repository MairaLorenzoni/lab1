
package labtp2;

/**
 *
 * @author Usuario
 */
public class Persona extends Reloj {
    int edad;
    String nombre, apellido;

    public Persona(int edad, String nombre, String apellido ,int dia, int numSerie, double hora, String modelo) {
        super(dia, numSerie, hora, modelo);
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void comer(){
    
    }
    
    public void hablar(){
    
    }
    
    public void decirHora(){
        System.out.println("la hora es "+ hora);
    }
    
    @Override
     public int getDia() {
        return dia;
    }

    @Override
    public double getHora() {
        return hora;
    }
    
    @Override
    public void incrementarDia(){
        dia = dia++;
    }
    
    @Override
    public void incrementarHora(){
        hora = hora++;
    }
}
