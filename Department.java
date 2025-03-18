package ComsatsUniversity;

class Department {
    private String inchargeName;
    private String[] staff;
    private Lab[] labs;

    public Department(String inchargeName, String[] staff, Lab[] labs) {
        this.inchargeName = inchargeName;
        this.staff = staff;
        this.labs = labs;
    }

    public void displayDetails() {
        System.out.println("Department Incharge: " + inchargeName);
        System.out.println("Department Staff:");
        for (String s : staff) {
            System.out.println(" - " + s);
        }
        System.out.println("Labs:");
        for (Lab lab : labs) {
            lab.displayDetails();
        }
    }
}