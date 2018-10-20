package us.kpatrick.Lab2;

public class Main {

    public static void main(String[] args) {
        FoodServiceTipCalculator fs = new FoodServiceTipCalculator(ServiceQuality.GOOD,24.50);
        BaggageServiceTipCalculator bs = new BaggageServiceTipCalculator(ServiceQuality.GOOD,3);


        CalculateTipService calc = new CalculateTipService();

        System.out.println(calc.CalculateTip(fs));
        System.out.println(calc.CalculateTip(bs));


    }
}
