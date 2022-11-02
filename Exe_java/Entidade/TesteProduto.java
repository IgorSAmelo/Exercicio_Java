package Exe_java.Entidade;

import Exe_java.Entidade.Produto;
import Exe_java.Entidade.Fornecedor;

public class TesteProduto {

    public static void main(String[] args) {
        Fornecedor forn1 = new Fornecedor("1234321", "978787887", "Zé Maria");

        Fornecedor forn2 = new Fornecedor("543212345", "8132314545", "Cláudio");

        Produto prod1 = new Produto
        (1,"TV LCD",3500,forn1);

        Produto prod2 = new Produto
        (2,"notebook",2000, forn2);

        Produto prod3 = new Produto
        (3, "impressora", 232, forn2);


        System.out.println(args[0]);
        System.out.println(args[1]);
    }

}
