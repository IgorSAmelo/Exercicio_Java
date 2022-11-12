package Exe_java.Entidade;

import java.util.ArrayList;

public class ConjuntoProdutos {

    private ArrayList<Produto> listaProd;

    public ConjuntoProdutos() {
    }

    public ConjuntoProdutos(ArrayList<Produto> listaProd) {
        this.listaProd = listaProd;
    }

    public ArrayList<Produto> getListaProd() {
        return listaProd;
    }

    public void setListaProd(ArrayList<Produto> listaProd) {
        this.listaProd = listaProd;
    }

    //inserir produto
    public boolean inserirProduto(Produto novoProd) {
        return this.listaProd.add (novoProd);   
    }

    /*public Produto buscaProduto(Int codigo){
        for (Produto produto : listaProd) {
            if(produto().equals ()
        }
        return null;
    }*/


}

/*
 * public ConjuntoProdutos() {
 * listaProd = new ArrayList<Produto>();
 * }
 * 
 * public ConjuntoProdutos( ArrayList<Produto> listaProd) {
 * 
 * this.listaProd = listaProd;
 * listaProd = new ArrayList<Produto>();
 * }
 * 
 * 
 * public ArrayList<Produto> getListaProd() {
 * return listaProd;
 * }
 * 
 * public void setListaProd(ArrayList<Produto> listaProd) {
 * this.listaProd = listaProd;
 * }
 */
