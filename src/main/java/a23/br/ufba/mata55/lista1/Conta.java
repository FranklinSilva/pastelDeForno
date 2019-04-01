package a23.br.ufba.mata55.lista1;

public class Conta { 
	String codigo; 
	double saldo;
	Conta (String codigo, double saldo) {
		this.codigo = codigo;
		this.saldo = saldo;
	}
	
	boolean retira (double quantia){
		if(quantia<=saldo) {
			saldo-=quantia;
			return true;
		}
		
		return false;
	}
	boolean transfere (double quantia, Conta beneficiario) {
		if(quantia>=saldo || beneficiario != null) {
			saldo-=quantia;
			beneficiario.saldo+=quantia;
			return true;
		}
		return false;
	}
	
	void deposita(double quantia) {
	    
		saldo+=quantia;
	}
	

}
