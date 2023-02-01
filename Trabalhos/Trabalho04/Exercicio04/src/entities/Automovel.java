package entities;

public class Automovel extends Veiculo{
    
    @Override
    public void listarVerificacoes() {
        System.out.println("1 - MM/dd/yyyy");
        System.out.println("2 - MM/dd/yyyy");
        System.out.println("3 - MM/dd/yyyy");
    }

    @Override
    public void ajustar() {
        System.out.println("o automóvel foi ajustado!!");
    }

    @Override
    public void limpar() {
        System.out.println("o automóvel foi limpo!!");  
    } 

    public void mudarOleo(){
        System.out.println("óleo trocado!!!");
    }
}