package a13.br.ufba.mata55.lista1;

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
	
	boolean retira(double quantia) {
		if(saldo- quantia > 0) {
			saldo -= quantia;
			return true;
		}
		else
		return false;
	}
	
	void deposita(double quantia) {
		saldo += quantia;
	}
	
	boolean transfere(double quantia, Conta beneficiario) {
		if(!beneficiario.equals(null) && saldo >= quantia) 
		{
		beneficiario.saldo += quantia;
		saldo -= quantia;
		return true;
		}
		else return false;
		}
}

