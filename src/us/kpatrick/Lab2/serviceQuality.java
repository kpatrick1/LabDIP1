package us.kpatrick.Lab2;

public enum serviceQuality {
    GOOD,
    FAIR,
    POOR;


    public static double getRate(serviceQuality rate) {
        double rateAmt = 0;
        switch (rate) {
            case GOOD:
                rateAmt = .20;
                break;
            case FAIR:
                rateAmt = .15;
                break;
            case POOR:
                rateAmt = .10;
                break;
        }
        return rateAmt;

    }
}
