package a25.br.ufba.mata55.lista1;

public class Conta {

	 String codigo;
	 Double saldo;
	 
	 public Conta(String codigo, double saldo) {
	        this.codigo = codigo;
	        this.saldo = saldo;
	    }	
	 public Conta(String codigo) {
	        this.codigo = codigo;
	        this.saldo = null;
	    }
	 
	public boolean retira(double quantia) {
		 if(quantia<this.saldo) {
			 return false;
		 }else {
			 this.saldo = saldo - quantia;
			 return true;
		 }
	 }
	 
	 public void deposita(double quantia) {
		this.saldo = saldo + quantia;
	 }
	 
	 public boolean transfere(double quantia, Conta beneficiario) {
		 if(quantia<this.saldo || beneficiario==null) {
			return false; 
		 }else {
			 this.saldo = saldo - quantia;
			  beneficiario.saldo = saldo + quantia;			 
			 return true;
		 }
		 
	 }
	 

}

