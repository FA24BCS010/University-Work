import java.util.ArrayList;

public class ParkingSystem {

    private static ParkingSystem instance;
    private String campusName;
    private Superviser supervisor;
    private ParkingZone[] zones = new ParkingZone[10];
    private int zoneCount = 0;
    private PremitHolder[] permitHolders = new PremitHolder[10]; private int permitCount = 0;

    private ParkingSystem(String campusName, Superviser supervisor) {
        this.campusName = campusName;
        this.supervisor = supervisor;
    }

    public static ParkingSystem getInstance(String campusName, Superviser supervisor) {
        if (instance == null && supervisor != null) {
            instance = new ParkingSystem(campusName, supervisor);
        }
        return instance;
    }

    public void addZone(ParkingZone zone) {
        if (zoneCount < zones.length) {
            zones[zoneCount++] = zone;
        }
    }

    public void addPermitHolder(PremitHolder holder) {
        if (permitCount < permitHolders.length) {
            permitHolders[permitCount++] = holder;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Campus: " + campusName + "\n");
        sb.append(supervisor).append("\n\nZones:\n");
        for (int i = 0; i < zoneCount; i++) {
            sb.append(zones[i]).append("\n");
        }
        sb.append("Permit Holders:\n");
        for (int i = 0; i < permitCount; i++) {
            sb.append(" ").append(permitHolders[i]).append("\n");
        }
        return sb.toString();
    }

}