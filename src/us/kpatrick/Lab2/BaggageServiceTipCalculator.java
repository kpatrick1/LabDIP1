package us.kpatrick.Lab2;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author kpatr
 */
public class BaggageServiceTipCalculator implements TipCalculator{
    private static final double MIN_BILL = 0.00;
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;

    private double baseTipPerBag;
    private int bagCount;

    private us.kpatrick.Lab2.serviceQuality serviceQuality;

    public BaggageServiceTipCalculator(us.kpatrick.Lab2.serviceQuality q, int bags) {
        this.setServiceRating(q); // perform validation
        this.setBagCount(bags);

        baseTipPerBag = 1.00; // set default value
    }

    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + us.kpatrick.Lab2.serviceQuality.getRate(us.kpatrick.Lab2.serviceQuality.GOOD));
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + us.kpatrick.Lab2.serviceQuality.getRate(us.kpatrick.Lab2.serviceQuality.FAIR));
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + us.kpatrick.Lab2.serviceQuality.getRate(us.kpatrick.Lab2.serviceQuality.POOR));
                break;
        }
        return tip;
    }

    public final void setServiceRating(us.kpatrick.Lab2.serviceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public us.kpatrick.Lab2.serviceQuality getServiceQuality() {
        return serviceQuality;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}
