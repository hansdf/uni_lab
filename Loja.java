package desafio_java;

public class Loja {
    String nome;
    int quantidadeFuncionarios;
    int salarioBaseFuncionario;

    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(int salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public String toString() {
        return "Loja: " + nome + ", Funcionários: " + quantidadeFuncionarios + 
               ", Salário Base: " + (salarioBaseFuncionario == -1 ? "Não Definido" : salarioBaseFuncionario);
    }

    public int gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P'; 
        } else if (quantidadeFuncionarios <= 30) {
            return 'M'; 
        } else {
            return 'G';
        }
    }
}



