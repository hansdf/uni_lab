package uni_lab;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public void setNome(String nome) { this.nome = nome; }
    public String getNome() { return nome; }

    public void setPreco(double preco) { this.preco = preco; }
    public double getPreco() { return preco; }

    public void setDataValidade(Data dataValidade) { this.dataValidade = dataValidade; }
    public Data getDataValidade() { return dataValidade; }

    public boolean estaVencido(Data dataAtual) {
        // Check if the product expiration date has passed.
        if (dataAtual.getAno() > dataValidade.getAno()) return true;
        if (dataAtual.getAno() == dataValidade.getAno()) {
            if (dataAtual.getMes() > dataValidade.getMes()) return true;
            if (dataAtual.getMes() == dataValidade.getMes() && dataAtual.getDia() > dataValidade.getDia()) return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return nome + " - " + preco + " - " + dataValidade;
    }
}
