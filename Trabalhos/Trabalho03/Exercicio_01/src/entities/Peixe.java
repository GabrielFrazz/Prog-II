package entities;

public class Peixe extends Animal{

    private String tipoHabitat;

    public Peixe(String nome, Double peso, String tipoHabitat){
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    /**
     * @return String return the tipoHabitat
     */
    public String getTipoHabitat() {
        return tipoHabitat;
    }

    /**
     * @param tipoHabitat the tipoHabitat to set
     */
    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString(){
        return super.getNome()
        + ", "
        + super.getPeso()
        + "Kg \n" + "Habitat: "
        + tipoHabitat;
    }

}