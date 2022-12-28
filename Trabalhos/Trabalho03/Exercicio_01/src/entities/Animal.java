package entities;

public class Animal {

    private String nome;
    private Double peso;

    public Animal(){
        
    }
    public Animal(String nome){
        this.nome = nome;
    }
    
    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return Double return the peso
     */
    public Double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Double peso) {
        this.peso = peso;
    }

}