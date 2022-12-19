/**
 * It contains a vector of all the medicines in the system
 */
package Pharma;

import java.util.*;

public class MedicineDatabase {
    public Vector<Medicine> all_medicines = new Vector<Medicine>();

    MedicineDatabase() {
    }

    public void addMedicine(Medicine b) {
        all_medicines.add(b);
        System.out.println("Medicine successfully added to the database!");
    }

    public void deleteMedicine(String title) {
        boolean check_med = false;
        for (int i = 0; i < all_medicines.size(); i++) {
            if (title.equalsIgnoreCase(all_medicines.get(i).name)) {
                all_medicines.remove(i);
                check_med = true;
                System.out.println("Medicine successfully deleted from database!");
            }
        }
        if (check_med == false) {
            System.out.println("Medicine not available in database!");
        }
    }

    public Medicine getMeds(String Name, int quantities) {
        Medicine med = new Medicine();
        for (Medicine i : all_medicines) {
            if (Name.equalsIgnoreCase(i.name) && quantities <= i.quantity) {
                i.quantity -= quantities;
                return i;
            }
        }
        return med;
    }

    public void displayDatabase() {
        System.out.println("\nName\t\tCompany\t\tQuantity\t\tExpiry\t\tPrice");
        for (int i = 0; i < all_medicines.size(); i++)
            all_medicines.get(i).getMedicineDetails();
    }
}
