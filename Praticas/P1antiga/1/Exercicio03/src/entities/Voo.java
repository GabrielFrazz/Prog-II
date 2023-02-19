package entities;

public class Voo {

    public static final Integer NUMEROASSENTOS = 100;
    private Integer numero;
    private String data;
    private Boolean[] assentos;

    public Voo(Integer numero, String data) {
        assentos = new Boolean[NUMEROASSENTOS];
        for (int i = 0; i < assentos.length; i++) {
            assentos[i] = true;
        }
        this.numero = numero;
        this.data = data;
    }

    public Integer getVoo() {
        return numero;
    }

    public Integer proximoLivre() {
        for (int i = 0; i < assentos.length; i++) {
            if (assentos[i] == true) {
                return i + 1;
            }
        }
        return null;
    }

    public Boolean verifica(int numeroCadeira) {
        // returns true -- assento vazio
        // returns false -- assento ocupado
        return assentos[numeroCadeira - 1];
    }

    public Boolean ocupa(int numeroCadeira) {
        if (assentos[numeroCadeira - 1]) {
            assentos[numeroCadeira - 1] = false;
            return true;
        }
        else{
            return false;
        }

    }

    public Integer vagas(){
        int contador = 0;
        for(int i = 0; i < assentos.length; i++){
            if(assentos[i] == true){
                contador++;
            }
        }
        return contador;
    }

    @Override
    public Object clone(){
        Voo v = new Voo(numero, data);
        v.assentos = assentos;
        return v;
    }
}