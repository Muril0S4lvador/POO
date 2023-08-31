public class LanceGolsPro extends Lance {
    
    private int golsPro;

    public LanceGolsPro(String jogador, int min){
        super(jogador, min);
        incGolsPro();
    }

    public int getGolsPro() {
        return golsPro;
    }

    public void incGolsPro() {
        this.golsPro++;
    }

}
