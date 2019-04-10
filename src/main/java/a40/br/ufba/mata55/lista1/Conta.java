package a40.br.ufba.mata55.lista1;

public class Conta {
	String codigo;
	double saldo;
	
	public Conta(String codigo, double saldo) {
		this.codigo=codigo;
		this.saldo=saldo;
	}
	
	public Conta (String codigo) {
		this.codigo=codigo;
		this.saldo=0;
	}
	
	boolean retira (double quantia) {
		if(saldo>=quantia) {
			saldo-=quantia;
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean deposita (double quantia) {
		saldo+=quantia;
		return true;
	}
	
	boolean transfere (double quantia, Conta beneficiario) {
		if(this.saldo>=quantia && beneficiario != null) {
			beneficiario.saldo+=quantia;
			this.saldo-=quantia;
			return true;
		}
		else {
			return false;
		}
	
	}
	
	
}
