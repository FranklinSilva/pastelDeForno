package a18.br.ufba.mata55.lista1;
import java.util.*;

public class Conta {
	
	 String codigo;
	 double saldo;
	 boolean status;
	 String conta;

	String getCodigo() {
		return this.codigo;
	}
	double getSaldo() {
		return this.saldo;
	}
	boolean getStatus() {
		return this.status;
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
	
	boolean transfere(double quantia, String conta) {
		if (quantia !=0) {
		double novoSaldo =  quantia++;
		this.saldo = novoSaldo;
		 conta = this.codigo;
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
		 System.out.println("Digite seu código da conta para transferir valor: ");
		 minhaConta2.codigo= entrada.next();
		 System.out.println("Adicione valor para ser transferido: ");
		 minhaConta2.saldo=entrada.nextDouble();
		 
				minhaConta.retira(minhaConta.saldo);
				
				minhaConta1.deposita(minhaConta1.saldo);
				
				minhaConta2.transfere(minhaConta2.saldo, minhaConta2.conta);
				
				
		System.out.println("Valor que consta no momento: ");
		System.out.println( minhaConta.getSaldo());
		
		System.out.println("O valor foi retirado: ");
		System.out.println( minhaConta.getStatus());
		
		
		System.out.println("Seu Saldo Atualizado: ");
		System.out.println( minhaConta1.getSaldo());
		
		System.out.println("O status da executado: ");
		System.out.println( minhaConta1.getStatus());
		
		
		System.out.println("Seu saldo: ");
		System.out.println( minhaConta2.getSaldo());
		
		System.out.println("Foi transferido: ");
		System.out.println( minhaConta2.getStatus());

		System.out.println("Conta de transferência: ");
		System.out.println( minhaConta2.getCodigo());
		
	}
	

}
