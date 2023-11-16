package RedeSocial;

import java.util.Map;
import java.util.HashMap;

public class Usuario {
    
    private String name;
    private int id;
    private RedeSocial redeSocial;
    private Map<Integer, Usuario> amigos;
    
    public Usuario(String name, int id, RedeSocial redeSocial){
        this.id = id;
        this.name = name;
        this.redeSocial = redeSocial;
    }
    
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public RedeSocial getRedeSocial() {
        return redeSocial;
    }

    public void addAmigo(Usuario amigo){
        this.amigos.put(amigo.getId(), amigo);
    }
    public boolean removeAmigo(Usuario amigo){
        return this.amigos.remove(amigo.getId(), amigo);
    }

    public void imprimirAmigos(){

        System.out.println("\nAmigos de " + this.name);

        for( Integer i : this.amigos.keySet() ){
            Usuario amigo = this.amigos.get(i);
            System.out.println("Nome: " + amigo.getName() + " Id: " + amigo.getId() + " Rede: " + amigo.getRedeSocial().getName());
        }
    }
    


}
