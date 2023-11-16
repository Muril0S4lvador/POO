import RedeSocial.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        RedeSocial insta = new RedeSocial("Instagram");

        insta.addUsuario("Murilo");
        insta.addUsuario("Matheus");
        insta.addUsuario("Gabriella");

        insta.imprimirUsuarios();

        Usuario murilo = insta.getUsuario(0);
        Usuario gabs = insta.getUsuario(2);
        Usuario mats = insta.getUsuario(1);

        murilo.addAmigo(mats);

        mats.addAmigo(gabs);
        mats.addAmigo(murilo);

        gabs.addAmigo(murilo);

        murilo.imprimirAmigos();
        mats.imprimirAmigos();
        gabs.imprimirAmigos();

        insta.removeUsuario(gabs);

        insta.imprimirUsuarios();

        murilo.imprimirAmigos();
        mats.imprimirAmigos();


    }
}
