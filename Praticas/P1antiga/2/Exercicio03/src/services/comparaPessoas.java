package services;

import entities.Pessoa;

public class comparaPessoas implements Comparavel{

    private Pessoa pessoa;
    
    public comparaPessoas(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public int comparar(Object o) {
        Pessoa p = (Pessoa)o;
        if(this.pessoa.getIdade() == p.getIdade()){
            return 0;
        }
       return p.getIdade() - pessoa.getIdade();
    }
    
}