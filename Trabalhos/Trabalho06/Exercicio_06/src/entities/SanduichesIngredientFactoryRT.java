package entities;

public class SanduichesIngredientFactoryRT implements SanduichesIngredientFactory{
    
    @Override
    public Pao getPao() {
        return new PaoBola();
    }

    @Override
    public Presunto getPresunto() {
        return new PresuntoDePeru();
    }

    @Override
    public Queijo getQueijo() {
        return new QueijoCheddar();
    }

    @Override
    public Salada getSalada() {
        return new SaladaSem();
    }

    @Override
    public String getNameOfSandwich(){
        return "RT";
    }
}