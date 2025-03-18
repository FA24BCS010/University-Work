package ComsatsUniversity;

class Lab {
    private String labName;
    private String labAddress;
    private Person[] labStaff;
    private PC[] computers;

    public Lab(String labName, String labAddress, Person[] labStaff, PC[] computers) {
        this.labName = labName;
        this.labAddress = labAddress;
        this.labStaff = labStaff;
        this.computers = computers;
    }

    public void displayDetails() {
        System.out.println("Lab Name: " + labName);
        System.out.println("Lab Address: " + labAddress);
        System.out.println("Lab Staff:");
        for (Person p : labStaff) {
            System.out.println(" - " + p.getName() + ", Age: " + p.getAge());
        }
        System.out.println("Computers:");
        for (PC pc : computers) {
            System.out.println(" - " + pc.getDetails());
        }
    }
}