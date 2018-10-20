package us.kpatrick.Lab1;

public class SalariedEmployee implements Employee {
    private double annualSalary;
    private double annualBonus;

    public void SetAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void SetAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public double GetAnnualSalary() {
        return annualSalary;
    }

    public double GetAnnualBonus() {
        return annualBonus;
    }

    public SalariedEmployee(double annualSalary, double annualBonus){
        this.SetAnnualBonus(annualBonus);
        this.SetAnnualSalary(annualSalary);
    }

    public double GetAnnualWages() {
        return (this.GetAnnualBonus()+this.GetAnnualSalary());
    }

}
