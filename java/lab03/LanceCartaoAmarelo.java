public class LanceCartaoAmarelo extends Lance{

    private int cartaoAmarelo;

    public LanceCartaoAmarelo(String jogador, int min){
        super(jogador, min);
        incCartaoAmarelo();
    }

    public int getCartaoAmarelo() {
        return cartaoAmarelo;
    }

    public void incCartaoAmarelo() {
        this.cartaoAmarelo++;
    }
    
}
