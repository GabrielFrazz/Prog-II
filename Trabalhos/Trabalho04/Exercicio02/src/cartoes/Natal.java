package cartoes;

public class Natal extends CartaoWeb{

    public Natal(String destinatario){
        this.destinatario = destinatario;
    }

    @Override
    public void showMessage() {
        System.out.println("Querido(a) " + destinatario + ", ");
        System.out.println("desejo-lhe Feliz Natal e muita paz e alegria. Estarei sempre aqui. Amo você."); 
    }
}