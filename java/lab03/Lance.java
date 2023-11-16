public abstract class Lance {

    String nomeJogador;
    int minutoOcorrencia;

    public Lance(String nome, int min){
        nomeJogador = nome;
        minutoOcorrencia = min;
    }

    public Lance getLance(){
        Lance l = this;
        return l;
    }

    public String getNome(){
        return this.nomeJogador;
    }

    public int getTempo(){
        return this.minutoOcorrencia;
    }

}