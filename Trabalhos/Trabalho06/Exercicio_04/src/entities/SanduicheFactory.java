package entities;

public class SanduicheFactory {

    public static Sanduiches montaSanduiche(String tipo){
        if(tipo == null){
            return null;
        }else if(tipo.equalsIgnoreCase("CG")){
            return new CG();
        }else if(tipo.equalsIgnoreCase("JP")){
            return new JP();
        }else if(tipo.equalsIgnoreCase("RT")){
            return new RT();
        }
        return null;
    }
}