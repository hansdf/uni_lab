package uni_lab;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int escolhaMenu = 0;
        Scanner menuScanner = new Scanner(System.in);

        while (escolhaMenu != 3) {
            System.out.println("Escolha como prosseguir:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            
            escolhaMenu = menuScanner.nextInt();

            if (escolhaMenu == 1) {
                // Criar uma loja
                System.out.print("Digite o nome da loja: ");
                String nomeLoja = menuScanner.next();
                
                System.out.print("Digite a quantidade de funcionários: ");
                int qtdFuncionarios = menuScanner.nextInt();
                
                System.out.print("Digite o salário base dos funcionários: ");
                int salarioBase = menuScanner.nextInt();
                
                // Entrada de endereço
                System.out.println("Digite o endereço da loja:");
                System.out.print("Nome da rua: ");
                String nomeRua = menuScanner.next();
                
                System.out.print("Cidade: ");
                String cidade = menuScanner.next();
                
                System.out.print("Estado: ");
                String estado = menuScanner.next();
                
                System.out.print("País: ");
                String pais = menuScanner.next();
                
                System.out.print("CEP: ");
                String cep = menuScanner.next();
                
                System.out.print("Número: ");
                String numero = menuScanner.next();
                
                System.out.print("Complemento: ");
                String complemento = menuScanner.next();

                // Criar o endereço da loja
                Endereco enderecoLoja = new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);
                
                // Entrada para a data de fundação da loja
                System.out.println("Digite a data de fundação da loja:");
                
                System.out.print("Dia: ");
                int diaFundacao = menuScanner.nextInt();
                
                System.out.print("Mês: ");
                int mesFundacao = menuScanner.nextInt();
                
                System.out.print("Ano: ");
                int anoFundacao = menuScanner.nextInt();
                
                // Criar a data de fundação
                Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);

                // Definir o tamanho do estoque
                System.out.print("Digite a quantidade máxima de produtos no estoque: ");
                int tamanhoEstoque = menuScanner.nextInt();

                // Criar a loja
                Loja loja = new Loja(nomeLoja, qtdFuncionarios, salarioBase, enderecoLoja, dataFundacao, tamanhoEstoque);
                System.out.println("Loja criada: " + loja);
            }

            if (escolhaMenu == 2) {
                // Criar um produto 
                System.out.print("Digite o nome do produto: ");
                String nomeProduto = menuScanner.next();
                
                System.out.print("Digite o preço do produto: ");
                int precoProduto = menuScanner.nextInt();
                
                // Entrada para a data de validade
                System.out.print("Digite o dia de validade: ");
                int diaValidade = menuScanner.nextInt();
                
                System.out.print("Digite o mês de validade: ");
                int mesValidade = menuScanner.nextInt();
                
                System.out.print("Digite o ano de validade: ");
                int anoValidade = menuScanner.nextInt();

                // Criando a data de validade
                Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);
                
                // Criando o produto
                Produto produto = new Produto(nomeProduto, precoProduto, dataValidade);
                System.out.println("Produto criado: " + produto);
            }

            if (escolhaMenu == 3) {
                System.out.println("Saindo...");
                break;
            }

            if (escolhaMenu > 3 || escolhaMenu < 1) {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        menuScanner.close();
    }
}
