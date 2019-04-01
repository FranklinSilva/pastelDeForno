package a38.br.ufba.mata55.lista1;
//Autor: Tiago Moraes
import java.util.Scanner;

public class Retangulo {

    double largura;
    double altura;

public Retangulo(double lar, double alt){

    this.largura = lar;
    this.altura = alt;
}

public Retangulo(){
    this.largura = 1;
    this.altura = 1;
}
   
double calculaArea(){
    return largura * altura;
}

double calculaPerimetro(){
    return (largura + altura)*2;
}

public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite os valores de largura e altura: ");
        double largura = entrada.nextDouble();
        double altura = entrada.nextDouble();

        Retangulo retangulo = new Retangulo(largura,altura);
        System.out.println("O valor da area é: ");
        System.out.println(retangulo.calculaArea());
        
        System.out.println("O valor do perimetro é: ");
        System.out.println(retangulo.calculaPerimetro());
        
        Retangulo retanguloo = new Retangulo();
        System.out.println(retanguloo.calculaPerimetro());
    
    }
}