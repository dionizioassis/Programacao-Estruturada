import java.util.Scanner;
public class aula09 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Criando uma matriz");
        int n1 = 3;
        int n2 = 3;
        int matriz1[][];
        matriz1 = new int [n1][n2];
        System.out.printf("A matriz tem o tamanho %d x %d %n",matriz1.length,matriz1[0].length);

        int [][]matriz2 = new int[2][2];
        // for (int i = 0; i < matriz2.length; i++){
        //     for (int j = 0; j < matriz2[i].length; j++){
        //         System.out.printf("Valor [%d]x[%d] = ",(i+1),(j+1));
        //         matriz2[i][j] = dados.nextInt();
        //     }
        // }

        // Criando matrizes hardcode
        int[][] matriz3 = {
            {10,20},
            {30,40}
        };

        //Exibir uma matriz
        for (int i = 0; i < matriz3.length; i++){
            for (int j = 0; j < matriz2[i].length; j++){
                System.out.printf("%d ",matriz3[i][j]);
                if (j == (matriz3[i].length-1)) {
                    System.out.print("\n");
                }
            }
        }


        // char [][]matriz3 = new char[2][2];
        // for (int i = 0; i < matriz3.length; i++){
        //     for (int j = 0; j < matriz3[i].length; j++){
        //         System.out.printf("Valor [%d]x[%d] = ",(i+1),(j+1));
        //         matriz3[i][j] = dados.next().charAt(0);
        //     }
        // }

        /*
        Desenvolva um programa em java que solicite ao usuário o número de linhas e colunas de duas matrizes de números inteiros. Em seguida, o programa deverá solicitar que o usuário as preencha. Depois disso o programa deverá verificar se é possível realizar a soma dessas matrizes, se for possível mostrar a matriz resultante da soma.
        */
        // Primeira Matriz
        System.out.println("Digite o número de linhas da primeira matriz");
        int linhas1 = dados.nextInt();

        System.out.println("Digite o número de colunas da primeira matriz");
        int colunas1 = dados.nextInt();

        int mat1[][];
        mat1 = new int[linhas1][colunas1];

        for (int i = 0; i < mat1.length; i++){
            for (int j = 0; j < mat1[i].length; j++){
                System.out.printf("Valor [%d]x[%d] = ",(i+1),(j+1));
                mat1[i][j] = dados.nextInt();
            }
        }

        // Segunda Matriz
        System.out.println("Digite o número de linhas da segunda matriz");
        int linhas2 = dados.nextInt();

        System.out.println("Digite o número de colunas da segunda matriz");
        int colunas2 = dados.nextInt();

        int mat2[][];
        mat2 = new int[linhas1][colunas1];

        for (int i = 0; i < mat2.length; i++){
            for (int j = 0; j < mat2[i].length; j++){
                System.out.printf("Valor [%d]x[%d] = ",(i+1),(j+1));
                mat2[i][j] = dados.nextInt();
            }
        }

        if((linhas1 == linhas2) && (colunas1 == colunas2)){
            System.out.println("A soma é");
            
        }else{
            System.out.println("Não é possível fazer a soma");
        }



        dados.close();
    }

}