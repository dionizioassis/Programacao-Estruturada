package Aula12;

import java.util.Scanner;
public class aula12 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        // String nome = "Maria da Silva";
        // char letra = 'M';
        // StringBuffer texto = new StringBuffer("Um novo texto");

        // // nome = dados.nextLine();
        // System.out.println(nome);
        // System.out.println(nome.length());
        // System.out.println(nome.charAt(2));
        // System.out.println(nome.substring(9,nome.length()));
        // System.out.println(nome.indexOf("Maria"));

        // Crieum programaem JAVA que conte quantas vogais e quantas não vogais tem em uma frase digitada pelo teclado.

        // System.out.print("Digite uma frase: ");
        // String frase = dados.nextLine();
        // int vogais = 0;
        // int notVogais = 0;
        // String fraseNorm = frase;
        // fraseNorm = fraseNorm.toLowerCase();

        // for(int i = 0; i < fraseNorm.length();i++){
        //     char letra = fraseNorm.charAt(i);
        //     if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
        //         vogais = vogais + 1;
        //         //vogais++;
        //         //vogais += 1;
        //     }else{
        //         notVogais += 1;
        //     }
        // }
        // System.out.printf("O texto tem %d vogais %n",vogais);
        // System.out.printf("O texto tem %d não vogais %n",notVogais);

        // Trabalhando com o método split
        // String frase = "Maria da Silva;12345678987;(85)985554422";
        // String[] palavras = frase.split(";");

        // for(int i = 0; i < palavras.length; i++){
        //     System.out.println(palavras[i]);
        // }

        //Trabalhando com o StringBuffer

        // StringBuffer texto = new StringBuffer("Java");
        // texto.append(" Estruturado");
        // texto.insert(0, "Curso: ");
        // texto.delete(0, 7);

        // System.out.println(texto);

        /*
        Receba uma frase pelo teclado e mostre:
        • a frase sem espaços no início e no fim;
        • a quantidade de caracteres;
        • a frase em maiúsculas;
        • a quantidade de vogais;
        • cada palavra em uma linha separada.
            trim()
            length()
            toUpperCase()
            charAt(i)
            split(" ")
        */
    }
}
