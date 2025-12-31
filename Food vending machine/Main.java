import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi, Please enter your name");

        int q;
        Scanner m = new Scanner(System.in);
        String n = m.nextLine();

        System.out.println("Hey " + n);

        System.out.println(
            "1. Chicken Biryani - 150/-\n" +
            "2. Cauliflower Curry - 50/-\n" +
            "3. Paneer Curry - 80/-\n" +
            "4. Dal - 30/-\n" +
            "5. Chapati - 10/-"
        );

        System.out.println("Select from MENU");
        int l = m.nextInt();

        switch (l) {
            case 1:
                System.out.println("Enter quantity");
                q = m.nextInt();
                System.out.println("You selected Chicken Biryani. Pay " + (q * 150));
                l = m.nextInt();
                if (l == (q * 150)) {
                    System.out.println("Your order has been placed");
                } else {
                    System.out.println("Enter valid amount");
                }
                break;

            case 2:
                System.out.println("Enter quantity");
                q = m.nextInt();
                System.out.println("You selected Cauliflower Curry. Pay " + (q * 50));
                l = m.nextInt();
                if (l == (q * 50)) {
                    System.out.println("Your order has been placed");
                } else {
                    System.out.println("Enter valid amount");
                }
                break;

            case 3:
                System.out.println("Enter quantity");
                q = m.nextInt();
                System.out.println("You selected Paneer Curry. Pay " + (q * 80));
                l = m.nextInt();
                if (l == (q * 80)) {
                    System.out.println("Your order has been placed");
                } else {
                    System.out.println("Enter valid amount");
                }
                break;

            case 4:
                System.out.println("Enter quantity");
                q = m.nextInt();
                System.out.println("You selected Dal. Pay " + (q * 30));
                l = m.nextInt();
                if (l == (q * 30)) {
                    System.out.println("Your order has been placed");
                } else {
                    System.out.println("Enter valid amount");
                }
                break;

            case 5:
                System.out.println("Enter quantity");
                q = m.nextInt();
                System.out.println("You selected Chapati. Pay " + (q * 10));
                l = m.nextInt();
                if (l == (q * 10)) {
                    System.out.println("Your order has been placed");
                } else {
                    System.out.println("Enter valid amount");
                }
                break;

            default:
                System.out.println("Blind!!!");
        }
        m.close();
    }
}