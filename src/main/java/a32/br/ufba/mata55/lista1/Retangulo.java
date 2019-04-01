package a32.br.ufba.mata55.lista1;

public class Retangulo {
	double largura;
	double altura;
	Retangulo (){
		largura = 1;
		altura = 1;
	}
	Retangulo (double x){
		largura = x;
		altura = 1;
	}
	Retangulo (double x, double y) {
		largura = x;
		altura = y;
	}
	double CalculaArea () {
		return largura * altura;
	}
	double CalculaPerimetro () {
		return (largura + altura)*2;
	}	
}