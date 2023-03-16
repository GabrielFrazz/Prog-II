package entities;

public class FabricaFord extends FabricaDeCarro{
    
    @Override
    public CarroSedan criarCarroSedan(String car) {
        return null;
    }

    @Override
    public CarroPopular criarCarroPopular(String car) {
        if(car == null){
            return null;
        }else if(car.equalsIgnoreCase("palio")){
            return new Palio();
        }else if(car.equalsIgnoreCase("fiesta")){
            return new Fiesta();
        }
        return null;
    }
}