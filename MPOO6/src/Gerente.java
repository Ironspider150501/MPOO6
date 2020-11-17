/**
 * 
 * @author Miguel Miranda M
 *
 */
public class Gerente extends Empleado {
private int presupuesto;
/**
 * Constructor
 */
    public Gerente(){
    }
    /**
     * 
     * @param nombre
     * @param numEmpleado
     * @param sueldo
     * @param presupuesto
     */
    public Gerente(String nombre,int numEmpleado,int sueldo, int presupuesto) {
    	super (nombre, numEmpleado, sueldo);
    	this.presupuesto=presupuesto;}
    /**
     * 
     * @return presupuesto
     */
    public int getPresupuesto() {
    	return presupuesto;
    }
    /**
     * 
     * @param presupuesto
     */
    public void setPresupuesto(int presupuesto) {
    	this.presupuesto=presupuesto;
    }
    /**
     * 
     * @param porcentaje para subir presupuesto
     */
    public void aumentarPresupuesto(int porcentaje) {
    	presupuesto+=(int)(presupuesto*porcentaje/100);
    }
    /**
     * Escribe datos en pantalla
     */
    public String toString() {
    	return super.toString()+"Gerente{"+"presupuesto="+presupuesto+"}";
    }

}
