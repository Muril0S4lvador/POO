package simulado_q2;

import java.util.Random;

public class Pokemon implements PersonagemDeLuta<Pokemon>{
    private int regenera;
    private int pontosVitalidade;
    private int minimoDano;
    private int maximoDano;

    public Pokemon(int pontosVitalidade, int minimoDano, int maximoDano){
        this.regenera = pontosVitalidade;
        this.pontosVitalidade = pontosVitalidade;
        this.minimoDano = minimoDano;
        this.maximoDano = maximoDano;
    }

    public int danoProduzido(){
        Random r = new Random();
        if( r.nextBoolean() == true )
            return this.maximoDano;
        return this.minimoDano;
    }

    public void danoRecebido(int dano){
        this.pontosVitalidade -= dano;
        if( this.pontosVitalidade < 0 )
            this.pontosVitalidade = 0;
    }

    public boolean atacar(Pokemon personagemAtacado){
        personagemAtacado.danoRecebido(this.danoProduzido());

        if( personagemAtacado.getPontosVitalidade() == 0 )
            return true;
        return false;
    }

    public void regenera(){
        this.pontosVitalidade = this.regenera;
    }

    public int getPontosVitalidade(){
        return this.pontosVitalidade;
    }
    
}
