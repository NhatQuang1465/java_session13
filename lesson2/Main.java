package lesson2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ManageStudent manageStudent = new ManageStudent();

        int choice;

        do {
            System.out.println("\n************** MENU QUẢN LÝ SINH VIÊN **************");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Hiển thị danh sách sinh viên");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Nhập ID sinh viên: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập tên sinh viên: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập tuổi sinh viên: ");
                    int age = Integer.parseInt(sc.nextLine());

                    manageStudent.add(new Student(id, name, age));

                    System.out.println("Sinh viên đã được thêm thành công.");
                    break;

                case 2:
                    System.out.print("Nhập ID sinh viên cần xóa: ");
                    int deleteId = Integer.parseInt(sc.nextLine());

                    manageStudent.remove(deleteId);
                    break;

                case 3:
                    System.out.println("\nDanh sách sinh viên:");
                    manageStudent.display();
                    break;

                case 4:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 4);

        sc.close();
    }
}