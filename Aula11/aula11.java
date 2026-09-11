package Aula11;

public class aula11 {
    // Registros
    public static class Aluno {
        String nome;
        int idade;
        String matricula;
    }
    public static void main(String[] args) {
        // Aluno aluno1 = new Aluno();

        // aluno1.nome = "joao";
        // aluno1.idade = 20;
        // aluno1.matricula = "1234";

        // System.out.print("nome: "+ aluno1.nome + "\n");
        // System.out.print("idade: "+ aluno1.idade+ "\n");
        // System.out.print("matrícula "+ aluno1.matricula+ "\n");

        Aluno[] turma = new Aluno[3];

        // Crie um for para receber os dados do registro pelo teclado

        turma[0] = new Aluno();
        turma[0].nome = "Maria";
        turma[0].idade = 20;
        turma[0].matricula = "1234";

        turma[1] = new Aluno();
        turma[1].nome = "João";
        turma[1].idade = 21;
        turma[1].matricula = "1235";

        turma[2] = new Aluno();
        turma[2].nome = "Mateus";
        turma[2].idade = 22;
        turma[2].matricula = "1236";

        for(int i = 0; i < 3; i++){
            System.out.printf("Nome: %s %n",turma[i].nome);
            System.out.printf("idade: %s %n",turma[i].idade);
            System.out.printf("Matrícula: %s %n%n",turma[i].matricula);
        }

    }

}
