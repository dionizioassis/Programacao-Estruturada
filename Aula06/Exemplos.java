package Aula06;

import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {
        //Uma loja concede 10% de desconto quando o valor da compra é de pelo menos R$ 200. O programa deve ler o valor da compra, aplicar o desconto somente quando a condição for verdadeira e mostrar o desconto e o total final.

        // Scanner dados = new Scanner(System.in);
        // System.out.println("Digite o valor da compra");
        // double valorCompra = dados.nextDouble();
        // double desconto = 0;

        // if (valorCompra >= 200){
        //     desconto = valorCompra * 0.1;
        // }
        // valorCompra = valorCompra - desconto;
        // System.out.print("O valor a ser pago é: " + valorCompra);

        // dados.close();

        //um vendedor recebe comissão de 8% quando atinge R$ 10.000 ou mais em vendas no mês; caso contrário, recebe 4%. O programa lê salário-base e total de vendas, calcula a comissão e mostra o salário final.
        Scanner dados = new Scanner(System.in);
        // System.out.print("Digite o salário base: ");

        // double salarioBase = dados.nextDouble();
        // System.out.print("Digite o total das vendas: ");
        // double totalVendas = dados.nextDouble();

        // if (totalVendas >= 10000.0){
        //     salarioBase += (totalVendas * 0.08);
        // } else {
        //     salarioBase += (totalVendas * 0.04);
        // }
        // System.out.printf("Seu salário será: %.2f", salarioBase);


        //Questão: Escreva um programa em Java que receba como entrada a nota de um aluno (um valor inteiro de 0 a 100) e exiba o seu conceito final de acordo com as seguintes regras:
        // •	Nota maior ou igual a 90: exibe "Conceito: A"
        // •	Nota maior ou igual a 80 e menor que 90: exibe "Conceito: B"
        // •	Nota maior ou igual a 70 e menor que 80: exibe "Conceito: C"
        // •	Nota maior ou igual a 60 e menor que 70: exibe "Conceito: D"
        // •	Nota abaixo de 60: exibe "Conceito: F"

        // System.out.print("Digite a nota do aluno: ");
        // int nota = dados.nextInt();
        // if (nota >= 90){
        //     System.out.println("Conceito: A");
        // }else if(nota >= 80){
        //     System.out.println("Conceito: B");
        // }else if (nota >= 70){
        //     System.out.println("Conceito: D");
        // }else{
        //     System.out.println("Conceito: F");
        // }

        //criar uma mini calculadora que leia dois números e uma opção de menu: 1 para soma, 2 para subtração e 3 para multiplicação. O switch decide qual operação executar.
        // System.out.print("Digite o primeiro Número: ");
        // double n1 = dados.nextDouble();

        // System.out.print("Digite o segundo Número: ");
        // double n2 = dados.nextDouble();

        // System.out.println("Digite a operação desejada \n1 - Soma\n2 - Subtração\n3 - Multiplicação");
        // int operacao = dados.nextInt();

        // switch (operacao) {
        //     case 1:
        //         System.out.println("Soma escolhida.");
        //         double soma = n1 + n2;
        //         System.out.printf("O resultado da soma é: %.2f", soma);
        //         break;
        //     case 2: 
        //         System.out.println("Subtração escolhida.");
        //         double subtracao = n1 - n2;
        //         System.out.printf("O resultado da subtração é: %.2f", subtracao);
        //         break;
        //     case 3: 
        //         System.out.println("Multiplicação escolhida.");
        //         double multiplicacao = n1 * n2;
        //         System.out.printf("O resultado da Multiplicação é: %.2f", multiplicacao);
        //         break;
        //     default:
        //         System.out.println("Operação não reconhecida");
        //         break;
        // }

        // Crie um programa que receba a nota de um aluno e a quantidade de faltas.
        // Se a nota for menor do que 5 ou a quantidade de faltas for maior que 25% mostre reprovado.

        System.out.println("Digite a nota: ");
        double nota = dados.nextDouble();

        System.out.println("Digite a quantidade de faltas: ");
        int faltas = dados.nextInt();

        if (nota < 5 || faltas > 25){
            System.out.println("Reprovado");
        }else{
            System.out.println("Aprovado");
        }

        

        dados.close();
    }

    


}
