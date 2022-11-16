package entires;

public class DadosPessoa {
    public String name;
    public double salarioBruto;
    public  double imposto;

    public double slarioLiqd(){
        return  salarioBruto - imposto;
    }
    public void aumentoSalario(double percentage) {
        salarioBruto += salarioBruto * percentage / 100.0;
    }
    public String toString() {
        return name + ", $ " + String.format("%.2f", slarioLiqd());
    }
}
