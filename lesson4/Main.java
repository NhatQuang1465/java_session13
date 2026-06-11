package lesson4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        OrderManager manager = new OrderManager();

        int choice;

        do {

            System.out.println("\n************** MENU QUẢN LÝ ĐƠN HÀNG **************");
            System.out.println("1. Thêm đơn hàng");
            System.out.println("2. Sửa đơn hàng");
            System.out.println("3. Xóa đơn hàng");
            System.out.println("4. Hiển thị danh sách đơn hàng");
            System.out.println("5. Thoát");

            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("Nhập mã đơn hàng: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập tên đơn hàng: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập tên khách hàng: ");
                    String customer = sc.nextLine();

                    manager.add(new Order(id, name, customer));
                    break;

                case 2:

                    System.out.print("Nhập ID đơn hàng cần sửa: ");
                    int updateId = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập tên đơn hàng mới: ");
                    String newName = sc.nextLine();

                    System.out.print("Nhập tên khách hàng mới: ");
                    String newCustomer = sc.nextLine();

                    manager.update(
                            updateId,
                            new Order(updateId, newName, newCustomer)
                    );

                    break;

                case 3:

                    System.out.print("Nhập ID đơn hàng cần xóa: ");
                    int deleteId = Integer.parseInt(sc.nextLine());

                    manager.delete(deleteId);

                    break;

                case 4:

                    System.out.println("\nDanh sách đơn hàng:");
                    manager.display();

                    break;

                case 5:

                    System.out.println("Thoát chương trình.");
                    break;

                default:

                    System.out.println("Lựa chọn không hợp lệ.");
            }

        } while (choice != 5);

        sc.close();
    }
}