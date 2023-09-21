package PlanoCartesiano;

public class Ponto {
    double x,y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    @Override
    public String toString(){
        return "x: " + x + " y: " + y;
    }
}
