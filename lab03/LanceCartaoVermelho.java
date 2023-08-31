public class LanceCartaoVermelho extends Lance{

    private int cartaoVermelho;

    public LanceCartaoVermelho(String jogador, int min){
        super(jogador, min);
        incCartaoVermelho();
    }
    
    public int getCartaoVermelho() {
        return cartaoVermelho;
    }

    public void incCartaoVermelho() {
        this.cartaoVermelho++;
    }

    
    
}
