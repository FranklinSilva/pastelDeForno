package a22.br.ufba.mata55.lista1;

import java.util.Scanner;

public class Conta {
    String codigo;
    double saldo;
//-----------------------------------------------
    public Conta(String cod, double sal)
    {
        this.codigo = cod;
        this.saldo = sal;
    }
    
    public Conta(String cod)
    {
        this.codigo = cod;
        this.saldo = 0;
    }
//-----------------------------------------------    
    boolean retira(double quantia)
    {
        if (this.saldo < quantia){
            return false;
        }
        else {
            this.saldo = this.saldo - quantia;
            return true;
        }
    }
    
    void deposita(double quantia)
    {
        this.saldo = this.saldo + quantia;
    }
    
   // Conta beneficiario = new Conta(codigo, saldo);
    
    boolean transfere(double quantia, Conta beneficiario)
    {
        //boolean saca = this.retira(quantia);
        if (this.saldo < quantia || beneficiario.codigo == null){
            return false;
        }
        else{
        this.saldo = this.saldo - quantia;
        beneficiario.saldo += quantia;
        return true;
        }
        
    }
//-----------------------------------------------    
    public static void main(String[] args) {
       
       // Scanner entrada = new Scanner(System.in);
       // String informacodigo = entrada.nextLine();
       // double informasaldo = entrada.nextDouble();
         Conta teste = new Conta("abc12",11);
         Conta benef = new Conta("abc",10);
         teste.transfere(1.3 , benef);
         System.out.println(benef.saldo);
    }

}
