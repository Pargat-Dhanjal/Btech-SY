import java.util.*;

class rail {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select an Option");
        System.out.println("(1) Encrypt Using Rail Fence Cipher");
        System.out.println("(2) Decrypt Using Rail Fence Cipher");
        System.out.println("(3) Exit");
        int n = sc.nextInt();
        System.out.print("Enter Message: ");
        sc.nextLine();
        String msg = sc.nextLine();
        System.out.print("Enter Key: ");
        int key = sc.nextInt();
        if (n == 1)
            encrypt(msg, key);
        else if (n == 2)
            decrypt(msg, key);
        else
            System.out.println("Please select correct option only!");
        sc.close();
    }

    static void encrypt(String msg, int key) {
        char arr[][] = new char[msg.length()][key];
        Boolean dir = true;
        for (int i = 0, j = 0; i < msg.length(); i++) {
            arr[i][j] = msg.charAt(i);
            if (j == key - 1)
                dir = false;
            else if (j == 0)
                dir = true;
            if (dir)
                j++;
            else
                j--;
        }
        String eMsg = "";
        for (int j = 0; j < key; j++)
            for (int i = 0; i < msg.length(); i++) {
                if (arr[i][j] != '\u0000')
                    eMsg += arr[i][j];
            }
        System.out.println("Encrypted message is: " + eMsg);
    }

    static void decrypt(String eMsg, int key) {
        char arr[][] = new char[eMsg.length()][key];
        Boolean dir = true;
        for (int i = 0, j = 0; i < eMsg.length(); i++) {
            arr[i][j] = '#';
            if (j >= key - 1)
                dir = false;
            else if (j == 0)
                dir = true;
            if (dir)
                j++;
            else
                j--;
        }
        String msg = "";
        int pos = 0;
        for (int j = 0; j < key; j++)
            for (int i = 0; i < eMsg.length(); i++)
                if (arr[i][j] == '#') {
                    arr[i][j] = eMsg.charAt(pos);
                    pos++;
                }

        for (int i = 0, j = 0; i < eMsg.length(); i++) {
            msg += arr[i][j];
            if (j >= key - 1)
                dir = false;
            else if (j == 0)
                dir = true;
            if (dir)
                j++;
            else
                j--;
        }
        System.out.println("Decrypted message is: " + msg);
    }
}