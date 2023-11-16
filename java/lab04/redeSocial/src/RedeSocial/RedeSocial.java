package RedeSocial;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class RedeSocial {
    
    private String name;
    private Map<Integer, Usuario> usuarios = new HashMap<>();
    private int proxId;

    public RedeSocial(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Usuario getUsuario(Integer id){
        return this.usuarios.get(id);
    }

    public void addUsuario(String name){
        this.usuarios.put(proxId, new Usuario(name, this.proxId, this));
        proxId++;
    }
    public boolean removeUsuario(Usuario user){
        
        for (Integer i : usuarios.keySet() ) {
            Usuario rm = this.usuarios.get(i);
            rm.removeAmigo(user);
        }
        
        return this.usuarios.remove(user.getId(), user);
    }

    public Set<Usuario> getUsuarios(){
        return new HashSet<Usuario>(this.usuarios.values());
    }

    public void imprimirUsuarios(){

        System.out.println("\nUsuarios da rede " + this.name);

        for (Integer i : usuarios.keySet() ) {
            Usuario user = this.usuarios.get(i);
            System.out.println("Nome: " + user.getName() + " Id: " + user.getId() + " Rede: " + user.getRedeSocial().getName());
        }
        
    }

    

    
    


}
