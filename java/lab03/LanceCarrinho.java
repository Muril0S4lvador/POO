public class LanceCarrinho extends Lance{

    private int carrinho;
    private String sofreuCarrinho;

    public LanceCarrinho(String jogador, int min, String vitima){
        super(jogador, min);
        this.sofreuCarrinho = vitima;
    }
    
    public void incCarrinho(){
        this.carrinho++;
    }

    public int getCarrinho(){
        return this.carrinho;
    }

    public String getSofreuCarrinho(){
        return this.sofreuCarrinho;
    }
    
}
