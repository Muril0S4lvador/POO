package simulado_q3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Agencia {

    private String nome;
    private List<Conta> contas = new LinkedList<>();

    public Agencia(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void adicionaConta(Conta conta){
        this.contas.add(conta);
    }

    public List<Conta> getContas(){
        return new ArrayList<Conta>(contas);
    }
    
    
}
