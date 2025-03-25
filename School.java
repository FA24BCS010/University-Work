public class School {
    private String name;
    private String address;
    private Principal principal;
    private ClassRoom[] classrooms;
    private int classCount;

    public School(String name, String address, Principal principal) {
        this.name = name;
        this.address = address;
        this.principal = principal;
        this.classrooms = new ClassRoom[10]; // Max 10 classes
        this.classCount = 0;
    }

    public void addClassroom(ClassRoom classroom) {
        if (classCount < classrooms.length) {
            classrooms[classCount++] = classroom;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("School Name: ").append(name).append("\n");
        sb.append("Address: ").append(address).append("\n");
        sb.append("Principal: ").append(principal).append("\n");
        sb.append("Classes:\n");
        for (int i = 0; i < classCount; i++) {
            sb.append(classrooms[i]).append("\n");
        }
        return sb.toString();
    }
}