public class Student {
    String studentId;
    String name;
    String major;
    double gpa;

    // 1. constructor สำหรับกำหนดค่าข้อมูลทั้งหมด
    public Student(String studentId, String name, String major, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    // 2. เมธอด displayInfo() สำหรับแสดงข้อมูลนักศึกษา   
    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name      : " + name);
        System.out.println("Major     : " + major);
        System.out.println("GPA       : " + gpa);
        System.out.println();
    }
}