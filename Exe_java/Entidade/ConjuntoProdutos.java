package Exe_java.Entidade;

import java.util.ArrayList;

public class ConjuntoProdutos {

    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void inserirProduto(Produto produto) {
        boolean existe = false;
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo() == produto.getCodigo()) {
                existe = true;
            }
        }
        if (existe == false) {
            produtos.add(produto);
        }
    }

    public void removerProduto(Produto produto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo() == produto.getCodigo()) {
                produtos.remove(i);
            }
        }
    }

    public void mostrarProdutos() {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println("Código: " + produtos.get(i).getCodigo());
            System.out.println("Nome: " + produtos.get(i).getNome());
            System.out.println("Valor: " + produtos.get(i).getValor());
            System.out.println("Nome Fornecedor: " + produtos.get(i).getFornecedor().getNome());
            System.out.println("------------------------------------");
        }
    }

    public void atualizarProduto(Produto produto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo() == produto.getCodigo()) {
                produtos.get(i).setNome(produto.getNome());
                produtos.get(i).setValor(produto.getValor());
                produtos.get(i).setFornecedor(produto.getFornecedor());
            }
        }
    }

    public void atualizarPreco(Produto produto, float valorPercentual) {
        float percentual = valorPercentual / 100;
        float valorFinal = produto.getValor() + (percentual * produto.getValor());
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo() == produto.getCodigo()) {
                produtos.get(i).setValor(valorFinal);
            }
        }
    }

}