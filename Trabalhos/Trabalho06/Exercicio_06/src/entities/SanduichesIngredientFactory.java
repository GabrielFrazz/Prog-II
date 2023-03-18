package entities;

public interface SanduichesIngredientFactory {

    public Pao getPao();
    public Presunto getPresunto();
    public Queijo getQueijo();
    public Salada getSalada();
    public String getNameOfSandwich();
    
}