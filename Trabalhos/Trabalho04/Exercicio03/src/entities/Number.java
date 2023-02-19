package entities;

public class Number {
    
    private Integer number;

    public Number(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    //analisa se dois objetos do tipo Number são iguais com base no valor numerico
    @Override
    public boolean equals(Object o){
        final Number teste = (Number)o;
        if(teste.getNumber() == this.number){
            return true;
        }
        return false;
    }

    //retorna o hashCode do numero presente na classe
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result * ((this.number == null) ? 0 : number.hashCode());
        return result;
    }

    @Override
    public String toString(){
        return "número: " + number;
    }
}