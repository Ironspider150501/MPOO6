/**
 * 
 * @author Miguel Miranda M
 *
 */
public class Alumno extends Persona {
	private int numCuenta;
	/**
	 * Constructor
	 */
	public Alumno() {}
	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param numTel
	 * @param numCuenta
	 */
	public Alumno(String nombre,int edad,String numTel, int numCuenta) {
		super (nombre, edad, numTel);
    	this.numCuenta=numCuenta;}
	/**
	 * 
	 * @return numCuenta
	 */
	  public int getNumCuenta() {
	    	return numCuenta;
	    }
	    /**
	     * 
	     * @param numCuenta
	     */
	    public void setNumCuenta(int numCuenta) {
	    	this.numCuenta=numCuenta;
	    }
	    /**
	     * Escribe NumCuenta
	     */
	    public String toString() {
	    	return super.toString()+"Alumno{"+"NumCuenta="+numCuenta+"}";
	    }

}
