/**
 * 
 * @author Miguel Miranda M
 *
 */
public class Director extends Profesor{
	private String direccion;
/**
 * 	Constructor
 */
public Director() {}
	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param numTel
	 * @param numCuenta
	 * @param sueldo
	 * @param aniosAnt
	 * @param titulo
	 * @param direccion
	 */
	public Director(String nombre,int edad,String numTel, int numCuenta,int sueldo, int aniosAnt, String titulo, String direccion) {
    	super (nombre, edad, numTel,numCuenta,sueldo,aniosAnt,titulo);
    	this.direccion=direccion;}
	/**
	 * 
	 * @return direccion
	 */
	  public String getDireccion() {
	    	return direccion;
	    }
	    /**
	     * 
	     * @param direccion
	     */
	    public void setDireccion(String direccion) {
	    	this.direccion=direccion;
	    }
	    /**
	     * Escribe que esta dirigiendo
	     */
	    public String toString() {
	    	return super.toString()+"Director{encargado de="+direccion+"}";
	    }

}
