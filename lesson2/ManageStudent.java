package lesson2;

import java.util.ArrayList;

public class ManageStudent {

    private ArrayList<Student> students = new ArrayList<>();


    public void add(Student student) {
        students.add(student);
    }

    public void remove(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Xóa sinh viên thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên.");
    }


    public void display() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }
}