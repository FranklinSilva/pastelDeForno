package a9.br.ufba.mata55.lista1;

public class Conta {

	String codigo;
	double saldo;

	public Conta(String codigo) {
		this.codigo = codigo;
		this.saldo = 0;
	}

	public Conta(String codigo, double saldo) {
		this.codigo = codigo;
		this.saldo = saldo;
	}

	boolean retira(double quantia) {
		if (quantia <= this.saldo) {
			this.saldo -= quantia;
			return true;
		} else
			return false;
	}

	void deposita(double quantia) {
		this.saldo += quantia;
	}

	boolean transfere(double quantia, Conta beneficiario) {
		if (quantia > this.saldo || beneficiario == null) {
			return false;
		} else {
			this.saldo -= quantia;
			beneficiario.saldo += quantia;
			return true;
		}
	}

}
