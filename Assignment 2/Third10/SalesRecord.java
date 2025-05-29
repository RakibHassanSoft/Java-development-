/*
 30. Write a SalesRecord class with product name, unitsSold, and unitPrice. Calculate the highest grossing product from an array of sales records.
 */
package Third10;

public class SalesRecord {
    String productName;
    int unitsSold;
    double unitPrice;

    SalesRecord(String name, int units, double price) {
        productName = name;
        unitsSold = units;
        unitPrice = price;
    }

    double totalRevenue() {
        return unitsSold * unitPrice;
    }
}
