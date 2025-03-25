public class ClassRoom {
    private String className;
    private String classCode;
    private Teacher teacher;
    private SchoolStudent[] students;
    private int studentCount;

    public ClassRoom(String className, String classCode, Teacher teacher) {
        this.className = className;
        this.classCode = classCode;
        this.teacher = teacher;
        this.students = new SchoolStudent[5]; // Max 5 students per class
        this.studentCount = 0;
    }

    public boolean enrollStudent(SchoolStudent student) {
        if (studentCount >= 5) {
            System.out.println("Class " + className + " is full. Cannot enroll student: " + student.name);
            return false;
        }
        students[studentCount++] = student;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Class Name: ").append(className).append(" (Code: ").append(classCode).append(")\n");
        sb.append("Teacher: ").append(teacher).append("\n");
        sb.append("Students:\n");
        for (int i = 0; i < studentCount; i++) {
            sb.append("  ").append(students[i]).append("\n");
        }
        return sb.toString();
    }
}
