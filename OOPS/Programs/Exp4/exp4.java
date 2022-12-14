import java.util.Scanner;

class exp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of customers: ");
        int n = sc.nextInt();
        account arr[] = new account[n];
        int t = 0;
        while (t != 4) {
            System.out.println("(1) Add Account");
            System.out.println("(2) Delete Account");
            System.out.println("(3) Display Accounts");
            System.out.println("(4) Exit");
            t = sc.nextInt();
            if (t == 1)
                addAccount(arr, n);
            else if (t == 2) {
                System.out.print("Enter Account ID. to Delete: ");
                int id = sc.nextInt();
                deleteAccount(arr, id, n);
            } else if (t == 3){
                System.out.println("Enter the account id to search: ");
                int id=sc.nextInt();
                displayAccount(arr, id,n);
            }
            else if (t == 4)
                break;
            else
                System.out.println("Please Enter Correct Option!");

        }
    }

    static void addAccount(account arr[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=null){
                if(arr[i].id==id){
                check=true;
                System.out.println("Cannot add the above account id");
                break;
                }
            }
            else {
                arr[i] = new account(id, name, balance);
                check = true;
                break;
            }
        }
        if (check == false)
            System.out.println("There is not enough space in Array!");
    }

    static void deleteAccount(account arr[], int id, int n) {
        boolean check = false;
        for (int i = 0; i < n && arr[i]!=null; i++) {
            if (arr[i].id == id) {
                check = true;
                for (int j = i; j < n - 1; j++)
                    arr[j] = arr[j + 1];
                arr[n - 1] = null;
            }
        }
        if (check == false)
            System.out.println("Account ID not found!");
    }

    static void displayAccount(account arr[], int id,int n) {
        boolean check=false;
        for(int i=0;i<n && arr[i]!=null;i++){
            if(arr[i].id==id){
            System.out.println("\nAccount id: " + arr[i].id);
            System.out.println("Account name: " + arr[i].name);
            System.out.println("Account balance: " + arr[i].balance + "\n");
            check=true;
            break;
            }
        }

        if(check==true)
            System.out.println("Account Not Found!");
    }
}

class account {
    int id;
    String name;
    double balance;

    account() {
        id = 0;
        name = null;
        balance = 0;
    }

    account(int pid, String pname, double pbalance) {
        id = pid;
        name = pname;
        balance = pbalance;
    }
}
