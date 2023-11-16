import java.util.LinkedList;

public class PartidaDetalhada extends Partida{

    public PartidaDetalhada(Time timeA, Time timeB) {
        super(timeA, timeB);
        //TODO Auto-generated constructor stub
    }

    private LinkedList<Lance> lances = new LinkedList<>();

    public LinkedList<Lance> getLances() {
        LinkedList<Lance> l = new LinkedList<>(lances);
        return l;
    }

    public void addLances(Lance lance) {
        lances.add(lance);
        
    } 

}