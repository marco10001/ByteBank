
public class TestControlBonificacion {
	public static void main(String[] args) {
		
		Funcionario diego=new Gerente();
		diego.setSalario(2000);
		
		Gerente marco =new Gerente();
		marco.setSalario(10000);
		
		ControlBonificaciones controlbonificacion = new ControlBonificaciones();
		
		controlbonificacion.registrarSalario(diego);		
	}

}
