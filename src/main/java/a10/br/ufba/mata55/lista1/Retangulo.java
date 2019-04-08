package a10.br.ufba.mata55.lista1;

public class Retangulo {

		
	public double altura;
	public  double largura;
	
	
	public Retangulo() {
        this.largura = 1;
        this.altura = 1;
    }

	public Retangulo (double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
	
	
	public double calculaArea(){
	
		 return altura*largura  ;
	}
	
	
	public double calculaPerimetro(){
		return 2*altura+2*largura ;
		
	}
	
}
