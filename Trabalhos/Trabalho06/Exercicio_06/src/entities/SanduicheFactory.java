package entities;

public class SanduicheFactory {

    public SanduichesIngredientFactory getFactory(String fabrica) {
        if (fabrica.equalsIgnoreCase("cg")) {
            return new SanduichesIngredientFactoryCG();
        }else if (fabrica.equalsIgnoreCase("jp")) {
            return new SanduichesIngredientFactoryJP();
        }else if(fabrica.equalsIgnoreCase("rt")){
            return new SanduichesIngredientFactoryRT();
        }
        return null;
    }

}