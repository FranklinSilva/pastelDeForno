package a39.br.ufba.mata55.lista1;

public class Conta {
	String codigo;
	double saldo;
	
	public Conta(String codigo) {
		this.codigo = codigo;
		this.saldo = 0;
	}
	
	public Conta (String codigo, double saldo) {
		this.codigo = codigo;
		this.saldo = saldo;
	}
	
	boolean retira(double quantia) {
		if (quantia > this.saldo)
			return false;
	
		this.saldo -= quantia;
		return true;
	}
	
	void deposita(double quantia) {
		this.saldo += quantia;
	}
	
	boolean transfere(double quantia, Conta beneficiario) {
		if (beneficiario == null)
			return false;
		
		if (this.saldo < quantia)
			return false;
		
		this.saldo -= quantia;
		beneficiario.deposita(quantia);
		return true;
	}
}