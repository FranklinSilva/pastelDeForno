package a11.br.ufba.mata55.lista1;

public class Conta {
	
	String codigo;
	double saldo;
	
	public Conta(String codigo, double saldo)
		{
			this.saldo = saldo;	
		}
	public Conta(String codigo)
		{
			this(codigo, 0);
		}
	
	public boolean retira(double quantia)
		{
			if (saldo>quantia)
			{
				this.saldo -= quantia;
				return true;
			}
			else
				return false;
		}
	public void deposita(double quantia)
		{
			this.saldo += quantia;
		}
	public boolean transfere(double quantia, Conta beneficiario)
		{
			if (this.saldo>quantia)
			{
				if(beneficiario.codigo != null)
				{
					this.saldo -= quantia;
					beneficiario.saldo += quantia;
					return true;
				}
				else
					return false;
			}
			else
				return false;
		}
}
