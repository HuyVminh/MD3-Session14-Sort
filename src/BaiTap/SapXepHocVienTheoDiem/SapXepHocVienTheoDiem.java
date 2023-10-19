package BaiTap.SapXepHocVienTheoDiem;

public class SapXepHocVienTheoDiem {
    public static void main(String[] args) {
        Student[] students = new Student[]{new Student(1, "huy", 9.5),
                new Student(2, "thịnh", 8),
                new Student(3, "đức", 7),
                new Student(4, "tùng", 9.5),
                new Student(5, "bằng", 8.5),
                new Student(6, "sơn", 6)};

        // Cách sắp xếp ID nổi bọt  :
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getStudentId() > students[j].getStudentId()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        // Cách sắp xếp chọn :
        for (int i = 0; i < students.length - 1; i++) {
            Student currentMin = students[i];
            int currentIndex = i;
            for (int j = i + 1; j < students.length; j++) {
                if (currentMin.getScore() > students[j].getScore()) {
                    currentMin = students[j];
                    currentIndex = j;
                }
            }
            if (currentIndex != i) {
                students[currentIndex] = students[i];
                students[i] = currentMin;
            }
        }
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        // Cách sắp xếp chèn
        for (int i = 1; i < students.length; i++) {
            Student currentElement = students[i];
            int k;
            for (k = i - 1; k >= 0 && students[k].getScore() > currentElement.getScore(); k--) {
                students[k + 1] = students[k];
            }
            students[k + 1] = currentElement;
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
