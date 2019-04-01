package a12.br.ufba.mata55.lista1;

public class Conta {
	// atributos
	String codigo;
	double saldo;
	
	// construtores
	public Conta(String codigo, double saldo) {
		this.codigo = codigo;
		this.saldo = saldo;
	}
	public Conta(String codigo) {
		this.codigo = codigo;
		saldo = 0;
	}
	
	// metodos
	boolean retira(double quantia) {
		if (saldo < quantia) {
			return false;
		} else {
			saldo-=quantia;
			return true;
		}
	}
	void deposita(double quantia) {
		saldo+=quantia;
	}
	boolean transfere(double quantia, Conta beneficiario) {
		if (beneficiario != null && quantia<=saldo) {
			saldo-=quantia;
			beneficiario.saldo+=quantia;
			return true;
		} else {
			System.out.println("saldo insuficiente");
			return false;
		}
	}
}