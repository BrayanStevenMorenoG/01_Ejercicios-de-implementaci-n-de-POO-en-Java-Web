package Metodos;

public class MetodosDaviplata extends Bolsillos{
    
    private double recar; 

    public MetodosDaviplata(){

    }

    public MetodosDaviplata(double recar){   
    
    }

    
    public double getRecar() {
        return recar;
    }

    public void setRecar(double recar) {
        this.recar = recar;
    }


    public double recargarSaldo(double recar)
    {
        saldo = recar+saldo;
        return saldo;
    }

    public double retirarSaldo(double recar)
    {
        if (saldo>=recar){
            saldo = saldo-recar;
            }
            return saldo;
    }

    public double consultarSaldo(double saldo){
        return saldo;
    }

    
}