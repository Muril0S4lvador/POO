package Conta;

public class Pessoa {
    private String name;
    private String cpf;

    public Pessoa(String nome, String cpf){
        this.name = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return this.name;
    }

    public String getCPF(){
        return this.cpf;
    }
}
