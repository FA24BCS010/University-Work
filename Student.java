//public class Student {
//    private static int rollcounter = 1;
//    private String rollno;
//    private String name;
//    private double cgpa;
//    private String address;
//    private String phonenumber;
//
//    // Constructor (Auto-generates Roll Number)
//    public Student(String name, double cgpa, String address, String phonenumber) {
//        this.rollno = "FA24-BCS-" + String.format("%03d", rollcounter++);
//        this.name = name;
//        this.cgpa = cgpa;
//        this.address = address;
//        this.phonenumber = phonenumber;
//    }
//
//    public void display() {
//        System.out.println("StudentInput Name = " + name);
//        System.out.println("Roll Number = " + rollno);
//        System.out.println("StudentInput CGPA = " + cgpa);
//        System.out.println("StudentInput Address = " + address);
//        System.out.println("StudentInput Phone Number = " + phonenumber);
//    }
//
//    public static void main(String[] args) {
//        StudentInput s1 = new StudentInput("Ahmer", 2.82, "Lahore", "03001113311");
//        StudentInput s2 = new StudentInput("Ali", 3.04, "Lahore", "03001564411");
//        StudentInput s3 = new StudentInput("Hassan", 2.97, "Lahore", "03341560000");
//
//        System.out.println("..... StudentInput Number 1 .....");
//        s1.display();
//
//        System.out.println("\n..... StudentInput Number 2 .....");
//        s2.display();
//
//        System.out.println("\n..... StudentInput Number 3 .....");
//        s3.display();
//    }
//}
