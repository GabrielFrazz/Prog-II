package application;

import entities.AdapterMedidor;
import entities.MedidorFarenheit;

public class App {
    public static void main(String[] args) throws Exception {

        MedidorFarenheit medidorFarenheit = new MedidorFarenheit();
        AdapterMedidor adapter = new AdapterMedidor(medidorFarenheit);

        System.out.println(adapter.medirTemperatura());
        
    }
}
