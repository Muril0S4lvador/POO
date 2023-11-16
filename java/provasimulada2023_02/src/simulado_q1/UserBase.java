package simulado_q1;

import java.util.*;

public class UserBase {
    private Map<String, User> users = new HashMap<>();

    public void addUser(User u){
        this.users.put(u.getId(), u);
    }
    
    public Set<User> getUsuarios(){
        return new HashSet<>(users.values());
    }
    
    
}
