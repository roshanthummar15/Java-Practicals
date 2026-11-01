import java.util.Scanner;
public class VehiclePlate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


         
        System.out.print("Enter 3 digits: ");
        int n= scanner.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("Please enter a valid 3-digit number.");
            return;
        }

        long value = n + System.currentTimeMillis();


        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int a = (int)(value % 26);
        int b = (int)((value / 26) % 26);
        int c = (int)((value / 676) % 26);

        if (b == a) {
            b = (b + 1) % 26;
        }

        if (c == a || c == b) {
            c = (c + 1) % 26;
        }

        char letter1 = letters.charAt(a);
        char letter2 = letters.charAt(b);
        char letter3 = letters.charAt(c);

        int number = 1000 + (int)(value % 9000);

        System.out.println("Vehicle Plate Number: " + letter1 + letter2 + letter3 + number);
    }
}
