package lesson4;

import java.util.ArrayList;

public class OrderManager implements ManageOrders<Order> {

    private ArrayList<Order> orders = new ArrayList<>();

    @Override
    public void add(Order item) {
        orders.add(item);
        System.out.println("Đơn hàng đã được thêm thành công.");
    }

    @Override
    public void update(int id, Order item) {

        for (int i = 0; i < orders.size(); i++) {

            if (orders.get(i).getId() == id) {

                orders.set(i, item);
                System.out.println("Đơn hàng đã được sửa thành công.");
                return;
            }
        }

        System.out.println("Không tìm thấy đơn hàng.");
    }

    @Override
    public void delete(int id) {

        for (int i = 0; i < orders.size(); i++) {

            if (orders.get(i).getId() == id) {

                orders.remove(i);
                System.out.println("Đơn hàng đã được xóa thành công.");
                return;
            }
        }

        System.out.println("Không tìm thấy đơn hàng.");
    }

    @Override
    public void display() {

        if (orders.isEmpty()) {
            System.out.println("Danh sách đơn hàng trống.");
            return;
        }

        for (Order order : orders) {
            System.out.println(order);
        }
    }
}