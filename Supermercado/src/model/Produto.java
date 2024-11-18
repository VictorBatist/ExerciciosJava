package model;

public class Produto {

    private int codigo;
    private String descricao;
    /*
    Usand como metodo de pacote ou default
    duble preco;
     */
    private double preco;
    private Categoria categoria;

    public Produto(int codigo, String descricao, double preco,Categoria categoria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;

    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
