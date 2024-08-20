
package labtp2;

/**
 *
 * @author Usuario
 */
public class Reloj {
    int dia, numSerie;
    double hora;
    String modelo;

    public Reloj(int dia, int numSerie, double hora, String modelo) {
        this.dia = dia;
        this.numSerie = numSerie;
        this.hora = hora;
        this.modelo = modelo;
    }

    public int getDia() {
        return dia;
    }

    public double getHora() {
        return hora;
    }
    
    public void incrementarDia(){
        dia = dia++;
    }
    
    public void incrementarHora(){
        hora = hora++;
    }

    public void limpiarPantalla(){
        hora = 0;
        dia = 0;
    }
    
    
}
