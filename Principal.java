package uni_lab;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Object SAP = new Endereco("AvSAP", "SaoLeo", "RioGrandeDoSul", "Brasil", "9000000", "188", "SAPLabsLA");
        System.out.println(SAP.toString());

        Object fone = new Produto("Fone Senheiser", 500);
        System.out.println(fone.toString());

        Produto mouse = new Produto("Mouse Logitech", 350);
        System.out.println(mouse.toString());

        Loja Amazon = new Loja("Amazon", 5000);
        System.out.println(Amazon.getQuantidadeFuncionarios());

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        
    }
}

