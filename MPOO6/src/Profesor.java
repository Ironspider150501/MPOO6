/**
 * 
 * @author Miguel Miranda M
 *
 */
public class Profesor extends Trabajador {
	private String titulo;
	/**
	 * Constructor
	 */
public Profesor() {}
	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param numTel
	 * @param numCuenta
	 * @param sueldo
	 * @param aniosAnt
	 * @param titulo
	 */
	public Profesor(String nombre,int edad,String numTel, int numCuenta,int sueldo, int aniosAnt, String titulo) {
    	super (nombre, edad, numTel,numCuenta,sueldo,aniosAnt);
    	this.titulo=titulo;}
	/**
	 * 
	 * @return titulo
	 */
	  public String getTitulo() {
	    	return titulo;
	    }
	    /**
	     * 
	     * @param titulo
	     */
	    public void setTitulo(String titulo) {
	    	this.titulo=titulo;
	    }
	    /**
	     * Escribe la profesion del profesor
	     */
	    public String toString() {
	    	return super.toString()+"Profesor{Titulado como="+titulo+"}";
	    }


}
