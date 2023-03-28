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
	
	//retorna true o false
	public boolean retirar(double valor) {
		if(this.saldo>=valor) {
			this.saldo=this.saldo-valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean tranferir(double valor,Cuenta cuenta) {
		
		if(this.saldo>=valor) {
			this.retirar(valor);
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