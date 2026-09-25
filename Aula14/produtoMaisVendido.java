public static int produtoMaisVendido(int[][] vendas){
    int maiorTotal = 0;
    int indiceProdutoMaisVendido = 0;
    for(int coluna = 0; coluna < vendas[0].length; coluna++){
        int total = 0;
        for(int linha = 0; linha < vendas.length;linha++){
            total += vendas[linha][coluna];
        }
        if (total > maiorTotal) {
            maiorTotal = total;
            indiceProdutoMaisVendido = coluna;
        }
    }
    return indiceProdutoMaisVendido;
}