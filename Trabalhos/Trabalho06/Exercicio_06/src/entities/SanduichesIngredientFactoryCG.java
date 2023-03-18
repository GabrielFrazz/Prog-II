package entities;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory{

    @Override
    public Pao getPao() {
        return new PaoIntegral();
    }

    @Override
    public Presunto getPresunto() {
        return new PresuntoDeFrango();
    }

    @Override
    public Queijo getQueijo() {
        return new QueijoPrato();
    }

    @Override
    public Salada getSalada() {
        return new SaladaSem();
    }

    @Override
    public String getNameOfSandwich(){
        return "CG";
    }
}