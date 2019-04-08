package a10.br.ufba.mata55.lista1;

public class Conta {

	protected String codigo;
	protected double saldo; 
	
	public Conta(String codigo) {
		this.codigo=codigo;
	}
	
	public Conta(String codigo, double saldo) {
		this.codigo=codigo;
		this.saldo=saldo;
	}
	
	boolean retira(double quantia ) {
        if(quantia>this.saldo) {
        	return false;
        }
        else {
        	this.saldo-=quantia;
        	return true;
        }
        
    }
	void deposita(double quantia ) {
        	this.saldo+=quantia;
        	
    }
	
	boolean transfere(double quantia, String codigo ) {
        if(quantia>this.saldo || this.saldo==0) {
        	return false;
        }
        else {
        	this.saldo-=quantia;
        	return true;
        }
        
    }


}
