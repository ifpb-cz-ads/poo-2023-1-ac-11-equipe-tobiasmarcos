
public class ContaPoupança extends Conta{

    public ContaPoupança(int numero, Cliente titular) {
        super(numero, titular);
    }

    public void reajustar(double percentual){
        double saldoAtual = this.getSaldo();
        double reajuste = saldoAtual * percentual;
        this.depositar(reajuste);
    }

   @Override
   public boolean sacar(double valor){
        if (this.getSaldo() >= valor){
            double saldo = this.getSaldo();
            saldo -= valor;
            this.setSaldo(saldo);
            return true;
        } else{
            return false;
        }
   }
   public void depositar(double valor){
    double saldo = this.getSaldo();
    this.setSaldo(saldo + valor);
   }
    
}

