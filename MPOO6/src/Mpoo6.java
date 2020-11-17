
public class Mpoo6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1**********************************************");
		Empleado empleado=new Empleado("Jorge Montaño",123,15000);
		System.out.println(empleado);
		empleado.aumentarSueldo(15);
		System.out.println(empleado);
		
		Gerente gerente1=new Gerente();
		gerente1.setNombre("Alan Morales");
		gerente1.setNumEmpleado(124);
		gerente1.setSueldo(20000);
		gerente1.setPresupuesto(100000);
		System.out.println(gerente1);
		
		System.out.println("2**********************************************");
		//Sobre escritura de metodos
		gerente1.aumentarSueldo(10);
		gerente1.aumentarPresupuesto(5);
		System.out.println(gerente1);
		
		System.out.println("3**********************************************");
		Gerente gerente2=new Gerente("Miguel Hurtado",125,21000,300000);
		System.out.println(gerente2);
		gerente2.aumentarPresupuesto(25);
		System.out.println(gerente2);
		
		System.out.println("Persona**********************************************");
		Persona persona=new Persona("Karen Guzman",17,"55-58-43-69-10");
		System.out.println(persona);
		
		System.out.println("Alumno**********************************************");
		Alumno alumno=new Alumno();
		alumno.setNombre("Diana Karen Guzman");
		alumno.setEdad(18);
		alumno.setNumTel("55-49-41-42-48-32");
		alumno.setNumCuenta(317120488);
		System.out.println(alumno);
		
		System.out.println("Trabajador**********************************************");
		Trabajador trabajador=new Trabajador();
		trabajador.setNombre("Diana Karen Guzman");
		trabajador.setEdad(18);
		trabajador.setNumTel("55-49-41-42-48-32");
		trabajador.setNumCuenta(317120488);
		trabajador.setSueldo2(2800);
		trabajador.setAniosAnt(5);
		System.out.println(trabajador);
		trabajador.aumentarSueldo2(10);
		System.out.println(trabajador);
		
		System.out.println("Profesor**********************************************");
		Profesor profe=new Profesor();
		profe.setNombre("Diana Karen Guzman");
		profe.setEdad(18);
		profe.setNumTel("55-49-41-42-48-32");
		profe.setNumCuenta(317120488);
		profe.setSueldo2(2500);
		profe.setAniosAnt(10);
		profe.setTitulo("Ing. Civil");
		System.out.println(profe);
		
		System.out.println("Director**********************************************");
		Director dire=new Director();
		dire.setNombre("Diana Karen Guzman");
		dire.setEdad(18);
		dire.setNumTel("55-49-41-42-48-32");
		dire.setNumCuenta(317120488);
		dire.setSueldo2(2500);
		dire.setAniosAnt(20);
		dire.setTitulo("Ing. Civil");
		dire.setDireccion("Ciencias Basicas");
		System.out.println(dire);
		dire.aumentarSueldo2(50);
		System.out.println(dire);

	}

}
