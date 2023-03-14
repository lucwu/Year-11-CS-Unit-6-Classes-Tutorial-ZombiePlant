public class ZombiePlant {
    private int maximumPotency;
    private int successfulTreatments;

    public ZombiePlant(int maximumPotency, int successfulTreatments) {
        this.maximumPotency = maximumPotency;
        this.successfulTreatments = successfulTreatments;
    }

    public int treatmentsNeeded() {
        if (successfulTreatments > 0)
            return successfulTreatments;
        else
            return 0;
    }

    public void treat(int treat) {
        if ((maximumPotency >= treat) && (treat > 0))
            successfulTreatments = successfulTreatments - 1;
        if ((treat > maximumPotency) && (treat > 0))
            successfulTreatments = successfulTreatments + 1;
    }

    public boolean isDangerous() {
        return successfulTreatments > 0;
    }

    public int getPotencyRequired() {
        return maximumPotency;
    }
}