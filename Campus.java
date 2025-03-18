package ComsatsUniversity;

class Campus {
    private String name;
    private Department[] departments;

    public Campus(String name, Department[] departments) {
        this.name = name;
        this.departments = departments;
    }

    public void displayDetails() {
        System.out.println("Campus Name: " + name);
        for (Department dept : departments) {
            dept.displayDetails();
        }
    }
}

