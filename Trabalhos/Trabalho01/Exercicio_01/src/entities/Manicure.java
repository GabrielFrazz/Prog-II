package entities;

public class Manicure {

    private String nome;
    private double salario;

    public Manicure(String nome, int qtdMaos, int qtdPes, Salario salario) {
        this.nome = nome;
        this.salario = salario.salarioTotal(qtdMaos, qtdPes);
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Salario return the salario
     */
    public double getSalario() {
        return salario;
    }

    @Override
    public String toString(){
        return nome + ": " + "R$" + String.format("%.2f", salario);
    }
}