package Aula05;
import java.util.Scanner;

public class ExemploConstantes {

    public static final double PI = 3.14159;
    
    // public static void main(String[] args) {

    //     final int LIMITE_MAXIMO = 100;
    //     System.out.println("Valor de PI: " + PI);
    //     System.out.println("Limite: " + LIMITE_MAXIMO);
    //     // LIMITE_MAXIMO = 5;
    //     // System.out.println("Limite: " + LIMITE_MAXIMO);

    // }

    // public static void outroMetodo() {
    //     System.out.println("Acessando PI em outro método: " + PI);
    //     // System.out.print(LIMITE_MAXIMO);
    // }

    // Crie um programa que receba o nome e a idade de um usuário e mostre uma mensagem de boas vindas.
    public static void main(String[] args) {
        Scanner dado = new Scanner((System.in));
        String nome;
        int idade;
        System.out.print("Digite seu nome: ");
        nome = dado.nextLine();
        System.out.print("Digite sua idade: ");
        idade = dado.nextInt();

        System.out.printf(
            "Seja bem-vindo, %s! Você tem %d anos de idade",
            nome,idade
        );
        dado.close();
    }
}
/*
Faça um programa em Java que receba o nome de um produto, sua quantidade e seu preço unitário. Em seguida, mostre os dados no seguinte formato:

Produto: Teclado | Quantidade: 2 | Preço unitário: R$ 149.90

O preço deve ser exibido com exatamente duas casas decimais.
*/
