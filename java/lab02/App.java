public class App {
    
    public static void main(String[] args) {
        Empresa emp = new Empresa("Liletes", "15905637977/0001-02");

        Departamento vendas = new Departamento("Vendas");
        Departamento rh = new Departamento("RH");
        Departamento juridico = new Departamento("Juridico");

        emp.addDepartamento(vendas);
        emp.addDepartamento(rh);
        emp.addDepartamento(juridico);

        vendas.addFuncionario(new Funcionario("Gabriella", "Gerente de Vendas", 3500));
        vendas.addFuncionario(new Funcionario("Matheus", "Diretor de Vendas", 3750));
        Funcionario murilo = new Funcionario("Murilo", "Dono do Departamento", 30000);
        vendas.addFuncionario(murilo);
        for (int i = 0; i < 20; i++) {
            murilo.incAnosNaEmpresa();
        }

        rh.addFuncionario(new Funcionario("Kaio", "Mulambo", 1000));
        rh.addFuncionario(new Funcionario("Jefferson", "Psicologo", 1600));

        juridico.addFuncionario(new Funcionario("JJ", "Advogada", 2600));
        juridico.addFuncionario(new Funcionario("Pablo", "Estagiário", 1320));

        System.out.println("Nome Fantasia: " + emp.getName() + "\nCNPJ: " + emp.getCNPJ());
        
        for (Departamento dep : emp.getDepartamentos()) {
            System.out.println("\n" + dep.getName());

            float mediaSalario = 0;
            System.out.println("\nFuncionarios:");    
            for(Funcionario f : dep.getFuncionarios()){
                System.out.println("Nome: " + f.getName() + "\nFunção: " + f.getFuncao() + "\nR$" + f.getSalary() + "\nTempo na empresa: " + f.getAnosNaEmpresa());
                mediaSalario += f.getSalary();
            }
            System.out.println("Media Salarial do departamento: R$" + mediaSalario / dep.getFuncionarios().size());
        }

    
        
    }

}
