package entities;

public class Bicicleta extends Veiculo{

    @Override
    public void listarVerificacoes() {
        System.out.println("1 - MM/dd/yyyy");
        System.out.println("2 - MM/dd/yyyy");
        System.out.println("3 - MM/dd/yyyy");
    }

    @Override
    public void ajustar() {
        System.out.println("a bicicleta foi ajustada!!");
    }

    @Override
    public void limpar() {
        System.out.println("a bicicleta foi limpa!!");  
    }
    
}