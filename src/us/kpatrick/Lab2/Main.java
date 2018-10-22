package us.kpatrick.Lab2;

public class Main {

    public static void main(String[] args) {
        FoodServiceTipCalculator fs = new FoodServiceTipCalculator(serviceQuality.GOOD,24.50);
        BaggageServiceTipCalculator bs = new BaggageServiceTipCalculator(serviceQuality.GOOD,3);


        CalculateTipService calc = new CalculateTipService();

        System.out.println(calc.calculateTip(fs));
        System.out.println(calc.calculateTip(bs));


    }
}
