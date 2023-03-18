package entities;

public class Cliente {

    private static Cliente instancia = null;
    private SomadorEsperado somador;

    private Cliente(SomadorEsperado somador){
        this.somador = somador;
    }

    public static Cliente getInstancia(SomadorEsperado somador){
        if(instancia == null){
            instancia = new Cliente(somador);
        }
        return instancia;
    }

    public void executar(){
        int[] vetor = new int[] {1,2,3,4,5,6,7,8,9,10};
        int soma = somador.somaVetor(vetor);
        System.out.println("Resultado: " + soma);
    }

}