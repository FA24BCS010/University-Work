public class Main {

    public static void main(String[] args) {


        Superviser supervisor = new Superviser("Dr. Ayesha", 5);
        ParkingSystem system = ParkingSystem.getInstance("CUI Lahore", supervisor);
        ParkingSystem secondAttempt = ParkingSystem.getInstance("ShouldNotWork", supervisor);


    }

}