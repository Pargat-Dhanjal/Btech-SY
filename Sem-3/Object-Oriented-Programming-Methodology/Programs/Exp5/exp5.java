import java.util.*;

class exp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Employee> arr = new Vector<>();
        int t = 0;
        System.out.print("Enter the number of Employees to add: ");
        int n = sc.nextInt();
        addAccount(arr, n);
        while (t != 4) {
            System.out.println("(1) Add Employee");
            System.out.println("(2) Delete Employee");
            System.out.println("(3) Display Employee");
            System.out.println("(4) Exit");
            t = sc.nextInt();
            if (t == 1)
                addAccount(arr, 1);
            else if (t == 2)
                deleteAccount(arr);
            else if (t == 3)
                displayAccount(arr);
            else if (t == 4)
                break;
            else
                System.out.println("Please Enter Correct Option!");

        }
    }

    static void addAccount(Vector<Employee> arr, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Employee salary: ");
            double balance = sc.nextDouble();
            int check = 0;
            for (Employee e : arr) {
                if (e.id == id) {
                    System.out.println("Cannot add the above Employee data!");
                    check = -1;
                    break;
                } else if (e.name.equals(name)) {
                    System.out.println("Cannot add the above Employee data!");
                    check = -1;
                    break;
                }
            }
            if (check != -1)
                arr.add(new Employee(id, name, balance));
        }
        Collections.sort(arr, new Comparator<Employee>() {
            public int compare(Employee s1, Employee s2) {
                if (s1.salary > s2.salary)
                    return -1;
                else if (s1.salary < s2.salary)
                    return 1;
                else
                    return 0;
            }
        });
    }

    static void deleteAccount(Vector<Employee> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("(1) Delete by ID");
        System.out.println("(2) Delete by Name");
        int t = sc.nextInt();
        int id = -1, count = 0;
        String name = null;
        if (t == 1) {
            System.out.println("Enter Id");
            id = sc.nextInt();
        } else if (t == 2) {
            System.out.println("Enter Name");
            sc.nextLine();
            name = sc.nextLine();
        }
        for (Employee e : arr) {
            if (e.id == id && t == 1) {
                arr.remove(e);
                System.out.println("Deleted Employee!");
                break;
            } else if (e.name.equals(name) && t == 2) {
                arr.remove(e);
                System.out.println("Deleted Employee!");
                break;
            }
            count++;
        }
    }

    static void displayAccount(Vector<Employee> arr) {
        for (Employee employee : arr) {
            System.out.println("\n\nName: " + employee.name);
            System.out.println("Id: " + employee.id);
            System.out.println("Salary: " + employee.salary);
        }
    }
}

class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        id = 0;
        name = null;
        salary = 0;
    }

    Employee(int pid, String pname, double pbalance) {
        id = pid;
        name = pname;
        salary = pbalance;
    }
}