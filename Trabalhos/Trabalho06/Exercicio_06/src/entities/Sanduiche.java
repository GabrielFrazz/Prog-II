package entities;

public class Sanduiche{
    
    private String name;
    private Pao pao;
    private Presunto presunto;
    private Queijo queijo;
    private Salada salada;

    public Sanduiche(String name, Pao pao, Presunto presunto, Queijo queijo, Salada salada) {
        this.name = name;
        this.pao = pao;
        this.presunto = presunto;
        this.queijo = queijo;
        this.salada = salada;
    }

    @Override
    public String toString(){
        return "Sanduiche "
        + name
        +"! "
        + "\n"
        + "Ingredientes: "
        + "\n"
        + "- "
        + pao.getTipo()
        + "\n"
        + "- "
        + presunto.getTipo()
        + "\n"
        + "- "
        + queijo.getTipo()
        + "\n"
        + "- "
        + salada.getTipo();
    }
    
}