package Aula06;

import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {
        //Uma loja concede 10% de desconto quando o valor da compra é de pelo menos R$ 200. O programa deve ler o valor da compra, aplicar o desconto somente quando a condição for verdadeira e mostrar o desconto e o total final.
        
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite o valor da compra");
        double valorCompra = dados.nextDouble();
        double desconto = 0;

        if (valorCompra >= 200){
            desconto = valorCompra * 0.1;
        }
        valorCompra = valorCompra - desconto;
        System.out.print("O valor a ser pago é: " + valorCompra);

        dados.close();
    }
}
