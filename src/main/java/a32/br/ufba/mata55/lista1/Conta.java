package a32.br.ufba.mata55.lista1;

public class Conta {
	String codigo;
	double saldo;
	Conta (String c){
		codigo = c;
	}
	Conta (String c, double s){
		codigo = c;
		saldo = s;
	}
	boolean retira(double x) {
		if(x>saldo) {
			return false;
		}else{
			saldo -= x;
			return true;
		}
	}
	void deposita (double quantia) {
		saldo += quantia;
	}
	boolean transfere(double quantia, Conta beneficiario) {
		if ((quantia>saldo)&&((beneficiario==null)||(beneficiario.codigo==null))) {
			if(quantia>saldo) {
				System.out.println("Saldo insuficiente para transferência!\n");
			}
			if((beneficiario==null)||(beneficiario.codigo==null)) {
				System.out.println("Beneficiário inexistente ou código de conta inválido\n");
			}
			return false;
		}else {
			saldo -= quantia;
			beneficiario.saldo += quantia;
			return true;
		}
	}
}
