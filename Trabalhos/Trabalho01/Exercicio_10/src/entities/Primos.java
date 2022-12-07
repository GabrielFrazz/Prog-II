package entities;

public class Primos {

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int contaFatores(){
        int conta = 0, div = 2;
        int aux = num;

        do{
            if(aux%div == 0){
                aux = aux/div;
                conta++;
            }
            else{
                div++;
            }

        }while(div != num);

        return conta;
    }

    public int[] arrayFatoresPrimos(){
        int tam = contaFatores();
        int div = 2, aux = num;

        int[] vet = new int[tam];

        int i = 0;

        do{
            if(aux%div == 0){
                aux = aux/div;
                vet[i] = div;
                i++;
            }
            else{
                div++;
                if(div == num){
                    vet[i] = div;
                    i++;
                }
            }
        }while(i < tam);

        return vet;
    }
}