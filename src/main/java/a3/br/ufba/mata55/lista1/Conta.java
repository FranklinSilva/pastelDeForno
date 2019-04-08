package a3.br.ufba.mata55.lista1;

public class Conta {
	double saldo;
	String codigo;
		
	public Conta(String cod, double saldo) {
		this.codigo = cod;
		this.saldo = saldo;
	}
	public Conta(String cod) {
		this.codigo = cod;;
		saldo=0;
	}
	boolean retira(double quantia) {
		if (saldo>quantia) {
			saldo = saldo - quantia;
			return true;
		}
		else {
			return false;
		}
	}
	void deposita(double quantia) {
		saldo = saldo+quantia;
	}
	boolean transfere(double quantia, Conta beneficiario) {
		if ((saldo<quantia) | beneficiario != null ) {
			beneficiario.saldo += quantia;
			return true;
		}
		else {
			return false;
		}
	}
	
}
