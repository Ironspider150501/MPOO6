/**
 * 
 * @author Miguel Miranda M
 *
 */
public class Persona {
	private String nombre;
	private int edad;
	private String numTel;
	/**
	 * Constructor
	 */
	public Persona() {}
	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param numTel
	 */
    public Persona(String nombre,int edad, String numTel) {
	this.nombre=nombre;
	this.numTel=numTel;
	this.edad=edad;
     }
    /**
     * 
     * @return nombre
     */
    public String getNombre() {
    	return nombre;
    }
    /**
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
    	this.nombre=nombre;
    }
    /**
     * 
     * @return numTel
     */
    public String getNumTel() {
    	return numTel;
    }
   /**
    * 
    * @param numTel
    */
    public void setNumTel(String numTel) {
    	this.numTel=numTel;
    } 
    /**
     * 
     * @return edad
     */
    public int getEdad() {
    	return edad;
    }
    /**
     * 
     * @param edad
     */
    public void setEdad(int edad) {
    	this.edad=edad;
    }
    /**
     * Escribe nombre edad y numero de telefono
     */
    public String toString() {
    	return "Persona {"+"Nombre="+nombre+", Edad="+edad+", NumTel"+numTel+"}";
    }
    
}
