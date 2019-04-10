package a19.br.ufba.mata55.lista1;
import java.util.*;

public class Conta {
	
	public String codigo;
	public double saldo;
	public boolean status;
	public String conta_XXX;
	
	public Conta(String codigoent){
		saldo = 0;
		codigo = codigoent;
	}
	
	public Conta(String codigoent, double saldoent){
		saldo = saldoent;
		codigo = codigoent;
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public boolean getStatus() {
		return this.status;
	}
	public boolean retira(double quantia) {
		double novoSaldo = saldo - quantia;
		this.saldo = novoSaldo;
		return(status);
	 }
	
	public void deposita(double quantia) {
		double novoSaldo = this.saldo + quantia;
		this.saldo = novoSaldo;
	 }
	
	public boolean transfere(double quantia, String conta_XXX) {
		double novoSaldo =  quantia;
		this.saldo = novoSaldo;
		 conta_XXX = this.codigo;
		return status;
	}

	
	

}
