package entities;

public class Peixe extends Animal{

    private String tipoHabitat;

    public Peixe(){
        
    }

    public Peixe(String nome, String tipoHabitat){
        super(nome);
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

    public void setPeso(Double peso){
        super.setPeso(peso);
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