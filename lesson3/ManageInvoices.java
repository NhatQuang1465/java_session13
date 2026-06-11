package lesson3;

import java.util.ArrayList;

public class ManageInvoices {

    private ArrayList<Invoice> invoices = new ArrayList<>();

    public void add(Invoice invoice) {
        invoices.add(invoice);
    }

    public void update(int id, Invoice invoice) {

        for (int i = 0; i < invoices.size(); i++) {

            if (invoices.get(i).getId() == id) {

                invoices.set(i, invoice);

                System.out.println("Hóa đơn đã được sửa thành công.");
                return;
            }
        }

        System.out.println("Không tìm thấy hóa đơn.");
    }

    public void display(int id) {

        for (Invoice invoice : invoices) {

            if (invoice.getId() == id) {
                System.out.println(invoice);
                return;
            }
        }

        System.out.println("Không tìm thấy hóa đơn.");
    }

    public void display() {

        if (invoices.isEmpty()) {
            System.out.println("Danh sách hóa đơn trống.");
            return;
        }

        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }
}