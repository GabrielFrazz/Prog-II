package entities;

public class Cachorro extends Animal {

    private String raca;

    public Cachorro() {

    }

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    /**
     * @return String return the raca
     */
    public String getRaca() {
        return raca;
    }

    public void setPeso(Double peso) {
        super.setPeso(peso);
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        if (super.getPeso() == null) {

            return super.getNome()
                    + ", "
                    + "Peso não registrado"
                    + "\n" + "Raça: "
                    + raca;
        } else {
            return super.getNome()
                    + ", "
                    + super.getPeso()
                    + "Kg \n" + "Raça: "
                    + raca;
        }
    }

}