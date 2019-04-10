package a8.br.ufba.mata55.lista1;

public class Conta {

	String codigo;
	double saldo = 0;
	
	public Conta(String codigoent){
		saldo = 0;
		codigo = codigoent;
	}
	
	public Conta(String codigoent, double saldoent){
		saldo = saldoent;
		codigo = codigoent;
	}
	
	boolean retira(double quantia) {
		if (saldo > quantia) {
			this.saldo = this.saldo - quantia;
			return true;
	}
		else return false;
}

	void deposita(double quantia) {
		this.saldo = this.saldo + quantia;
	}
	
	boolean transfere(double quantia, Conta beneficiario) {
		if ( quantia > saldo && codigo != null ) {
		    beneficiario.saldo = beneficiario.saldo + quantia;
			this.saldo = this.saldo - quantia;
			return true;
		}
		
		else return false;
		
	}
	
}