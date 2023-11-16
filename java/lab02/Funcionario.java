public class Funcionario {
    private String name;
    private String função;
    private int salary;
    private float anosNaEmpresa;

    public Funcionario(String name, String função, int salary){
        this.name = name;
        setSalary(salary);
        setFuncao(função);
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setFuncao(String funcao){
        this.função = funcao;
    }

    public void incAnosNaEmpresa(){
        this.anosNaEmpresa++;
    }

    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public float getAnosNaEmpresa() {
        return anosNaEmpresa;
    }
    public String getFuncao(){
        return função;
    }
    
}
