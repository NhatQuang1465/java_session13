package lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ManageInvoices manage = new ManageInvoices();

        int choice;

        do {

            System.out.println("\n************** MENU QUẢN LÝ HÓA ĐƠN **************");
            System.out.println("1. Thêm hóa đơn");
            System.out.println("2. Sửa hóa đơn");
            System.out.println("3. Hiển thị danh sách hóa đơn");
            System.out.println("4. Hiển thị một hóa đơn");
            System.out.println("5. Thoát");

            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    System.out.print("Nhập mã hóa đơn: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập tên hóa đơn: ");
                    String customer = sc.nextLine();

                    System.out.print("Nhập số tiền: ");
                    double total = Double.parseDouble(sc.nextLine());

                    manage.add(new Invoice(id, customer, total));

                    System.out.println("Hóa đơn được thêm mới.");
                    break;

                case 2:

                    System.out.print("Nhập ID hóa đơn cần sửa: ");
                    int updateId = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập tên hóa đơn mới: ");
                    String newCustomer = sc.nextLine();

                    System.out.print("Nhập số tiền mới: ");
                    double newTotal = Double.parseDouble(sc.nextLine());

                    manage.update(
                            updateId,
                            new Invoice(updateId, newCustomer, newTotal)
                    );

                    break;

                case 3:

                    System.out.println("\nDanh sách hóa đơn:");
                    manage.display();

                    break;

                case 4:

                    System.out.print("Nhập ID hóa đơn cần xem: ");
                    int searchId = Integer.parseInt(sc.nextLine());

                    manage.display(searchId);

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