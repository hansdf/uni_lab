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

    public boolean estaVencido(Data estaVencido) {
        // recebe uma data por parâmetro (objeto do tipo Data) e retorna verdadeiro caso o produto esteja vencido em relação a esta data ou falso caso contrário.
        if (condition:var(boolean)) {
            
            return true;
        } else {
            
            return false;
        }

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
