package us.kpatrick.Lab1;

public class hourlyEmployee implements Employee {
    private double hourlyRate;
    private double totalHrsForYear;

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }

    public double getTotalHrsForYear() {
        return this.totalHrsForYear;
    }

    public double getHourlyRate() {
        return this.hourlyRate;
    }

    public hourlyEmployee(double hourlyRate, double totalHrsForYear) {
        this.setHourlyRate(hourlyRate);
        this.setTotalHrsForYear(totalHrsForYear);
    }

    public double getAnnualWages() {
        return (this.hourlyRate * this.totalHrsForYear);
    }
}
