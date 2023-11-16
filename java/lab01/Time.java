public class Time{
    
    private String nome;
    private int nTitulos;

    public Time(String nome){
        this.nome = nome;
    }

    public Time(String nome, int nTitulos){
        this.nome = nome;
        this.nTitulos = nTitulos;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTitulos(int nTitulos){
        this.nTitulos = nTitulos;
    }

    public void incrementaTitulos(){
        this.nTitulos++;
    }

    public String getNome(){
        return this.nome;
    }

    public int getTitulos(){
        return this.nTitulos;
    }

    public String toString(){
        return this.nome;
    }

}