public class App {
    public static void main(String[] args) {
        Time fla = new Time("Flamengo");
        Time flu = new Time("Fluminense");

        PartidaDetalhada part = new PartidaDetalhada(fla, flu);

        LanceCarrinho carrinho = new LanceCarrinho("Hulk", 37, "Casimiro");
        LanceCartaoAmarelo cartao = new LanceCartaoAmarelo(carrinho.getNome(), carrinho.getTempo());
        LanceFalta falta = new LanceFalta(carrinho.getNome(), carrinho.getTempo(), carrinho.getSofreuCarrinho(), true);
        LanceGolsPro gol = new LanceGolsPro(falta.getVitima(), falta.getTempo());

        System.out.println("Carrinho de " + carrinho.getNome() + " em " + carrinho.getSofreuCarrinho() + " aos " + carrinho.getTempo() + "'");
        
        System.out.println("Cartao Amarelo de " + cartao.getNome() +  " aos " + cartao.getTempo() + "'");

        System.out.println("Falta de " + falta.getNome() + " em " + falta.getVitima() + " aos " + falta.getTempo() + "'");

        System.out.println("Gol de " + gol.getNome() + " aos " + gol.getTempo() + "'");

        

        
        
        
    }


}
