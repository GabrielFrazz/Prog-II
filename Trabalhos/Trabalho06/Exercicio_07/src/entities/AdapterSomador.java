package entities;

public class AdapterSomador extends SomadorExistente implements SomadorEsperado{

    public AdapterSomador() {
    }

    @Override
    public int somaVetor(int[] vetor) {
        int resultado = 0;
        for(int i : vetor){
            resultado+=i;
        }
        return resultado;
    }
    
}