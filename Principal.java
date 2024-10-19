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
        while (escolhaMenu != 3) {
            System.out.println("Escolha como proseguir:");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            Scanner menuScanner = new Scanner(System.in);
            int input = menuScanner.nextInt();
            escolhaMenu = input;

            if (input == 1) {
                
            }

            if (input == 2) {
                
            }

            if (input == 3) {
                break;
            }

            if (input > 3) {
                System.out.println("Opção inválida");
            }
        }
    }
}

