package entities;

public class FabricaFiat extends FabricaDeCarro{

    @Override
    public CarroSedan criarCarroSedan(String car) {
        if(car == null){
            return null;
        }else if(car.equalsIgnoreCase("siena")){
            return new Siena();
        }else if(car.equalsIgnoreCase("fiestasedan")){
            return new FiestaSedan();
        }

        return null;
    }

    @Override
    public CarroPopular criarCarroPopular(String car) {
        return null;
    }
    
}