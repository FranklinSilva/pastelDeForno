package a17.br.ufba.mata55.lista1;
import java.util.*;

public class Conta {
	
	public String codigo;
	public double saldo;
	public boolean status;
	public String conta_XXX;

	String getCodigo() {
		return this.codigo;
	}
	double getSaldo() {
		return this.saldo;
	}
	boolean getStatus() {
		return this.status;
	}
	boolean retirada(double quantia) {
		double novoSaldo = saldo - quantia;
		this.saldo = novoSaldo;
		return(status);
	 }
	
	void deposita(double quantia) {
		double novoSaldo = this.saldo + quantia;
		this.saldo = novoSaldo;
	 }
	
	boolean transferencia(double quantia, String conta_XXX) {
		double novoSaldo =  quantia;
		this.saldo = novoSaldo;
		 conta_XXX = this.codigo;
		return status;
	}

	public static void main(String[] args) {
		Scanner entrada;
		 entrada = new Scanner(System.in);
		
		 Conta minhaConta;
		 minhaConta = new Conta();
		 System.out.println("Digite seu código");
		 minhaConta.codigo= entrada.next();
		 System.out.println("Adicione valor:");
		 minhaConta.saldo=entrada.nextDouble();
		
		 Conta minhaConta1;
		 minhaConta1 = new Conta();
		 System.out.println("Digite seu código");
		 minhaConta1.codigo= entrada.next();
		 System.out.println("Adicione valor:");
		 minhaConta1.saldo=entrada.nextDouble();
		 
		 Conta minhaConta2;
		 minhaConta2 = new Conta();
		 System.out.println("Digite seu código");
		 minhaConta2.codigo= entrada.next();
		 System.out.println("Adicione valor:");
		 minhaConta2.saldo=entrada.nextDouble();
		 
				minhaConta.retirada(minhaConta.saldo);
				
				minhaConta1.deposita(minhaConta1.saldo);
				
				minhaConta2.transferencia(minhaConta2.saldo, minhaConta2.codigo);
				
				
		
		System.out.println( minhaConta.getSaldo());
		System.out.println( minhaConta.getStatus());
		
		System.out.println( minhaConta1.getSaldo());
		System.out.println( minhaConta1.getStatus());
		
		System.out.println( minhaConta2.getSaldo());
		System.out.println( minhaConta2.getStatus());
		System.out.println( minhaConta2.getCodigo());
		
	}
	

}
