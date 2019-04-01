package a11.br.ufba.mata55.lista1;

public class Retangulo {
	double altura;
	double largura;
	
	public Retangulo(double largura, double altura)
	{
		this.largura = largura;
		this.altura = altura;
	}
	public Retangulo()
	{
		this.altura = 1;
		this.largura = 1;
	}
	
	double calculaArea()
	{
		double area = largura * altura;
		return area;
	}
	double calculaPerimetro()
	{
		double perimetro = altura*2 + largura*2;
		return perimetro;
	}

}
