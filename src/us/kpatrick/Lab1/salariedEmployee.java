package us.kpatrick.Lab1;

public class salariedEmployee implements Employee {
    private double annualSalary;
    private double annualBonus;

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public salariedEmployee(double annualSalary, double annualBonus){
        this.setAnnualBonus(annualBonus);
        this.setAnnualSalary(annualSalary);
    }

    public double getAnnualWages() {
        return (this.getAnnualBonus()+this.getAnnualSalary());
    }

}
