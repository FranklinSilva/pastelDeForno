package a41.br.ufba.mata55.lista1;
import java.util.*;

public class Conta {
	
	 String codigo;
	 double saldo;
	 boolean status;
	 Conta conta;
	private Conta satus;
	 
	 public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}


	public Conta() {
		
	}
	public Conta(double saldo,Conta conta) {
		this.saldo = saldo;
		this.conta = conta;
	}
	
	public Conta(String codigo, double saldo, boolean status, Conta conta) {
		super();
		this.codigo = codigo;
		this.saldo = saldo;
		this.status = status;
		this.conta = conta;
	}
	
	boolean retira(double quantia) {
		if (quantia!=0) {
			double novoSaldo = saldo - quantia;
			this.saldo = novoSaldo;
			status = true;
			return(status);
		}else
			status = false;
			return(status);
		
	 }
	
	void deposita(double quantia) {
		double novoSaldo = this.saldo + quantia;
		this.saldo = novoSaldo;
	 }
	
	boolean transfere(double quantia, Conta conta) {
		if (quantia !=0) {
		double novoSaldo =  quantia++;
		this.saldo = novoSaldo;
		 conta = this.satus;
		 status = true;
		return (status);
		}else
			status = false;
			return(status);
	}

	public static void main(String[] args) {
		Scanner entrada;
		 entrada = new Scanner(System.in);
		
		 Conta minhaConta;
		 minhaConta = new Conta();
		 
		 System.out.println("Digite sua conta");
		 
		 minhaConta.codigo= entrada.next();
		 
		 System.out.println("Adicione valor:");
		 
		 minhaConta.saldo=entrada.nextDouble();
		
		 
		 
/*-----------------------------------------------------------------------------------------------*/
		 Conta minhaConta1;
		 
			minhaConta.retira(minhaConta.saldo);		 
		 minhaConta1 = new Conta();
		 
		 System.out.println("Digite seu c�digo");		 
		 minhaConta1.codigo= entrada.next();		 
		 System.out.println("Adicione valor:");
		 minhaConta1.saldo=entrada.nextDouble();
		 
/*-----------------------------------------------------------------------------------------------*/
		 
			minhaConta.retira(minhaConta.saldo);		 
		 Conta minhaConta2;
		 
		 minhaConta2 = new Conta();
		 System.out.println("Digite o c�digo da conta para transferir valor: ");
		 minhaConta2.codigo= entrada.next();
		 System.out.println("Adicione valor para ser transferido: ");
		 minhaConta2.saldo=entrada.nextDouble();
		 
/*-----------------------------------------------------------------------------------------------*/		 
				minhaConta.retira(minhaConta.saldo);
				
				minhaConta1.deposita(minhaConta1.saldo);
				
				minhaConta2.transfere(minhaConta2.saldo, minhaConta2.conta);
				
				
		System.out.println("Valor que consta no momento: ");
		System.out.println( minhaConta.getSaldo());
		
		System.out.println("O valor foi retirado: ");
		System.out.println( minhaConta.isStatus());
		
		
		System.out.println("Seu Saldo Atualizado: ");
		System.out.println( minhaConta1.getSaldo());
		
		System.out.println("O status da executado: ");
		System.out.println( minhaConta1.isStatus());
		
		
		System.out.println("Seu saldo: ");
		System.out.println( minhaConta2.getSaldo());
		
		System.out.println("Foi transferido: ");
		System.out.println( minhaConta2.isStatus());

		System.out.println("Conta de transfer�ncia: ");
		System.out.println( minhaConta2.getCodigo());
		
	}
	

}
