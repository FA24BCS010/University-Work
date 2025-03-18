package ComsatsUniversity;

public class UniversitySystem {
    public static void main(String[] args) {
        PC[] pcs = { new PC("i5", 8, 512), new PC("i7", 16, 1024) };
        Person[] labStaff = { new Person("Ali", 35), new Person("Sara", 30) };

        Lab[] labs = new Lab[50];
        for (int i = 0; i < 50; i++) {
            labs[i] = new Lab("Lab " + (i + 1), "Block " + (char) ('A' + i % 5), labStaff, pcs);
        }

        String[] staff = { "Dr. Ahmad", "Dr. Fatima" };
        Department[] departments = new Department[10];
        for (int i = 0; i < 10; i++) {
            departments[i] = new Department("Dr. Incharge " + (i + 1), staff, labs);
        }

        Campus campus = new Campus("Comsats University", departments);
        campus.displayDetails();
    }
}

