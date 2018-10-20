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

    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.SetServiceRating(q);
        this.SetBill(billAmt);
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = bill * ServiceQuality.GetRate(ServiceQuality.GOOD);
                break;
            case FAIR:
                tip = bill * ServiceQuality.GetRate(ServiceQuality.FAIR);
                break;
            case POOR:
                tip = bill * ServiceQuality.GetRate(ServiceQuality.POOR);
                break;
        }

        return tip;
    }

    public void SetBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public void SetServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

}
