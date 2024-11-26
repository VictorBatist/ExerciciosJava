package view;

import model.Comissionado;
import model.Funcionario;
import model.Horista;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionarios[] = {
                new Horista("111.111.111-11", "Joao", 80, 50),
                new Horista("222.222.222-22", "Maria", 40, 80),
                new Comissionado("333.333.333-33", "José", 80, 30),
                new Comissionado("444.444.444-44", "Josefa", 90, 50),
        };

        System.out.println("----- Contra-cheque Funcionários -----\n--------- Mês de Novembro ---------\n");

        for(int i=0; i<funcionarios.length; i++){
            System.out.println(funcionarios[i] + " recebe: " + funcionarios[i].calcularPagamento());
        }

        float total = 0;
        for(Funcionario funcionario : funcionarios){
            total = total + funcionario.calcularPagamento();
        }

        System.out.println("\nTotal da folha de pagamento: "+total);
    }
}