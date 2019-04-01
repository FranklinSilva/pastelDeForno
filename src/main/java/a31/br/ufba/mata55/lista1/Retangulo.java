package a31.br.ufba.mata55.lista1;

public class Retangulo {
	double largura=1;
	double altura=1;
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