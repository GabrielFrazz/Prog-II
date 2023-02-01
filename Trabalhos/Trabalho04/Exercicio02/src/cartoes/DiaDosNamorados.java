package cartoes;

public class DiaDosNamorados extends CartaoWeb{
    
    public DiaDosNamorados(String destinatario){
        this.destinatario = destinatario;
    }

    @Override
    public void showMessage() {
        System.out.println("Querido(a) " + destinatario + ", ");
        System.out.println("amo você incondicionalmente. Feliz dia dos namorados! Juntos para sempre."); 
    }
}