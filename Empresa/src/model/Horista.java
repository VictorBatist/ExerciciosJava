package model;

public class Horista extends Funcionario{

    private float horas;
    private float valorHoras;

    public Horista ( String cpf, String nome, float horas, float valorHoras){
        super(cpf, nome);
        this.horas = horas;
        this.valorHoras = valorHoras;
    }

    public float getHoras() {
        return horas;
    }

    public float getValorHoras() {
        return valorHoras;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public void setValorHoras(float valorHoras) {
        this.valorHoras = valorHoras;
    }

    @Override
    public float calcularPagamento() {
        return horas * valorHoras;
    }
}
