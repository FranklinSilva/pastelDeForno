package a6.br.ufba.mata55.lista1;

public class Retangulo {
	double largura = 1;
	double altura = 1;
	
	 public Retangulo(double larg, double alt) {
		    largura = larg;
		    altura = alt;
		  }
	
	public double calculaArea() {
	    return largura*altura;
	  }
	
	public double calculaPerimetro() {
	    return largura+altura+largura+altura;
	  }
	
	public static void main(String[] args) {
		Retangulo primeiro = new Retangulo(5, 6);
		System.out.println(primeiro.calculaArea());
		System.out.println(primeiro.calculaPerimetro());
	  }
	}
