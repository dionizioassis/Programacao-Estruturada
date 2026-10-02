import java.util.Scanner;

public class aula08{
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        //Criação de um vetor para armazenar 5 notas
        float notas[];
        notas = new float[5];
        // Preencher o vetor
        for(int i = 0;i < 5; i++){
            System.out.printf("Digite a nota do aluno %d: ",(i+1));
            notas[i] = dados.nextFloat();
        }
        // Exibindo o vetor
        for(int i = 0; i < 5; i++){
            System.out.printf("Aluno %d: %.1f %n",(i+1),notas[i]);
        }
        // Calcular a média dos alunos com o for-each
        float soma = 0;
        float media = 0;

        for(float nota : notas){
            soma += nota;
            System.out.println(soma);
        }
        
        
    }

}