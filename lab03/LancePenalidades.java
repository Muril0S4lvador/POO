public class LancePenalidades extends Lance {
    
    private String penalidade;

    public LancePenalidades(String jogador, int min ,String penalidade){
        super(jogador, min);
        this.penalidade = penalidade;
    }
    
    public String getPenalidade() {
        return penalidade;
    }

}
