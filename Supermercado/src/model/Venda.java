package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Venda {

    private Item[] itens;
    private LocalDateTime dataHora;
    private int quantidadeItens;

    public Venda(Item[] itens, LocalDateTime dataHora) {
        this.itens = itens;
        this.dataHora = dataHora;
    }

    public Venda(){
        itens = new Item[3];
        dataHora = LocalDateTime.now();
        quantidadeItens = 0;
    }

    public double getTotal(){
        double total = 0;
        for(int i=0; i<quantidadeItens;i++) {
            total += itens[i].getSubtotal();
        }
        return total;
    }

    public boolean adicionarItem(Item item){
        //aumenta o tamanho do array criando uma copia do original;
        if(quantidadeItens == itens.length){
            itens = Arrays.copyOf(itens,itens.length+3);
        }
        itens[quantidadeItens++] = item;
        return true;
    }

    public Item[] getItens() {
        return itens;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
}


