package us.kpatrick.Lab1;

public class HourlyEmployee implements Employee {
    private double hourlyRate;
    private double totalHrsForYear;

    public void SetHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void SetTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }

    public double GetTotalHrsForYear() {
        return this.totalHrsForYear;
    }

    public double GetHourlyRate() {
        return this.hourlyRate;
    }

    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        this.SetHourlyRate(hourlyRate);
        this.SetTotalHrsForYear(totalHrsForYear);
    }

    public double GetAnnualWages() {
        return (this.hourlyRate * this.totalHrsForYear);
    }
}
