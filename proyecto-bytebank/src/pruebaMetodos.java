
public class pruebaMetodos {

	public static void main(String[] args) {
		Cuenta cuentaMarco =new Cuenta(111);
		cuentaMarco.depositar(300);
		cuentaMarco.depositar(200);
		
		Cuenta cuentaPaula=new Cuenta(222);
		cuentaPaula.depositar(1000);
		
		System.out.println(cuentaMarco.getSaldo());
		
		cuentaMarco.retirar(01);
		System.out.println(cuentaMarco.getSaldo());
		
		cuentaPaula.tranferir(200,cuentaMarco);
		System.out.println(cuentaMarco.getSaldo());
		System.out.println(cuentaPaula.getSaldo());
	}
}
