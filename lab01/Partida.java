public class Partida
{
    private Time timeA;
    private Time timeB;
    private int[] gols = new int[2];

    public Partida(Time timeA, Time timeB){
        this.timeA = timeA;
        this.timeB = timeB;
    }

    public Time getTimeA() {
        return timeA;
    }

    public Time getTimeB() {
        return timeB;
    }

    public int getGolsTimeA() {
        return gols[0];
    }

    public int getGolsTimeB() {
        return gols[1];
    }

    public void setGolsTimeA(int golsTimeA) {
        this.gols[0] = golsTimeA;
    }
    public void setGolsTimeB(int golsTimeB) {
        this.gols[1] = golsTimeB;
    }

    public void incrementGolSTimeA() {
        this.gols[0]++;
    }
    public void incrementGolSTimeB() {
        this.gols[1]++;
    }

    public Time winner(){
        if( this.getGolsTimeA() > this.getGolsTimeB() ){
            return this.timeA;

        } else if( this.getGolsTimeA() < this.getGolsTimeB() ){
            return this.timeB;

        }

        return null;        
    }

    
}