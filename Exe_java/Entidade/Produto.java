package Exe_java.Entidade;

public class Produto {
    private int codigo;
    private String nome;
    private float valor;
    private Fornecedor fornecedor;

    public Produto(int codigo, String nome, float valor, Fornecedor fornecedor) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

    public float atualizaPreco(Float porcentagem) {
        this.valor = this.valor + (this.valor * (porcentagem / 100));
        return this.valor;
    }

    /*
     * private void atualizarPreco(float valorPercentual) {
     * float percentual = valorPercentual / 100;
     * float valorFinal = this.getValor() + (percentual * this.getValor());
     * this.setValor(valorFinal);
     * }
     */

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

}