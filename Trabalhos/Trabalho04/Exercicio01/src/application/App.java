package application;

import java.util.Scanner;

import entities.Container;
import entities.CriaTxt;
import entities.Form;
import entities.Imprime;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Form[] forms = new Form[3];
    
        System.out.println("entre com as informações dos forms: ");

        
        for (int i = 0 ; i< forms.length; i++){
            System.out.println("-----formulario #" + i+1 + "-----");
            System.out.print("digite aqui: ");
            String conteudo = sc.nextLine();
            forms[i] = new Form(conteudo);
            System.out.println();
           
        }

        Container container = new Container(forms);

        System.out.println("deseja: " + "\n" + "*imprimir os conteúdos dos forms - press 1" + "\n" + "*criar um arquivo de texto - press 0");
        int choice = sc.nextInt();

        System.out.println();
        if(choice == 1){
            Imprime imprime = new Imprime();
            container.print(imprime);
        }

        else if(choice == 0){
            CriaTxt cria = new CriaTxt();
            container.print(cria);
        }

        sc.close();
    }
}
