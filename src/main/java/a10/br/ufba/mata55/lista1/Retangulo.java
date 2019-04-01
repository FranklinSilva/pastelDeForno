package a10.br.ufba.mata55.lista1;

public class Retangulo {

		
	public double altura;
	public  double largura;
	
	
	Retangulo() {
        this.largura = 1;
        this.altura = 1;
    }

	Retangulo (double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
	
	
	public double CalculaArea(){
	
		 return altura*largura  ;
	}
	
	
	public double CaculaPerimetro(){
		return 2*altura+2*largura ;
		
	}
	
}
