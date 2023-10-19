package BaiTap.SapXepHocVienTheoDiem;

public class Student {
    private int studentId;
    private String studentName;
    private double score;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(int studentId, String studentName, double score) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", score=" + score +
                '}';
    }
}
