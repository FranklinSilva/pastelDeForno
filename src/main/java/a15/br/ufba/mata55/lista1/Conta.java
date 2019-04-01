package a15.br.ufba.mata55.lista1;

public class Conta {
	double saldo;
	String codigo;
	
	public Conta (String c, double s) {
		this.codigo = c;
		this.saldo = s;		
	}
	
	boolean retira(double quantia) {
		boolean r;
		if (this.saldo<quantia) {
			r = false;
		}else {
			r = true;
			this.saldo = saldo - quantia;
		}
		return r;
	}
	void deposita(double quantia) {
		this.saldo = saldo + quantia;
	}
	boolean transfere(double quantia, Conta beneficiario) {
		boolean t;
		if (beneficiario == null) {
			t = false;
		}else {
			if (this.saldo<quantia) {
				t = false;
			}else {
				t = true;
				this.saldo = saldo - quantia;
				beneficiario.saldo = saldo + quantia;
			}
		}
		return t;
	}
}
