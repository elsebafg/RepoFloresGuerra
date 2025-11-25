public class Cuenta
{
    private Persona titular;
    private double saldo;

    public Cuenta(Persona titular){
        this.titular = titular;
        this.saldo = 0;
    }
    public Cuenta(Persona titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    public Persona getTitular() {
        return titular;
    }
    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if(valor <= 0){
            return;
        }
        this.saldo += valor;
    }
    public void retirar(double valor){
        if(valor <= 0){
            return;
        }
        this.saldo -= valor;
    }


}
