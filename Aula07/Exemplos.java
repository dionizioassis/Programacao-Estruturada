import java.util.Scanner;

public class Exemplos {
    public static void main(String[] args) {
        /*
        Leia as notas de 5 estudantes. Ao final, mostre a média da turma e quantos estudantes obtiveram nota maior ou igual a 7,0.
        */
        Scanner dados = new Scanner(System.in);
        // double soma = 0;
        // int aprovados = 0;
        // for (int i = 0; i < 5; i++){
        //     System.out.print("Digite a nota " + (i + 1) + " :");
        //     double nota = dados.nextDouble();
        //     soma += nota;
        //     //soma = soma + nota;
        //     if (nota > 7){
        //         aprovados ++;
        //     }
        // }
        // double media = soma/5;
        // System.out.printf("A média da turma é: %.2f", media);
        // System.out.printf("O total de aprovados é: %d", aprovados);

        /*
        Leia uma nota e só aceite o valor quando estiver entre 0 e 10. Enquanto a entrada for inválida, solicite novamente.
        */
        // System.out.print("Digite a nota: ");
        // double nota = dados.nextDouble();
        // while ((nota < 0) || (nota > 10)) {
        //     System.out.print("Nota inválida, digite novamente: ");
        //     nota = dados.nextDouble();
        // }
        // System.out.println("Nota validada com sucesso!");

        /*
        Crie um menu que seja exibido ao menos uma vez: 1) soma de 1 até N; 2) tabuada de N; 0) sair. O menu deve reaparecer até a opção 0.
        */
        int N = 5;
        int opcao = 0;

        do{
            System.out.println("1 - Somar de 1 até N");
            System.out.println("2 - Tabuada de N");
            System.out.println("0 - Sair");
            opcao = dados.nextInt();

            switch (opcao) {
                case 1:
                    int soma = 0;
                    for(int i = 1;i <= N; i++){
                        soma = soma + i;
                        //soma +=i;
                    }
                    System.out.printf("O valor da soma de 1 até %d é %d %n",N,soma);
                    break;
                case 2:
                    
                    break;
                default:
                    break;
            }
        }while(opcao != 0);




        dados.close();
    }
}
