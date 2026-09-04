import java.util.Scanner;
public class aula10 {
    // Função com retorno e parâmetros
    public static float calcularMedia(double notas[]){
        float media = 0;
        float soma = 0;
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        media = soma/notas.length;
        return media;
    }
    public static void darUmPonto(double notas[]){
        for(int i = 0; i < notas.length; i++){
            notas[i] += 1;
        }
    }

    // Função sem retorno e sem parâmetros
    public static void mostrarCabecalho(){
        System.out.println("===== Sistema de notas ====");
    }
    // Funções sem retorno e com parâmetros
    public static void mostrarSituacao(float media){
        if (media >= 5) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        mostrarCabecalho();

        double notas[] = {8.5,6.0,9.0,7,5};

        float media = calcularMedia(notas);
        System.out.printf("A média é: %.2f %n",media);
        mostrarSituacao(media);

        for(int i = 0; i < notas.length ; i++){
            System.out.printf("nota [%d] = %.2f %n",i,notas[i]);
        }
        darUmPonto(notas);
        for(int i = 0; i < notas.length ; i++){
            System.out.printf("nota [%d] = %.2f %n",i,notas[i]);
        }
        dados.close();
    }
}