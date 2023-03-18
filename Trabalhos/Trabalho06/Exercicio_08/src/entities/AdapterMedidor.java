package entities;

public class AdapterMedidor implements MedidorCelsiusIF{
    
    private MedidorFarenheit medidorFarenheit;
    
    public AdapterMedidor(MedidorFarenheit medidorFarenheit) {
        this.medidorFarenheit = medidorFarenheit;
    }

    @Override
    public double medirTemperatura() {
        return (medidorFarenheit.getTemperaturaFarenheit()-32)/1.8;
    }

}