/*
 23. Create a class InventoryItem with name, quantity, and price. From an array of items, calculate total inventory value and list out-of-stock items.
 */

package Third10;

public class InventoryItem {
    String name;
    int quantity;
    double price;

    InventoryItem(String name, int qty, double price) {
        this.name = name;
        this.quantity = qty;
        this.price = price;
    }

    double totalValue() {
        return quantity * price;
    }

    boolean isOutOfStock() {
        return quantity == 0;
    }
}
