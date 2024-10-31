package uni_lab;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;
    private Endereco enderecoLoja;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco enderecoLoja, Data dataFundacao, int tamanhoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.enderecoLoja = enderecoLoja;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque]; // Inicializa o array com o tamanho especificado
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco enderecoLoja, Data dataFundacao, int tamanhoEstoque) {
        this(nome, quantidadeFuncionarios, -1, enderecoLoja, dataFundacao, tamanhoEstoque); // Chama o construtor principal com salário base -1
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

    public Endereco getEnderecoLoja() {
        return enderecoLoja;
    }

    public void setEnderecoLoja(Endereco enderecoLoja) {
        this.enderecoLoja = enderecoLoja;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
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