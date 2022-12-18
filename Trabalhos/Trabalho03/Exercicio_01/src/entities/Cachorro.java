package entities;

public class Cachorro extends Animal{

    private String raca;

    public Cachorro(String nome, Double peso, String raca){
        super(nome, peso);
        this.raca = raca;
    }

    /**
     * @return String return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString(){
        return super.getNome()
        + ", "
        + super.getPeso()
        + "Kg \n" + "Raça: "
        + raca;
    }

}