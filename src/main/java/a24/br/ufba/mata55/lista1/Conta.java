package a24.br.ufba.mata55.lista1;

public class Conta {
    String codigo;
    double saldo;
    
    public Conta(String codigo) {
        this.codigo = codigo;
        saldo=0;
    }
    public Conta(String codigo, double saldo) {
        this.codigo = codigo;
        this.saldo = saldo;
    }
    public boolean retira(double quantia) {
        if(this.saldo-quantia>=0) {
            this.saldo-=quantia;
            return true;
        }
        else {
            return false;
        }
    }
    
    public void deposita(double quantia) {
        this.saldo+=quantia;
    }
    
    public boolean transfere(double quantia, Conta beneficiario) {
        if(this.saldo >= quantia && beneficiario != null) {
            this.saldo-=quantia;
            beneficiario.saldo+=quantia;
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Conta cont = new Conta("123", 10);
        Conta cont2 = new Conta("321");
        System.out.println(cont.codigo);
        System.out.println(cont.saldo);
        cont.deposita(100);
        System.out.println(cont2.saldo);
        cont.transfere(5, cont2);
        System.out.println(cont2.saldo);
    }
}