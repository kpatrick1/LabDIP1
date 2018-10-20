package us.kpatrick.Lab1;


public class Main {

    public static void main(String[] args){


        HourlyEmployee emp1 = new HourlyEmployee(15.50, 2020);
        SalariedEmployee emp2 = new SalariedEmployee(75000, 7500);
        SalariedEmployee emp3 = new SalariedEmployee(125000,0);

        HRService hr = new HRService();

        System.out.println("Employee 1 annual compensation: " + hr.getAnnualCompensationForEmployee((Employee) emp1));
        System.out.println("Employee 2 annual compensation: " + hr.getAnnualCompensationForEmployee(emp2));
        System.out.println("Employee 3 annual compensation: " + hr.getAnnualCompensationForEmployee(emp3));



    }
}
