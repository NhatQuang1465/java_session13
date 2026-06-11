package lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Person> personList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n************** MENU QUẢN LÝ NGƯỜI DÙNG **************");
            System.out.println("1. Thêm người dùng");
            System.out.println("2. Xóa người dùng");
            System.out.println("3. Hiển thị danh sách người dùng");
            System.out.println("4. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addPerson();
                    break;

                case 2:
                    deletePerson();
                    break;

                case 3:
                    displayPersons();
                    break;

                case 4:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 4);
    }

    public static void addPerson() {

        String name;
        String email;
        String phone;

        do {
            System.out.print("Nhập tên người dùng: ");
            name = sc.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Vui lòng không để trống!");
            }
        } while (name.isEmpty());

        do {
            System.out.print("Nhập email người dùng: ");
            email = sc.nextLine().trim();

            if (email.isEmpty()) {
                System.out.println("Vui lòng không để trống!");
            }
        } while (email.isEmpty());

        do {
            System.out.print("Nhập số điện thoại người dùng: ");
            phone = sc.nextLine().trim();

            if (phone.isEmpty()) {
                System.out.println("Vui lòng không để trống!");
            }
        } while (phone.isEmpty());

        personList.add(new Person(name, email, phone));

        System.out.println("Người dùng đã được thêm thành công.");
    }

    public static void deletePerson() {

        System.out.print("Nhập email người dùng để xóa: ");
        String email = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getEmail().equalsIgnoreCase(email)) {
                personList.remove(i);
                found = true;
                System.out.println("Người dùng đã được xóa thành công.");
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy người dùng!");
        }
    }

    public static void displayPersons() {

        if (personList.isEmpty()) {
            System.out.println("Danh sách người dùng trống!");
            return;
        }

        System.out.println("\nDanh sách người dùng:");

        for (Person p : personList) {
            System.out.println(p);
        }
    }
}