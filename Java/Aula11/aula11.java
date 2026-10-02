package Aula11;

import java.util.Scanner;
public class aula11 {
    // Registros
    public static class Aluno {
        String nome;
        int idade;
        String matricula;
    }
    public static void main(String[] args) {
        Aluno[] turma = new Aluno[3];
        Scanner dados = new Scanner(System.in);

        // Crie um for para receber os dados do registro pelo teclado

        for(int i = 0; i < turma.length; i++){
            turma[i] = new Aluno();
            System.out.printf("Digite o nome do Aluno %d: ",i+1);
            turma[i].nome = dados.next();
            System.out.printf("Digite a idade do Aluno %d: ",i+1);
            turma[i].idade = dados.nextInt();
            System.out.printf("Digite a Matrícula do Aluno %d: ",i+1);
            turma[i].matricula = dados.next();

        }
        for(int i = 0; i < 3; i++){
            System.out.printf("Nome: %s %n",turma[i].nome);
            System.out.printf("idade: %s %n",turma[i].idade);
            System.out.printf("Matrícula: %s %n%n",turma[i].matricula);
        }

    }
}
 /*
           Desenvolva um programa em Java que simule um sistema bancário simples. O cliente inicia com saldo de R$ 1.000,00 e o sistema deve apresentar repetidamente o seguinte menu:

           Faça o cadastro dos clientes em um registro que represente cada cliente do banco. Esse registro deverá ter o nome, a agência, a conta e o valor do saldo de cada cliente. Inicie com 2 clientes incialmente.
           
            ===== BANCO Bubank  =====
            1 - Consultar saldo
            2 - Realizar depósito
            3 - Realizar saque
            4 - Exibir extrato
            5 - Mostrar maior depósito
            0 - Sair
            Escolha uma opção:

            Considere as seguintes regras:
                •	Consultar saldo: apresentar o saldo atual da conta. 
                •	Realizar depósito: solicitar um valor positivo, adicioná-lo ao saldo e registrar a operação. 
                •	Realizar saque: solicitar um valor positivo. O saque somente poderá ser realizado se houver saldo suficiente. Após o saque, a operação deverá ser registrada. 
                •	Exibir extrato: apresentar todas as movimentações realizadas durante a execução do programa. 
                •	Mostrar maior depósito: percorrer as movimentações armazenadas e apresentar o maior depósito realizado. 
                •	Sair: encerrar o programa. 
                •	Qualquer opção diferente das disponíveis deverá apresentar a mensagem "Opção inválida".

        
        */
