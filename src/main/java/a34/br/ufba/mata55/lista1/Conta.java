package a34.br.ufba.mata55.lista1;

public class Conta {

	double saldo;
	String codigo;
	
	public Conta(String codigoConta) {
		codigo = codigoConta;
		saldo = 0;	
	}
	

	public Conta(String codigoConta, double saldoConta) {
		codigo = codigoConta;
		saldo = saldoConta;
	}
	
	boolean retira(double quantia1) {
		if(saldo > quantia1) {
			saldo -= quantia1;
			return true;	
		}
		else {
			return false;
		}
	}
	
	void deposita(double quantia2) {	
		
		saldo += quantia2;	
		
	}
	
	
	boolean transfere(double quantia3, Conta beneficiario) {
		
		if(saldo > quantia3 && beneficiario != null) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
