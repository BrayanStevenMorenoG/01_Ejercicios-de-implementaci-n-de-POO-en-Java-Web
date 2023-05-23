package Metodos;

public abstract class Bolsillos {

    double saldo;

    public Bolsillos(){

    }

    public Bolsillos(double saldo){

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public abstract double recargarSaldo(double saldo);

    public abstract double retirarSaldo(double saldo);

    public abstract double consultarSaldo(double saldo);

}
