package entities;

public class Vetor {
    
    private String[] vect;
    private int size;

    public Object[] getVect() {
        return vect;
    }

    public Vetor(int size) {
        this.size = size;
        vect = new String[this.size];
    }

    public void insert(String value){
        
        int vazio = -1;

        for(int i = 0; i < vect.length; i++){
            if( vect[i] == null){
                vazio = i;
                break;
            }
        }

        if(vazio == -1){
        
            this.size = this.size +1;
            String[] vector = new String[size];
            vector = this.vect;
            instanciaVetor();
            for(int i = 0; i< this.size-1; i++){
                vect[i] = vector[i];
            }
            this.vect[this.size-1] = value;
        }
        else{
            vect[vazio] = value;
        }

    }

    public void takeElementOut(int pos){
        vect[pos] = null;
    }

    public void instanciaVetor(){
        this.vect = new String[size];
    }

    public int retornaTamanho(){
        return vect.length;
    }

}