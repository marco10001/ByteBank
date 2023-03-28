
public class ControlBonificaciones {
	private double sumaTotal;
	
	
	
	
	public double registrarSalario(Funcionario funcionario) {
		this.sumaTotal= funcionario.getBonificacion() + this.sumaTotal;
		return this.sumaTotal;
	}
	
	
	
}
