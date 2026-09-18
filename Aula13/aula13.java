package Aula13;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
public class aula13 {
    public static void main(String[] args) {
        File arquivo = new File("dados.txt");
        try {
            //Escrever dados no arquivo
            FileWriter escritor = new FileWriter("dados.txt",true);
            Scanner entrada = new Scanner(System.in);
            System.out.print("Digite o seu nome: ");
            String nomeIn = entrada.next();
            System.out.print("Digite a sua idade: ");
            String idadeIn = entrada.next();
            System.out.print("Digite o seu cpf: ");
            String cpfIn = entrada.next();
            escritor.write(nomeIn+";"+idadeIn+";"+cpfIn+"\n");

            entrada.close();
            escritor.close();
            //Ler caracteres
            // FileReader leitor = new FileReader("dados.txt");
            // int valor = 0;
            // while ((valor = leitor.read()) != -1) {
            //     char caractere = (char) valor;
            //     System.out.print(caractere);
            // }
            // leitor.close();
            //Ler linhas completas
            FileReader dados = new FileReader("dados.txt");
            BufferedReader leitorLinha = new BufferedReader(dados);
            String linha;
            while ((linha = leitorLinha.readLine()) != null ) {
                String[] pessoa = linha.split(";");
                String nome = pessoa[0];
                int idade = Integer.parseInt(pessoa[1]);
                String cpf = pessoa[2];
                System.out.printf("Olá %s vejo que você tem %d anos de idade e seu CPF eh %s%n", nome,idade, cpf);
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
