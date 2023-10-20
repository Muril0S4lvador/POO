package simulado_q3;

public class Banco {

    private String nome;
    private Agencia agencia;

    public Banco(String nome){
        this.nome = nome;
    }

    public Agencia criaAgencia(String nomeAgencia){
        this.agencia = new Agencia(nomeAgencia);
        return this.agencia;
    }

    @Override
    public String toString(){
        
        double sum = 0, cont = 0;
        for( Conta c : this.agencia.getContas() ){
            sum += c.getSaldo();
            cont++;
        }
        return "Nome do Banco: " + this.nome + "\nAgência: " + this.agencia.getNome()
        + ", saldo médio: " + sum/cont;
        
    }
    
}
