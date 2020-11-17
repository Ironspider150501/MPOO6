/**
 * 
 * @author Miguel Miranda M
 *
 */
public class Trabajador extends Alumno {
private int sueldo2;
private int aniosAnt;
	/**
	 * Constructor
	 */
	public Trabajador() {}
	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param numTel
	 * @param numCuenta
	 * @param sueldo2
	 * @param aniosAnt
	 */
	public Trabajador(String nombre,int edad,String numTel, int numCuenta,int sueldo2,int aniosAnt) {
		super (nombre, edad, numTel,numCuenta);
    	this.sueldo2=sueldo2;
    	this.aniosAnt=aniosAnt;}
	/**
	 * 
	 * @return suldo2
	 */
	  public int getSueldo2() {
	    	return sueldo2;
	    }
	    /**
	     * 
	     * @param sueldo2
	     */
	    public void setSueldo2(int sueldo2) {
	    	this.sueldo2=sueldo2;
	    }
	    /**
	     * 
	     * @return aniosAnt
	     */
	    public int getAniosAnt() {
	    	return aniosAnt;
	    }
	    /**
	     * 
	     * @param aniosAnt
	     */
	    public void setAniosAnt(int aniosAnt) {
	    	this.aniosAnt=aniosAnt;
	    }
	    /**
	     * Escribe sueldo y años trabajando
	     */
	    public String toString() {
	    	return super.toString()+"Trabajador{Sueldo="+sueldo2+", Anios trabajando="+aniosAnt+"}";
	    }
	    /**
	     * 
	     * @param porcentaje
	     */
	    public void aumentarSueldo2(int porcentaje) {
	    	sueldo2 +=(int) (sueldo2*porcentaje/100);
	    }


}
