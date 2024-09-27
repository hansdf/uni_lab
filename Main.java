package uni_lab;

public class Main {
    public static void main(String[] args) {
        Object SAP = new Endereco("AvSAP", "SaoLeo", "RioGrandeDoSul", "Brasil", "9000000", "188", "SAPLabsLA");

        System.out.println(SAP.toString());

        Object fone = new Produto("Fone Senheiser", 500);

        System.out.println(fone.toString());
        

    }
}
