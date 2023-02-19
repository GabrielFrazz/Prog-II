package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CriaTxt extends Out {

    Scanner sc = new Scanner(System.in);

    @Override
    public void flush(Form[] forms) throws IOException  {

        System.out.print("digite o diretório em que deseja salvar o arquivo: ");
        String path = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            int i = 1;
            for(Form f : forms){
                bw.write("Formulário#"+ i);
                bw.newLine();
                bw.write(f.getForm());
                bw.newLine();
                bw.newLine();
                i++;
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        sc.close();
    }

    
}