package lesson3;

public class Invoice {
    private int id;
    private String customer;
    private double total;

    public Invoice(int id, String customer, double total) {
        this.id = id;
        this.customer = customer;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public double getTotal() {
        return total;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Tên hóa đơn: " + customer +
                ", Số tiền: " + total;
    }
}
