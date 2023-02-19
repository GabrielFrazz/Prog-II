package entities;

import services.Comparavel;

public class Pessoa implements Comparavel {

    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public int comparar(Object o) {
        Pessoa p;

        p = (Pessoa)o;
        if (p.getIdade() == idade) {
            return 0;
        }

        return this.idade - p.idade;
    }

}