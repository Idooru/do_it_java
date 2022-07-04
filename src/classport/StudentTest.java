package classport;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student(102, "이승훈");
        studentLee.address = "서울시 서초구 서초동";

        studentLee.showStudentInfor();
    }
}
