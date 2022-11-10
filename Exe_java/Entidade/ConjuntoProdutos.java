package Exe_java.Entidade;

import java.util.ArrayList;

public class ConjuntoProdutos {
    private String conjunto;
    ArrayList<Produto> listaProd;

    public ConjuntoProdutos() {
        listaProd = new ArrayList<Produto>();
    }

    public ConjuntoProdutos(String conjunto, ArrayList<Produto> listaProd) {
        this.conjunto = conjunto;
        this.listaProd = listaProd;
        listaProd = new ArrayList<Produto>();
    }

    public String getConjunto() {
        return conjunto;
    }

    public void setConjunto(String conjunto) {
        this.conjunto = conjunto;
    }

    public ArrayList<Produto> getListaProd() {
        return listaProd;
    }

    public void setListaProd(ArrayList<Produto> listaProd) {
        this.listaProd = listaProd;
    }

    public void addProduto(Produto prod) {
        prod.setConjProd(this);
        listaProd.add(prod);
    }

}
