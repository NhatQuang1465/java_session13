package lesson4;

public class Order {
    private int id;
    private String name;
    private String customer;

    public Order(int id, String name, String customer) {
        this.id = id;
        this.name = name;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCustomer() {
        return customer;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Tên đơn hàng: " + name +
                ", Tên khách hàng: " + customer;
    }
}