/**
 * It's a class that stores the details of a medicine
 */
package Pharma;

public class Medicine {
    public String name;
    public String company;
    public int quantity;
    public String expiry_date;
    public double price;

    Medicine(String name, String company, int quantity, String expiry_date, double price) {
        this.name = name;
        this.company = company;
        this.quantity = quantity;
        this.expiry_date = expiry_date;
        this.price = price;
    }

    Medicine() {

    }

    public void getMedicineDetails() {
        System.out.println(name + "\t\t" + company + "\t\t" + quantity + "\t\t" + expiry_date + "\t\t" + price + "\t");
    }

}
