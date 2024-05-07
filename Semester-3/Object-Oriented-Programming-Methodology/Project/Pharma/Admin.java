package Pharma;

import java.util.*;

// Custom exception function
class contactException extends Exception {
    public String toString() {
        return "Invalid Contact Number!";
    }
}

// extendind the main class file
class Admin extends Pharmacy {
    static String admin_name;
    static int userId;
    static Vector<MedicineDatabase> db = new Vector<>();
    static Vector<BillRecords> bdb = new Vector<>();

    // Gathers the name data on object creation and initializes databases
    Admin(String name, int id) {
        admin_name = name;
        userId = id;
        db.add(id, new MedicineDatabase());
        bdb.add(id, new BillRecords());
    }

    // displays the menu
    void choice() {
        System.out.println("\nHello " + admin_name + ",");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print(
                    "\n(1) Add medicine to database.\n(2) Delete Medicine from database.\n(3) Display Database\n(4) Generate Bill\n(5) Display All bills \n(6) Search for Bill\n(7) Logout\n(8) Exit\n>> ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    addMedicine();
                    break;
                case 2:
                    deleteMedicine();
                    break;
                case 3:
                    db.get(userId).displayDatabase();
                    break;
                case 4:
                    generateBill();
                    break; // generate bill;
                case 5:
                    bdb.get(userId).displayBills();
                    break; // display all bills
                case 6:
                    try {
                        System.out.println("Enter user contact number to search for their bill: ");
                        String user_contact = sc.next();
                        if (user_contact.length() != 10 || !isNumeric(user_contact)) {
                            throw new contactException();
                        }
                        System.out.println("Enter the date(DD/MM/YYYY) of billing: ");
                        String date = sc.next();
                        bdb.get(userId).search(user_contact, date);
                    } catch (contactException e) {
                        System.out.println(e.toString());
                    }
                    break;
                case 7:
                    System.out.print("\033[H\033[2J");
                    System.out.flush(); // clear space/screen
                    main(null);// logout opt to again login
                    break;
                case 8:
                    flag = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // This method is reponsible for adding in a new medicine to database entry
    public static void addMedicine() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter medicine name: ");
        String name = sc.next();
        System.out.print("Enter production company name: ");
        String company = sc.next();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter expiry date (DD/MM/YYYY): ");
        String expiry_date = sc.next();
        System.out.print("Enter price: ");
        Double price = sc.nextDouble();
        Medicine med = new Medicine(name, company, quantity, expiry_date, price);
        db.get(userId).addMedicine(med);
    }

    // This method is reponsible for deleting in a new medicine to database
    public static void deleteMedicine() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the medicine you want to delete: ");
        String name = sc.next();
        db.get(userId).deleteMedicine(name);
    }

    // Generates a new bill
    public static void generateBill() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter customer name: ");
            String name = sc.next();
            System.out.print("Enter date of purchase (DD/MM/YYYY): ");
            String date = sc.next();
            System.out.print("Enter phone number: ");
            String phone_no = sc.next();
            if (phone_no.length() != 10 || !isNumeric(phone_no)) {
                throw new contactException();
            }
            System.out.print("Enter doctor referral: ");
            String doctor = sc.next();
            System.out.println("Add medicines to cart: ");
            Vector<Medicine> cust_meds = new Vector<Medicine>();
            Vector<Integer> quantity = new Vector<Integer>();
            boolean flag = true;
            while (flag) {
                purchaseMedicine(cust_meds, quantity,date);
                System.out.print("Do you want more medicines? (Y/N): ");
                String med_choice = sc.next();
                if (!med_choice.equalsIgnoreCase("Y")) {
                    flag = false;
                }
            }
            Bill b = new Bill(name, date, phone_no, doctor, cust_meds, quantity);
            if (!b.purchased_medicines.isEmpty()) {
                bdb.get(userId).addBill(b);
                b.getBillDetails();
            }
        } catch (contactException e) {
            System.out.println(e.toString());
        }

    }

    public static void purchaseMedicine(Vector<Medicine> purchased_medicines, Vector<Integer> quantitites,String date) {
        Scanner b = new Scanner(System.in);
        System.out.print("Enter Medicine name: ");
        String Med_name = b.next();
        System.out.print("Enter Medicine quantity: ");
        int Med_quantity = b.nextInt();
        int avail = 0;
        if (db.get(userId).all_medicines.isEmpty())
            System.out.println("The Database is Empty!");
        else {
            for (Medicine i : db.get(userId).all_medicines)
                if (Med_name.equalsIgnoreCase(i.name) && Med_quantity <= i.quantity && checkDate(date,i.expiry_date))
                    avail = 1;
        }
        if (avail == 1) {
            Medicine med = db.get(userId).getMeds(Med_name, Med_quantity);
            purchased_medicines.add(med);
            quantitites.add(Med_quantity);
            System.out.println("Added the medicine to cart!");
        } else
            System.out.println("The Medicine for given quantity is not available!");

    }

    public static Boolean checkDate(String d1, String d2){
        // DD/MM/YYYY
        // 0123456789
        int d1D=Integer.parseInt(d1.substring(0,2));
        int d2D=Integer.parseInt(d2.substring(0,2));
        int d1M=Integer.parseInt(d1.substring(3,5));
        int d2M=Integer.parseInt(d2.substring(3,5));
        int d1Y=Integer.parseInt(d1.substring(6));
        int d2Y=Integer.parseInt(d2.substring(6));
        if(d1D<=d2D && d1M<=d2M && d1Y<=d2Y)
            return true;
        return false;
    }

    public static boolean isNumeric(String s) {
        try {
            Long.parseLong(s);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}
