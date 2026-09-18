package Aula13;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class aula13 {
    public static void main(String[] args) {
        File arquivo = new File("dados.txt");
        try {
            //Escrever dados no arquivo
            FileWriter escritor = new FileWriter("dados.txt",true);
            escritor.write("Olá turma\n");
            escritor.write("Aula 13 de programação estruturada\n");
            escritor.close();
            //Ler caracteres
            FileReader leitor = new FileReader("dados.txt");
            int valor = 0;
            while ((valor = leitor.read()) != -1) {
                char caractere = (char) valor;
                System.out.print(caractere);
            }
            leitor.close();
            //Ler linhas completas
            FileReader dados = new FileReader("dados.txt");
            BufferedReader leitorLinha = new BufferedReader(dados);
            String linha;
            while ((linha = leitorLinha.readLine()) != null ) {
                System.out.println(linha);
            }
            leitorLinha.close();
            dados.close();
            // if (arquivo.createNewFile()) {
            //     System.out.println("Arquivo Criado com Sucesso!");

            // }else{
            //     System.out.println("Arquivo já existe");
            // }
            
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo");
        }
        
    }
}
