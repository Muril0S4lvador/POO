import java.util.HashSet;

public class Empresa{

    private String name;
    private String CNPJ;
    private HashSet<Departamento> departamentos = new HashSet<>();

    public String getName(){
        return this.name;
    }
    public String getCNPJ(){
        return this.CNPJ;
    }

    public Empresa(String name, String cnpj){
        this.name = name;
        this.CNPJ = cnpj;
    }

    public boolean addDepartamento(Departamento dep){
        return departamentos.add(dep);
    }

    public boolean removeDepartamento(Departamento dep){
        return departamentos.remove(dep);
    }

    public HashSet<Departamento> getDepartamentos(){
        HashSet<Departamento> dep = new HashSet<>(departamentos);
        return dep; 
    }

}