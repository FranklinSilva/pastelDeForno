package a25.br.ufba.mata55.lista1;

public class Conta {

	 String codigo;
	 double saldo;
	 
	 Conta(String codigo, double saldo) {
	        this.codigo = codigo;
	        this.saldo = saldo;
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
	 
	 public boolean trasnfere(double quantia, Conta beneficiario) {
		 if(quantia<this.saldo || beneficiario==null) {
			return false; 
		 }else {
			 this.saldo = saldo - quantia;
			  beneficiario.saldo = saldo + quantia;			 
			 return true;
		 }
		 
	 }
	 

}

