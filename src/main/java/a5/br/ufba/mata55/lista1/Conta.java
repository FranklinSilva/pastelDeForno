package a5.br.ufba.mata55.lista1;

public class Conta {
	String codigo;
	double saldo;

	Conta(String c, double dim) {

		this.codigo = c;
		this.saldo = dim;
	}

	Conta(String c) {
		this.codigo = c;
		this.saldo = 0;
	}

	boolean retira(double quantia) {
		if (this.saldo < quantia) {
			return false;
		}
		this.saldo -= quantia;
		return true;

	}

	void deposita(double quantia) {
		this.saldo += quantia;

	}

	boolean transfere(double quantia, Conta beneficiario) {
		if ((this.saldo < quantia) || (beneficiario == null)) {
			return false;
		}
		this.saldo -= quantia;
		beneficiario.saldo += quantia;
		return true;

	}

}
