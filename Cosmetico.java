package uni_lab;

public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) { this.taxaComercializacao = taxaComercializacao; }
    public double getTaxaComercializacao() { return taxaComercializacao; }

    @Override
    public String toString() {
        return super.toString() + " - Taxa de Comercialização: " + taxaComercializacao;
    }
}
