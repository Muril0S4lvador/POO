import java.util.HashSet;

public class Departamento{
    private String name;
    private HashSet<Funcionario> funcionarios = new HashSet<>();

    public Departamento(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public boolean addFuncionario(Funcionario f){
        return funcionarios.add(f);
    }
    public boolean removeFuncionario(Funcionario f){
        return funcionarios.remove(f);
    }

    public HashSet<Funcionario> getFuncionarios(){
        HashSet<Funcionario> f = new HashSet<>(funcionarios);
        return f;
    }

}