
public class ContaEspecial extends Conta{

    
    private double limite;
    
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(int numero, Cliente titular, double limite){
        super(numero, titular);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor){
        if (valor <= this.limite + this.getSaldo()){
            double saldo = this.getSaldo();
            saldo -= valor;
            this.setSaldo(saldo);
            return true;
        } else {
            return false;
        }
    }
    
    public void depositar(double valor){
        double saldo = this.getSaldo();
        this.setSaldo(saldo + valor);
       }
   
}
