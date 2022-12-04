package entities;

public class Plantas {
    private String name;
    private int qtd;
    private int qtd_id;

    public Plantas(String name, int qtd, int qtd_id) {
        this.name = name;
        this.qtd = qtd;
        this.qtd_id = qtd_id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return int return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @return int return the qtd_id
     */
    public int getQtd_id() {
        return qtd_id;
    }

    public int faltando() {
        return qtd_id - qtd;
    }

    @Override
    public String toString() {
        return name
                + ": "
                +"\n"
                + qtd
                + " unidades "
                +" \nqtd ideal: "
                + qtd_id
                + "\na comprar: "
                + faltando();
    }

}