public class SchoolStudent extends Person {
    private int rollNumber;

    public SchoolStudent(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", Roll Number: " + rollNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SchoolStudent student = (SchoolStudent) obj;
        return this.rollNumber == student.rollNumber;
    }
}
