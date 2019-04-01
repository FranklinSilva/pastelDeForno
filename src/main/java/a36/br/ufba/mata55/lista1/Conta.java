package a36.br.ufba.mata55.lista1;

public class Conta {
	String code;
	double saldo;
	public Conta(String _code){
		code = _code;
		saldo = 0;
	}
	public Conta(String _code, double _saldo){
		code = _code;
		saldo = _saldo;
	}
	boolean retira(double _quantia){
		if(_quantia <= saldo){
			saldo-= _quantia;
			return true;
		}
		return false;
	}
	void deposita(double _quantia){
		saldo+= _quantia;
	}
	boolean transfere(double _quantia, Conta _beneficiario){
		if(_beneficiario != null && this.retira(_quantia)){
			_beneficiario.saldo += _quantia;
			return true;
		}
		return false;
	}
	
}

/*
 * **Exercício 2**. Crie uma classe `Conta` para representar uma conta bancária. 
 * Toda conta possui um código que a identifica, do tipo String, e um saldo, 
 * do tipo `double`. Ao criar uma conta, deve-se sempre informar o código e, 
 * opcionalmente, o saldo; se o saldo não for informado, ele deve ser zero. 
 * Ao movimentar dinheiro na conta, o saldo nunca deve ser negativo.
+ Considere que a classe deve possuir os seguintes atributos 
	(não use nenhum modificador de acesso, como public ou private):
- `double saldo`
- `String codigo`
+ Considere que a classe deve possuir os seguintes métodos:
- `boolean retira(double quantia)`: subtrai a quantia do saldo da conta, 
	a menos que o saldo seja insuficiente (isto é, menor que a quantia). 
	Retorna `true` se a quantia foi retirada, `false` caso contrário
- `void deposita(double quantia)`: adiciona a quantia ao saldo da conta.
- `boolean transfere(double quantia, Conta beneficiario)`: 
	transfere a quantia da conta atual para a conta do beneficiário, 
	a menos que o saldo da conta atual seja insuficiente (ou ainda se a conta do beneficiário for `null`). 
	Retorna `true` se a transferência foi realizada, `false` caso contrário

 */