package entities;

public class SanduichesIngredientFactoryJP implements SanduichesIngredientFactory{
    @Override
    public Pao getPao() {
        return new PaoFrances();
    }

    @Override
    public Presunto getPresunto() {
        return new PresuntoDeFrango();
    }

    @Override
    public Queijo getQueijo() {
        return new QueijoMussarela();
    }

    @Override
    public Salada getSalada() {
        return new SaladaCom();
    }

    @Override
    public String getNameOfSandwich(){
        return "JP";
    }
}