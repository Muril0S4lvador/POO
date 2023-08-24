public class App
{
    public static void main(String[] args){
        Time fla = new Time("Flamengo");
        Time flu = new Time("Fluminense");

        Partida flaflu = new Partida(fla, flu);

        Campeonato c = new Campeonato();
        c.adicionaPartida(flaflu);
        Time vasco = new Time("Vasco");
        c.adicionaPartida(new Partida(fla, vasco));

    }
}