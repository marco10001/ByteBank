//					extiende de funciopnario, no debo volver a declarar dni,nombr ni salario
public class Gerente extends Funcionario implements Autenticable {
	private String clave;
	
	public void setClave(String clave) {
		this.clave=clave;
	}

	public boolean iniciarSesion(String clave) {
	return clave=="capo";
	}
	
	public double getBonificacion(){
		return super.getSalario()+ this.getSalario()*0.05;  // CON SUPER LA CLASE HIJA PUEDE ACCEDER A LOS METODOS DE LA CLASE PADRE
	}


}

