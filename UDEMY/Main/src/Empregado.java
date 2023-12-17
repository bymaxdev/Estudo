public class Empregado {
    private String name;
    private double grossSalary;
    private double tax;

    public Empregado(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double netSalary(){
        return this.getGrossSalary() - this.getTax();
    }
    public void increaseSalary(double percent){
        grossSalary += grossSalary * percent / 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Empregado: " + this.getName() + ", $ " + this.netSalary();
    }
}
