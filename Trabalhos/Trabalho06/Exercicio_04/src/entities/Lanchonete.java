package entities;

public class Lanchonete {

    private Sanduiches sanduba;
    private static Lanchonete instancia = null;

    private Lanchonete(String tipo){
        sanduba = SanduicheFactory.montaSanduiche(tipo);
    }

    public static Lanchonete getInstancia(String tipo){
        if(instancia == null){
            instancia = new Lanchonete(tipo);
            return instancia;
        }
        instancia.sanduba = SanduicheFactory.montaSanduiche(tipo);
        return instancia;
    }

    public void lanche(){
        sanduba.sanduiche();
    }
}