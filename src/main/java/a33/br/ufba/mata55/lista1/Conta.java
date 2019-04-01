package a33.br.ufba.mata55.lista1;

public class Conta {
	String codigo;
	double saldo;

  	public Conta(String codigo) {
  		this(codigo, 0);
  	}
  
  	public Conta(String codigo, double saldo) {
  		this.codigo = codigo;
  		this.saldo = saldo;
  	}
  
  boolean retira(double quantia) {
	  if(saldo >= quantia) {
		  saldo -= quantia;
		  
		  return true;
	  }
	
	  return false; 
  }
  
  	void deposita(double quantia) {
  		saldo += quantia;
  	}
  
  	boolean transfere(double quantia, Conta beneficiario) {
  		if(saldo >= quantia){
  			saldo -= quantia;
  			beneficiario.saldo += quantia;
		  
  			return true;
  		} 
	  
  		return false;
  	}
  
}