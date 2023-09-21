package Conta;

public class ContaPremium extends Conta {
    
    public ContaPremium(Pessoa dono){
        super(dono);
    }

    public void saquePremium(float value){
        float saldo = this.getSaldo();
        if( saldo < value + value * 0.001 ){
            System.out.println("Saldo nao disponível");
            return;
        }
        saldo -= value + value * 0.001;
        this.saldo = saldo;
        System.out.println("Saque efetivado com sucesso");
    }

}
