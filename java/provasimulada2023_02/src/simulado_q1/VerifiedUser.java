package simulado_q1;

import java.util.Date;

public class VerifiedUser extends User {
    private Date verificationDate;

    public VerifiedUser(String nome, Date date){
        super(nome);
        this.verificationDate = date;
    }

    @Override
    public Boolean isVerified(){
        return true;
    }
}
