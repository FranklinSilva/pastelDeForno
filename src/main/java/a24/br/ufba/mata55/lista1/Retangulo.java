package a24.br.ufba.mata55.lista1;


public class Retangulo {
    double largura; 
    double altura;
    
    public Retangulo(double i, double j){
        largura = i;
        altura = j;
    }
    public Retangulo() {
        largura = 1; 
        altura = 1; 
    }
    public double calculaArea() {
        return this.altura * this.largura ;
    }
    public double calculaPerimetro() {
        return (this.altura + this.largura)*2;
    }


public static void main(String[] args) {
    Retangulo ret = new Retangulo();
        System.out.println(ret.altura);
        System.out.println(ret.largura);
        System.out.println(ret.calculaArea());
        System.out.println(ret.calculaPerimetro());
    }
}