public class funcoes {
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
}
