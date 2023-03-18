package entities;

public class Lanchonete {

    private static SanduicheFactory fs;
    private static Sanduiche sanduiche;
    private static Lanchonete instancia = null;

    private Lanchonete(String fabrica){
        fs = new SanduicheFactory();
        sanduiche = new Sanduiche(fs.getFactory(fabrica).getNameOfSandwich(), fs.getFactory(fabrica).getPao(), fs.getFactory(fabrica).getPresunto(), fs.getFactory(fabrica).getQueijo(), fs.getFactory(fabrica).getSalada());
    }

    public static Lanchonete getInstancia(String fabrica){
        if(instancia == null){
            instancia = new Lanchonete(fabrica);
            return instancia;
        }
        sanduiche = new Sanduiche(fs.getFactory(fabrica).getNameOfSandwich(), fs.getFactory(fabrica).getPao(), fs.getFactory(fabrica).getPresunto(), fs.getFactory(fabrica).getQueijo(), fs.getFactory(fabrica).getSalada());
        return instancia;
    }

    @Override
    public String toString(){
        return sanduiche.toString();
    }
}