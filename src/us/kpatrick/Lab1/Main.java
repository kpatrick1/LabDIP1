package us.kpatrick.Lab1;


public class Main {

    public static void main(String[] args){


        hourlyEmployee emp1 = new hourlyEmployee(15.50, 2020);
        salariedEmployee emp2 = new salariedEmployee(75000, 7500);
        salariedEmployee emp3 = new salariedEmployee(125000,0);

        HRService hr = new HRService();

        System.out.println("Employee 1 annual compensation: " + hr.getAnnualCompensationForEmployee((Employee) emp1));
        System.out.println("Employee 2 annual compensation: " + hr.getAnnualCompensationForEmployee(emp2));
        System.out.println("Employee 3 annual compensation: " + hr.getAnnualCompensationForEmployee(emp3));



    }
}
