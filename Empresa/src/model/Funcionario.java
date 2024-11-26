package model;

public abstract class Funcionario {

        private String cpf;
        private String nome;

        public Funcionario(String cpf, String nome) {
            this.cpf = cpf;
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public String getNome() {
            return nome;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public abstract float calcularPagamento();

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}