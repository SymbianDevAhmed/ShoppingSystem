public class Bill {

    private Cart cart;

    public Bill(Cart cart) {
        this.cart = cart;
    }

    public double getTotalAmount() {
        return cart.getTotal();
    }

    public Cart getCart() {
        return cart;
    }

    public void printBill() {
        System.out.println("Bill");
        System.out.println("--------------------");

        for (int i = 0; i < cart.getItems().size(); i++) {
            Item item = cart.getItems().get(i);
            int quantity = cart.getQuantities().get(i);

            double itemTotal = item.getPrice() * quantity;

            System.out.println(
                    item.getName()
                            + " | Quantity: " + quantity
                            + " | Price: " + item.getPrice()
                            + " | Total: " + itemTotal
            );
        }

        System.out.println("--------------------");
        System.out.println("Total Amount: " + getTotalAmount());
    }
}