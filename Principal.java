package uni_lab;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Endereco SAP = new Endereco("AvSAP", "SaoLeo", "RioGrandeDoSul", "Brasil", "9000000", "188", "SAPLabsLA");
        System.out.println(SAP.toString());

        Data validadeYogurt = new Data(20, 10, 2025);
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


/* 
        int custosSalarioMensal = Amazon.gastosComSalario();
        System.out.println("Amazon gasta mensalmente " + custosSalarioMensal + " reais para pagar todos funcionários.");
*/    
        Data hoje = new Data(19, 10, 2024);
        System.out.println("Hoje é dia " + hoje.toString());
    }
}

