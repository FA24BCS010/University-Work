public class PremitHolder extends Person {
    private static int permitCounter = 1;
    private String permitId;

    public PremitHolder(String name) {
        super(name);
        this.permitId = "P" + String.format("%03d", permitCounter++);
    }

    public String getPermitId() {
        return permitId;
    }

    @Override
    public String toString() {
        return name + " (" + permitId + ")";
    }

}