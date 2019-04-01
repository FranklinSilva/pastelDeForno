package a23.br.ufba.mata55.lista1;
public class Retangulo {
	double altura, largura;
	
	public Retangulo (double largura, double altura) {
		this.altura=altura;
		this.largura=largura;	
		
	}
	double calculaArea() {
		return altura*largura;
	}
	
	double calculaPerimetro() {
		return altura*2+largura*2;
	}
	
}
