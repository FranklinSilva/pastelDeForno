package a20.br.ufba.mata55.lista1;

public class Retangulo {
	double largura = 1;
	double altura = 1;
	
	
	public Retangulo() {
		this.altura = this.largura = 1;
	}
	
	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	double calculaArea() {
		return this.largura * this.altura;
	}
	
	double calculaPerimetro(){
		
		return (this.largura * 2) + (this.altura * 2);
	}
	
	public static void main (String[] args) {
	
		Retangulo meuRetangulo = new Retangulo(2,2);
		double calarea = meuRetangulo.calculaArea();
		System.out.println(calarea);
		double calperimetro = meuRetangulo.calculaPerimetro();
		System.out.println(calperimetro);
	}
	
}
