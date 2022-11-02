package Exe_java.Entidade;

public class Produto {
    private int codigo;
    private String nome;
    private float valor;
    private Fornecedor fornecedor;

    public Produto() {
    }

    public Produto(int codigo, String nome, float valor, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.fornecedor = fornecedor;
    }

    public boolean atualizarPreco(float valorPro, float acrescimo) {
        acrescimo = valorPro / 100;
        if (valorPro > 0) {
            valorPro += (valorPro * acrescimo);
            return true;
        } else {
            return false;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
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
