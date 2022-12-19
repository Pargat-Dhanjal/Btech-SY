package Pharma;

import java.util.*;

// This is a custom exception class which inherits the Exception class
class LoginException extends Exception {
    LoginException(int indicator) {
        if (indicator == 2) {
            System.out.println("Password was incorrectly typed.");
        } else if (indicator == 3) {
            System.out.println("Username already exists in system.");
        } else {
            System.out.println("User does not exist.");
        }
    }

    public String toStringLogin() {
        return "Login Error!!!";
    }

    public String toStringRegister() {
        return "Registration Error!!!";
    }
}

class Pharmacy {
    // Class variables that store username and password
    static Vector<String> usernames = new Vector<String>();
    static Vector<String> passwords = new Vector<String>();
    static Vector<Admin> data = new Vector<>();
    static int userId;

    // This function adds in new users on succesfull validation
    public static void register(String name, String pass) {
        usernames.addElement(name);
        passwords.addElement(pass);
        System.out.println("User credentials saved succesfully!");
    }

    // This method checks if the given username and password exist in the vector or
    // not
    public static int login(String name, String password) {
        if (usernames.contains(name)) {
            int index = usernames.indexOf(name);
            if (password.equals(passwords.get(index))) {
                data.add(new Admin(name, userId));
                System.out.println("You are now Logged in!");
                userId = index;
                return 1;
            } else {
                return 2;
            }
        } else {
            return -1;
        }
    }

    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("** Welcome to Pharmacy Management System! **");
        System.out.println("*****************************************\n");
        boolean flag = true;
        while (flag) {
            System.out.print("\n(1) Login to an account\n(2) Register for a new account\n(3) Quit\n>> ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter Username: ");
                        String name = sc.next();
                        System.out.print("Enter Password: ");
                        String password = sc.next();
                        int check_login = login(name, password);
                        if (check_login == 1) {
                            data.get(userId).choice();
                        } else if (check_login == 2) {
                            throw new LoginException(2);
                        } else {
                            throw new LoginException(0);
                        }
                    } catch (LoginException e) {
                        System.out.println(e.toStringLogin());
                    }
                    break;
                case 2:
                    System.out.print("Enter Username: ");
                    String user_name = sc.next();
                    try {
                        if (usernames.contains(user_name)) {
                            throw new LoginException(3);
                        }
                        System.out.print("Enter Password: ");
                        String password2 = sc.next();
                        register(user_name, password2);

                    } catch (LoginException e) {
                        System.out.println(e.toStringRegister());
                    }
                    break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("Please Select a correct option!");
            }
        }
    }
}