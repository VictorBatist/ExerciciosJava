package model;

public class Item {

    private int codigo;
    private Produto produto;
    private double quantidade;

    public Item(int codigo, Produto produto, double quantidade) {
        this.codigo = codigo;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public double getSubtotal(){
        double valorProduto = produto.getPreco() * quantidade;
        return valorProduto;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
}
