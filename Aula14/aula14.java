public class aula14 {

    static class Aluno {
    int matricula;
    double nota1;
    double nota2;
    boolean ativo;
    }

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[3];

        alunos[0] = new Aluno();
        alunos[0].matricula = 102;
        alunos[0].nota1 = 8;
        alunos[0].nota2 = 7;
        alunos[0].ativo = true;

        alunos[1] = new Aluno();
        alunos[1].matricula = 102;
        alunos[1].nota1 = 8;
        alunos[1].nota2 = 7;
        alunos[1].ativo = true;

        alunos[2] = new Aluno();
        alunos[2].matricula = 102;
        alunos[2].nota1 = 8;
        alunos[2].nota2 = 7;
        alunos[2].ativo = true;

        double maiorMedia = -1;
        int matriculaMaior = -1;

        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].ativo == true){
                double media = (alunos[i].nota1 + alunos[i].nota2)/2;
                if (media > maiorMedia) {
                    maiorMedia = media;
                    matriculaMaior = alunos[i].matricula;
                }
            }
        }
    }

}
