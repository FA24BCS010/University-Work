public class ParkingZone {

    private static int zoneCounter = 1;
    private String zoneId;
    private Vehicle[] vehicles = new Vehicle[5];
    private int vehicleCount = 0;

    public ParkingZone() {
        this.zoneId = "A" + zoneCounter++;
    }

    public void addVehicle(Vehicle v) {
        if (v == null) return;
        if (v.licensePlate == null) return;
        if (vehicleCount >= 5) {
            System.out.println("Zone full: " + zoneId);
            return;
        }
        vehicles[vehicleCount] = v;
        vehicleCount++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Zone " + zoneId + ":\n");
        for (int i = 0; i < vehicleCount; i++) {
            sb.append(" ").append(vehicles[i]).append("\n");
        }
        return sb.toString();
    }


}
