package application;

import entities.Account;
import entities.AccountException;

public class App {
    public static void main(String[] args) throws Exception {

        Account myAccount = new Account();

        myAccount.deposita(100);
        myAccount.setLimite(100);
        try{
            myAccount.saca(1000);
        }catch(AccountException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println(e.getBalance());
        }finally{
            System.out.println(myAccount.getBalance());
        }

        //agora a classe AccountException também tem o atributo saldo
        //bloco finally adicionado, retorna o saldo da conta
    }
}
