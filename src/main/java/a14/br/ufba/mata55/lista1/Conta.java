package a14.br.ufba.mata55.lista1;

public class Conta {
	String codigo;
	double saldo;
	
	boolean retira (double quantia) {
		if (saldo >= quantia) {
			saldo = saldo - quantia;
			return true;
		}
		else {
			return false;
		}
	}
	
	void deposita (double quantia) {
		saldo = saldo + quantia;
	}
	
	boolean transfere (double quantia, Conta beneficiario) {
		if ((saldo > 0) || (Conta != NULL)) {
			Conta = Conta + quantia;
			return true;
		}
		else {
			return false;
		}
	}
}
