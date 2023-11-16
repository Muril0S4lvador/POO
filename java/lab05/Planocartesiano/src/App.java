import PlanoCartesiano.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        try{
        Ponto p1 = new Ponto(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        Ponto p2 = new Ponto(Double.parseDouble(args[2]), Double.parseDouble(args[3]));
        Ponto p3 = new Ponto(Double.parseDouble(args[4]), Double.parseDouble(args[5]));
        
        System.out.println(p1);
        System.out.println(p3);
        System.out.println(p2);
        
        Triangulo t = new Triangulo(p1, p2, p3);

        System.out.println("O perimetro desse triangulo é :" + t.getPerimetro());

        } catch(NumberFormatException x){
            System.out.println("Usa direito irmão");

        }

    }
}
