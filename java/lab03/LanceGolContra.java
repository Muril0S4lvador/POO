public class LanceGolContra extends Lance{

    private int golsContra;

    public LanceGolContra(String jogador, int min) {
        super(jogador, min);
        incGolContra();   
    }

    public int getGolContra() {
        return golsContra;
    }

    public void incGolContra() {
        this.golsContra++;
    }
    
}
