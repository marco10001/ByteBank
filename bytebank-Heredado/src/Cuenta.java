public abstract class Cuenta{
	protected double saldo; //se usa protected para quem se pueda acceder SOLO desde las clases hijas
	private int agencia;//se usa private para que nadie pueda modificiar el campo sin utilizar metodos.
	private int numero;
	private Cliente titular;

	private static int total=0;
	
	public Cuenta(int agencia,int numero ) {
		if (agencia<=0) {
			this.agencia=1;
		}else {
			this.agencia=agencia;
		}
		total++;
		System.out.println("Se van creando: "+ total + " cuentas");
	}
	
	//no retoirna valor
	public abstract void depositar(double valor);
	
	public double getSaldo() {
		return this.saldo;
	}
	
	
	public void retirar (double valor) throws SaldoInsuficienteException {
		if(this.saldo<valor) {
			throw new SaldoInsuficienteException("no tiene saldo");
		}
		this.saldo=this.saldo-valor;
	}
	
	
	public boolean tranferir(double valor,Cuenta cuenta) {
		
		if(this.saldo>=valor) {
			try {
				this.retirar(valor);
			} catch (SaldoInsuficienteException e) {
				e.printStackTrace();
			}
			cuenta.depositar(valor);
			return true;
		}else {
			return false;
		}
	}
	
	
	public void setAgencia(int agencia) {
		if (agencia>0) {
			this.agencia=agencia;
		}else {
			System.out.println("no estan permitidos valores negativos");
		}
	}

	
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setTitular(Cliente cliente) {
		this.titular=cliente;
	}
	
	public Cliente getTitular(){
		return this.titular;
	}
	
	public static int getTotal(){
		return total;
	}
}