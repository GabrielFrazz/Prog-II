package cartoes;

public class Aniversario extends CartaoWeb{

    public Aniversario(String destinatario){
        this.destinatario = destinatario;
    }

    @Override
    public void showMessage() {
        System.out.println("Parabéns " + destinatario + ", ");
        System.out.println("que este aniversário traga muita alegria e realizações para você!"); 
    }
}