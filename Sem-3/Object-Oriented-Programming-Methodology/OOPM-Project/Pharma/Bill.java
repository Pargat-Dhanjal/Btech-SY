/**
 * Used to generate a bill for a customer
 */
package Pharma;
import java.util.*;

//Creation of a bill
public class Bill {
    public String cust_name;
    public String date;
    public String Phone_number ;
    public String DoctorName;
    public Vector<Medicine> purchased_medicines;
    public Vector<Integer> med_quantities;
    public double total_price;

    Bill (String cust_name, String date, String Phone_number, String DoctorName, Vector<Medicine> purcMedicines, Vector<Integer> quantities) {
        this.cust_name = cust_name;
        this.date = date;
        this.Phone_number=Phone_number;
        this.DoctorName=DoctorName;
        this.purchased_medicines = purcMedicines;
        this.med_quantities = quantities;
        total_price = 0;
        
    }

    //calculates total
    public double total() {
        for (int i = 0; i < purchased_medicines.size(); i++) {
            total_price += (purchased_medicines.get(i).price * Integer.valueOf(med_quantities.get(i)));
        }
        return total_price;
    }

    //Print one bill
    public void getBillDetails() {
        total_price = 0;
        System.out.println("Customer Name: " + cust_name); 
        System.out.println("Date: " + date); 
        System.out.println("Phone Number: " + Phone_number); 
        System.out.println("Doctor Name: " + DoctorName); 
        System.out.println("Name\t\tCompany\t\tQuantity\tPrice");
        for (int i = 0; i < purchased_medicines.size(); i++) {
            Medicine m = purchased_medicines.get(i);
            System.out.print(m.name + "\t\t" + m.company + "\t\t" + med_quantities.get(i) + "\t\t" + m.price + "\t" );
        }
        total_price = total();
        System.out.println("\nTotal Price = " + total_price);
    }

    //To print all bills
    public void printBills() {
        System.out.println(cust_name + "\t\t\t" + date + "\t" + Phone_number + "\t" + total_price);
    }
}





