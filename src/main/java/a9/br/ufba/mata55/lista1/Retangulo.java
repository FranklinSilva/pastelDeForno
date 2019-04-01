package a9.br.ufba.mata55.lista1;

public class Retangulo{
	
	private double largura;
	private double altura;
	

	public Retangulo(){
		this.largura = 1;
		this.altura = 1;
	}
	
	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	double calculaArea() {
		double area = this.largura * this.altura;
		return area;
	}
	
	double calculaPerimetro() {
		double perimetro = this.largura*2 + this.altura*2;
		return perimetro;
	}
	
}