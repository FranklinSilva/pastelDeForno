package a16.br.ufba.mata55.lista1;

public class Conta{

	String codigo;
	double saldo;

	public Conta(String codigo, double saldo){
		this.codigo = codigo;
		this.saldo = saldo;
	}

	public Conta(String codigo){
		this.codigo = codigo;
		this.saldo = 0.0;
	}

	boolean retira(double quantia){
		boolean retornou;
		if(saldo-quantia>0){
			this.saldo = saldo-quantia;
			retornou = true;
		} else{
			retornou = false;
		}

		return retornou;
	}

	void deposita(double quantia){
		this.saldo = saldo+quantia;
	}

	boolean transfere(double quantia, Conta beneficiario){
		boolean transferiu;
		if(quantia>this.saldo){
			transferiu = false;
		}else if(beneficiario == null){
			transferiu = false;
		}else {
			this.saldo = this.saldo - quantia;
			beneficiario.saldo += quantia;
			transferiu = true;
		}

		return transferiu;
	}

}

