public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Ahmed");

        Item laptop = new Item("Laptop", 1000);
        Item mouse = new Item("Mouse", 50);

        Cart cart = new Cart();
        customer.addCart(cart);

        cart.addItem(laptop, 2);
        cart.addItem(mouse, 3);

        Bill bill = new Bill(cart);
        customer.addBill(bill);

        System.out.println("Customer: " + customer.getName());
        bill.printBill();
    }
}