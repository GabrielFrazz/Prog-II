package entities;


public class Cliente {

    public static FabricaDeCarro getFactory(String fabrica){
        if(fabrica.equalsIgnoreCase("fiat")){
            return new FabricaFiat();
        }else if(fabrica.equalsIgnoreCase("ford")){
            return new FabricaFord();
        }
        return null;
    }
}