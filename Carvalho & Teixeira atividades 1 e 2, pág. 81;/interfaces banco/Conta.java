
public abstract class Conta
{
private int numero;
private Cliente titular;
private double saldo;
    


public Conta(int numero, Cliente titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
   }

   public Conta(int numero, Cliente titular){
        this.numero = numero;
        this.titular = titular;
        saldo = 0;
   }
   public Conta(int numero, String nomeTitular, String cpfTitular){
        this.numero = numero;
        this.titular = new Cliente(nomeTitular, cpfTitular);
        saldo = 0;
   }
   public Cliente getTitular(){
        return titular;
   }
   public void setTitular(Cliente titular){
        this.titular = titular;
   }
   public int getNumero() {
     return numero;
   }
   public void setNumero(int numero) {
     this.numero = numero;
   }
   public double getSaldo() {
     return saldo;
   }

   public void setSaldo(double saldo) {
     this.saldo = saldo;
   }

   public abstract boolean sacar(double valor);
   public abstract void depositar(double valor);
}