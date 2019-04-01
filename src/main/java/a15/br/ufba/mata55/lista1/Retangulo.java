package a15.br.ufba.mata55.lista1;

public class Retangulo {
	double largura = 1;
	double altura = 1;
	public Retangulo(double la, double al) {
		this.largura = la;
		this.altura = al;
	}

	 public double calculaArea() {
		double ca;
		double larg = largura;
		double alt = altura;
		ca = larg * alt;
	 	return ca;
	}
	 
	 public double calculaPerimetro() { 
		double cp;
		double larg = largura;
		double alt = altura;	 
		cp = larg*2 + alt*2;
		return cp;
	 }
}
