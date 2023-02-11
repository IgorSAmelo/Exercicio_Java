package Exe_java.Entidade;

public class TesteProduto {

    public static void main(String[] args) {
        Fornecedor forn1 = new Fornecedor("1234321", "Zé Maria");
        Fornecedor forn2 = new Fornecedor("543212345", "Cláudio");

        Produto produto1 = new Produto(1, "TV LCD", 3500, forn1);
        Produto produto2 = new Produto(2, "notebook", 2000, forn2);
        Produto produto3 = new Produto(3, "impressora", 232, forn2);
        Produto produto4 = new Produto(4, "Som", 552, forn2);

        ConjuntoProdutos conjuntoProdutos = new ConjuntoProdutos();
        conjuntoProdutos.inserirProduto(produto1);
        conjuntoProdutos.inserirProduto(produto2);
        conjuntoProdutos.inserirProduto(produto3);
        conjuntoProdutos.inserirProduto(produto4);
        conjuntoProdutos.inserirProduto(produto1);
        conjuntoProdutos.removerProduto(produto2);
        produto2.setValor(8000);
        conjuntoProdutos.atualizarProduto(produto2);
        conjuntoProdutos.atualizarPreco(produto1, 20);
        conjuntoProdutos.mostrarProdutos();
    }
}
