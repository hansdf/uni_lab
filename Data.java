package uni_lab;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia) { this.dia = dia; }
    public int getDia() { return dia; }

    public void setMes(int mes) { this.mes = mes; }
    public int getMes() { return mes; }

    public void setAno(int ano) { this.ano = ano; }
    public int getAno() { return ano; }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
