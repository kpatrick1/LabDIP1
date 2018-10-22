package us.kpatrick.Lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR = "Error: bill must be greater than or equal to " + MIN_BILL;
    private double bill;

    private us.kpatrick.Lab2.serviceQuality serviceQuality;

    public FoodServiceTipCalculator(us.kpatrick.Lab2.serviceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * us.kpatrick.Lab2.serviceQuality.getRate(us.kpatrick.Lab2.serviceQuality.GOOD);
                break;
            case FAIR:
                tip = bill * us.kpatrick.Lab2.serviceQuality.getRate(us.kpatrick.Lab2.serviceQuality.FAIR);
                break;
            case POOR:
                tip = bill * us.kpatrick.Lab2.serviceQuality.getRate(us.kpatrick.Lab2.serviceQuality.POOR);
                break;
        }

        return tip;
    }

    public void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public void setServiceRating(us.kpatrick.Lab2.serviceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public serviceQuality getServiceQuality() {
        return serviceQuality;
    }

}
