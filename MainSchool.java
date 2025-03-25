public class MainSchool {
    public static void main(String[] args) {
        Principal principal = new Principal("Dr. Ali", 50, 25);
        School school = new School("GOvt High", "123 Main St", principal);

        Teacher teacher1 = new Teacher("Mr. Javed", 40, "Mathematics", 101);
        Teacher teacher2 = new Teacher("Ms. Dawood", 35, "Science", 102);

        ClassRoom class1 = new ClassRoom("Grade 10", "G10", teacher1);
        ClassRoom class2 = new ClassRoom("Grade 11", "G11", teacher2);

        school.addClassroom(class1);
        school.addClassroom(class2);

        SchoolStudent s1 = new SchoolStudent("Aliya", 16, 1);
        SchoolStudent s2 = new SchoolStudent("Babar", 17, 2);
        SchoolStudent s3 = new SchoolStudent("Hammad", 16, 3);
        SchoolStudent s4 = new SchoolStudent("Danish", 17, 4);
        SchoolStudent s5 = new SchoolStudent("Salaman", 16, 5);
        SchoolStudent s6 = new SchoolStudent("Farukh", 17, 6);

        class1.enrollStudent(s1);
        class1.enrollStudent(s2);
        class1.enrollStudent(s3);
        class1.enrollStudent(s4);
        class1.enrollStudent(s5);
        class1.enrollStudent(s6);

        System.out.println(school);


        SchoolStudent s7 = new SchoolStudent("Aliya", 16, 1);
        System.out.println("s1 equals s7: " + s1.equals(s7));

        Teacher teacher3 = new Teacher("Mr. Javed", 40, "Mathematics", 101);
        System.out.println("teacher1 equals teacher3: " + teacher1.equals(teacher3)); // Should be true
    }
}