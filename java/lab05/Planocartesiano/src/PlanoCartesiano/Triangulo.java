package PlanoCartesiano;

public class Triangulo {
    private Ponto[] vertex = new Ponto[3];

    public Triangulo(Ponto p1, Ponto p2, Ponto p3)
    {
        this.vertex[0] = p1;
        this.vertex[1] = p2;
        this.vertex[2] = p3;

    }

    public Ponto getVertex(int idx){
        if( idx <= 3 )
            return this.vertex[idx];
        return null;
    }

    public double getEdgeSize(Ponto act, Ponto next){
        double result = Math.pow(act.getX() - next.getX(), 2) +
                        Math.pow(act.getY() - next.getY(), 2);
        return Math.sqrt(result);
    }

    public double getPerimetro(){
        double result = 0;
        for(int i = 0; i < 2; i++){
            result += getEdgeSize(getVertex(i), getVertex(i + 1));
        }
        return result;
    }
    
}
