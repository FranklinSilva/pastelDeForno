package a6.br.ufba.mata55.lista1;

public class Conta {
	String codigo;
	double saldo = 0;

	public Conta(String cod, double dinheiro) {
	    codigo = cod;
	    saldo = dinheiro;
	  }
	
	public boolean retira(double quantia) {
		if (saldo < quantia) {
			return false;
		} else {
			saldo = saldo - quantia;
			return true;
		}
	}

	public void deposita(double quantia) {
		saldo = saldo + quantia;
	}

	public boolean transfere(double quantia, Conta beneficiario) {
		if(saldo>=quantia && beneficiario!=null) {
			saldo = saldo - quantia;
			beneficiario.saldo = beneficiario.saldo + quantia;
			return true;
		}
		else {
			return false;
		}
	
	}
	public static void main(String[] args) {
		Conta Ana = new Conta("12Abc", 10000);
		Conta Pedro = new Conta("34Abc",10000);
		
		System.out.println(Ana.retira(100));
		Ana.deposita(10);
		System.out.println(Ana.transfere(200, Pedro));
		
		System.out.println(Ana.saldo);
		System.out.println(Pedro.saldo);
	  }
}

