import java.util.ArrayList;

public class Cart {

    private ArrayList<Item> items;
    private ArrayList<Integer> quantities;

    public Cart() {
        items = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public void addItem(Item item, int quantity) {
        items.add(item);
        quantities.add(quantity);
    }

    public void removeItem(Item item) {
        int index = items.indexOf(item);

        if (index != -1) {
            items.remove(index);
            quantities.remove(index);
        }
    }

    public double getTotal() {
        double total = 0;

        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPrice() * quantities.get(i);
        }

        return total;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Integer> getQuantities() {
        return quantities;
    }
}