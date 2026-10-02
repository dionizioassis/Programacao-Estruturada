import java.util.Scanner;
public class aula10 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        funcoes.mostrarCabecalho();
        double notas[] = {8.5,6.0,9.0,7,5};
        float media = funcoes.calcularMedia(notas);
        System.out.printf("A média é: %.2f %n",media);
        funcoes.mostrarSituacao(media);

        for(int i = 0; i < notas.length ; i++){
            System.out.printf("nota [%d] = %.2f %n",i,notas[i]);
        }
        funcoes.darUmPonto(notas);
        for(int i = 0; i < notas.length ; i++){
            System.out.printf("nota [%d] = %.2f %n",i,notas[i]);
        }
        dados.close();
    }
}