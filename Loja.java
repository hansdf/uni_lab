package uni_lab;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque) {
        this(nome, quantidadeFuncionarios, endereco, dataFundacao, tamanhoEstoque);
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getQuantidadeFuncionarios() { return quantidadeFuncionarios; }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) { this.quantidadeFuncionarios = quantidadeFuncionarios; }

    public double getSalarioBaseFuncionario() { return salarioBaseFuncionario; }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) { this.salarioBaseFuncionario = salarioBaseFuncionario; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    public Data getDataFundacao() { return dataFundacao; }
    public void setDataFundacao(Data dataFundacao) { this.dataFundacao = dataFundacao; }

    public Produto[] getEstoqueProdutos() { return estoqueProdutos; }

    public double gastosComSalario() {
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) return 'P';
        else if (quantidadeFuncionarios <= 30) return 'M';
        else return 'G';
    }

    public boolean insereProduto(Produto p) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = p;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return nome + " - " + endereco + " - Funcionários: " + quantidadeFuncionarios;
    }

    public void imprimeProdutos() {
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto);
            }
        }
    }
}
