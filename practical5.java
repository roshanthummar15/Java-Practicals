import java.util.Scanner;

public class practical5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first digit: ");
        int i = scanner.nextInt();

        System.out.print("Enter second digit: ");
        int j = scanner.nextInt();

        System.out.print("Enter third digit: ");
        int k = scanner.nextInt();
  
        if (i >= j && i >= k) {
            if (j >= k) {
                System.out.println(i + ", " + j + ", " + k);
            } else {
                System.out.println(i + ", " + k + ", " + j);
            }
        } 
        else if (j >= i && j >= k) {
            if (i >= k) {
                System.out.println(j + ", " + i + ", " + k);
            } else {
                System.out.println(j + ", " + k + ", " + i);
            }
        } 
      
        else {
            if (i >= j) {
                System.out.println(k + ", " + i + ", " + j);
            } else {
                System.out.println(k + ", " + j + ", " + i);
            }
        }
        
        scanner.close();
    }
}
