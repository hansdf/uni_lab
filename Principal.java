package uni_lab;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /* 
        Endereco SAP = new Endereco("AvSAP", "SaoLeo", "RioGrandeDoSul", "Brasil", "9000000", "188", "SAPLabsLA");
        System.out.println(SAP.toString());
        Data validadeYogurt = new Data(20, 10, 2025);
        Data validadeVencida = new Data(5, 10, 2020);
        Object fone = new Produto("Fone Senheiser", 500, validadeYogurt);
        System.out.println(fone.toString());
        Produto mouse = new Produto("Mouse Logitech", 350, validadeYogurt);
        System.out.println(mouse.toString());
        Loja Amazon = new Loja("Amazon", 5000, 1500, SAP, validadeYogurt);
        System.out.println(Amazon.getQuantidadeFuncionarios());
        // Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        // System.out.println("Enter username");
        // String userName = myObj.nextLine();  // Read user input
        // System.out.println("Username is: " + userName);  // Output user input
        System.out.println(mouse.estaVencido(validadeVencida));
        int custosSalarioMensal = Amazon.gastosComSalario();
        System.out.println("Amazon gasta mensalmente " + custosSalarioMensal + " reais para pagar todos funcionários.");
        Data hoje = new Data(19, 10, 2024);
        System.out.println("Hoje é dia " + hoje.toString());
        */

        int escolhaMenu = 0;
        Scanner menuScanner = new Scanner(System.in);

        while (escolhaMenu != 3) {
            System.out.println("Escolha como proseguir:");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            
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

                // Criar a loja
                Loja loja = new Loja(nomeLoja, qtdFuncionarios, salarioBase, enderecoLoja, dataFundacao);
                System.out.println("Loja criada: " + loja);
            }

            if (escolhaMenu == 2) {
                // Criar um produto (mesma lógica anterior)
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


