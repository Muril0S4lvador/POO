public class LanceFalta extends Lance {

    private boolean penalti;
    private String vitima;

    public LanceFalta(String jogador, int min, String vitima, boolean penalti){
        super(jogador, min);
        setVitima(vitima);
        setPenalti(penalti);
    }

    public boolean isPenalti() {
        return penalti;
    }
    public void setPenalti(boolean penalti) {
        this.penalti = penalti;
    }
    public String getVitima() {
        return vitima;
    }
    public void setVitima(String vitima) {
        this.vitima = vitima;
    }
    
}
