public class TestStudentMain {
    public static void main(String[] args) {

        // 4. สร้าง array ของ reference
        Student[] students = new Student[3];

       // สร้าง object นักศึกษา
        students[0] = new Student("66001", "Somchai Jaidee", "Computer Science", 3.20);
        students[1] = new Student("66002", "Suda Saijai", "Information Technology", 3.85);
        students[2] = new Student("66003", "Anan Tangjai", "Software Engineering", 3.50);

        // 5. แสดงข้อมูลทั้งหมดด้วย loop
        for (int i = 0; i < students.length; i++) {
            students[i].displayInfo();
        }
    }
}