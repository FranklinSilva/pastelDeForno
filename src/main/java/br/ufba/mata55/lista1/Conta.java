package br.ufba.mata55.lista1;

public class Conta {
	double saldo;
	String codigo;
	
	public Conta(String codigo) {
		this(codigo, 0.0);
	}
	public Conta(String codigo, double saldo) {
		this.codigo = codigo;
		this.saldo = saldo;
	}
	
	boolean retira(double quantia) {
		if (saldo >= quantia) {
			saldo -= quantia;
			return true;
		}
		return false;
	}
	
	void deposita(double quantia) {
		saldo += quantia;
	}
	boolean transfere(double quantia, Conta beneficiario) {
		if (beneficiario != null && retira(quantia)) {
			beneficiario.deposita(quantia);
			return true;
		}
		return false;
	}
}
