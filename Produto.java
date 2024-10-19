package uni_lab;

public class Produto {
    String nome;
    int preco;
    Data dataValidade;

    public Produto(String nome, int preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataAtual) {
        // Comparação de ano
        if (dataAtual.getAno() > dataValidade.getAno()) {
            return true;
        } else if (dataAtual.getAno() < dataValidade.getAno()) {
            return false;
        }
        
        // Se o ano for o mesmo, comparar o mês
        if (dataAtual.getMes() > dataValidade.getMes()) {
            return true;
        } else if (dataAtual.getMes() < dataValidade.getMes()) {
            return false;
        }
    
        // Se o mês for o mesmo, comparar o dia
        return dataAtual.getDia() > dataValidade.getDia();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Produto: " + nome + " custa " + preco + " reais.";
    }


}
