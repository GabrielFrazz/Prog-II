package entities;

public class Salario {
    
    protected double maos;
    protected double pes;

    public Salario(double maos, double pes){
        this.maos = maos;
        this.pes = pes;
    }

    /**
     * @return double return the maos
     */
    public double getMaos() {
        return maos;
    }

    /**
     * @param maos the maos to set
     */
    public void setMaos(double maos) {
        this.maos = maos;
    }

    /**
     * @return double return the pes
     */
    public double getPes() {
        return pes;
    }

    /**
     * @param pes the pes to set
     */
    public void setPes(double pes) {
        this.pes = pes;
    }

    public double salarioTotal(int qtdMaos, int qtdPes){
        return ((qtdMaos*maos)+(qtdPes*pes))/2;
    }
}