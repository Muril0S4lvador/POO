package Conta;

public class Conta {
     
    private Pessoa dono;
    protected float saldo;

    public Conta(Pessoa dono){
        this.dono = dono;
    }

    public void deposito(float value){
        if( value > 0 )
            this.saldo += value;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public Pessoa getDono(){
        return this.dono;
    }

    public void saqueComum(float value){
        if( this.saldo < value + value * 0.005 ){
            System.out.println("Saldo nao disponível");
            return;
        }
        this.saldo -= value + value * 0.005;
        System.out.println("Saque efetivado com sucesso");
    }
    
}
