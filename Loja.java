package uni_lab;

public class Loja {
    String nome;
    int quantidadeFuncionarios;
    int salarioBaseFuncionario;
    Endereco enderecoLoja;
    Data dataFundacao;
    Produto[] estoqueProdutos;


    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, Produto[] estoqueProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = estoqueProdutos;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
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

    @Override
    public String toString() {
        return "Loja: " + nome +
               "\nQuantidade de Funcionários: " + quantidadeFuncionarios +
               "\nSalário Base dos Funcionários: " + salarioBaseFuncionario +
               "\nEndereço: " + enderecoLoja +
               "\nData de Fundação: " + dataFundacao;
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



