import java.time.*;
import java.time.format.DateTimeFormatter;

public class Aluno{

    private int idade;
    private float renda;
    private String matricula;
    private String nome;
    private float cr;

    public Aluno( String[] infos ){

        this.matricula = infos[0];
        this.nome = infos[1];
        this.cr = Float.parseFloat(infos[2]);
        this.renda = Float.parseFloat(infos[4]);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate birth = LocalDate.parse(infos[3], format);

        this.idade = Period.between(birth, LocalDate.now()).getYears();

    }

    @Override
    public String toString(){
        System.out.println( "Aluno: " + this.nome + " | " + this.matricula );
        System.out.println("" + this.idade + "anos e CR " + this.cr);
        System.out.println("Sua renda familiar é de aproximadamente R$" + this.renda);
    }

}