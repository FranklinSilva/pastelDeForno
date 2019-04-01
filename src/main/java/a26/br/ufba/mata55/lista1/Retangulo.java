package a26.br.ufba.mata55.lista1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Retangulo {
    
    private double largura;
    private double altura;
    
    public Retangulo(double largura, double altura){
        this.altura = altura;
        this.largura = largura;
    }
    
    public Retangulo(){
        this.largura = 1;
        this.altura = 1;
    }
    
    double calculaArea(){
        return this.largura * this.altura;
    }
    
    double calculaPerimetro(){
        return this.largura + this.altura;
    }
    
}
