package a14.br.ufba.mata55.lista1;

public class Conta {
	String codigo;
	double saldo;
	
	public Conta(String codigoent){
		saldo = 0;
		codigo = codigoent;
	}
	
	public Conta(String codigoent, double saldoent){
		saldo = saldoent;
		codigo = codigoent;
	}
	
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
		if ((saldo > 0) || (Conta != null)) {
			Conta = Conta + quantia;
			return true;
		}
		else {
			return false;
		}
	}
}
