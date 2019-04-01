package a7.br.ufba.mata55.lista1;

class Retangulo {

    double altura;
    double largura;

    Retangulo (double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    Retangulo () {
        this(1, 1);
    }

    double calculaArea() {
        return (this.altura* this.largura);
    }

    double calculaPerimetro() {
        return ((this.altura * 2) + (this.largura *2));
    }
}
