import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Cart> carts;
    private ArrayList<Bill> bills;

    public Customer(String name) {
        this.name = name;
        carts = new ArrayList<>();
        bills = new ArrayList<>();
    }

    public void addCart(Cart cart) {
        carts.add(cart);
    }

    public void addBill(Bill bill) {
        bills.add(bill);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Cart> getCarts() {
        return carts;
    }

    public ArrayList<Bill> getBills() {
        return bills;
    }
}