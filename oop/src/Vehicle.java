public class Vehicle {

    private static java.util.HashSet<String> licenseRegistry = new java.util.HashSet<>();
    String licensePlate;
    private String type;
    private Owner owner;
    public Vehicle(String licensePlate, String type, Owner owner) {
        if (licenseRegistry.contains(licensePlate)) {
            System.out.println("Duplicate license plate not allowed: " + licensePlate);
            this.licensePlate = null;
            return;
        }
        this.licensePlate = licensePlate;
        this.type = type;
        this.owner = owner;
        licenseRegistry.add(licensePlate);
    }

    public Vehicle shallowCopy() {
        return new Vehicle(this.licensePlate + "_Copy", this.type, this.owner);
    }

    public Vehicle deepCopy() {
        Owner newOwner = new Owner(this.owner.getName());
        return new Vehicle(this.licensePlate + "_DeepCopy", this.type, newOwner);
    }

    @Override
    public String toString() {
        return type + " - " + licensePlate + ", Owner: " + owner;
    }
}
