
public class CuentaCorriente extends Cuenta {
	public CuentaCorriente (int agencia,int numero){ //necesito si o si epdir parametros, ya que la clase padre los pide
		super(agencia,numero); //super es el constructor de cuenta.
	}
	
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
@Override
public boolean retirar(double valor) {
	double comision =0.2;
	return super.retirar(valor+comision);
}
}
