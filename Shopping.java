package uni_lab;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int maxLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[maxLojas];
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    // Método toString para exibir as informações do shopping
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping: ").append(nome)
          .append("\nEndereço: ").append(endereco)
          .append("\nLojas: \n");
        for (Loja loja : lojas) {
            if (loja != null) {
                sb.append(loja).append("\n");
            }
        }
        return sb.toString();
    }

    // Método para inserir uma loja no shopping
    public boolean insereLoja(Loja novaLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = novaLoja;
                return true;
            }
        }
        return false; // Array está cheio, não há espaço para inserir nova loja
    }

    // Método para remover uma loja pelo nome
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false; // Loja com o nome especificado não encontrada
    }

    // Método para contar lojas por tipo
    public int quantidadeLojasPorTipo(String tipoLoja) {
        int contador = 0;
        for (Loja loja : lojas) {
            if (loja != null) {
                if (tipoLoja.equalsIgnoreCase("Cosmetico") && loja instanceof Cosmetico) {
                    contador++;
                } else if (tipoLoja.equalsIgnoreCase("Vestuário") && loja instanceof Vestuario) {
                    contador++;
                } else if (tipoLoja.equalsIgnoreCase("Bijuteria") && loja instanceof Bijuteria) {
                    contador++;
                } else if (tipoLoja.equalsIgnoreCase("Alimentação") && loja instanceof Alimentacao) {
                    contador++;
                } else if (tipoLoja.equalsIgnoreCase("Informática") && loja instanceof Informatica) {
                    contador++;
                }
            }
        }
        return (contador > 0) ? contador : -1;
    }

    // Método para encontrar a loja de Informática com o seguro mais caro
    public Informatica lojaSeguroMaisCaro() {
        Informatica maisCaro = null;
        double maiorSeguro = 0;
        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica lojaInformatica = (Informatica) loja;
                if (lojaInformatica.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = lojaInformatica.getSeguroEletronicos();
                    maisCaro = lojaInformatica;
                }
            }
        }
        return maisCaro;
    }
}
