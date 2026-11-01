import java.util.Scanner; 
 
public class GCD{ 
 
    // Method to calculate GCD   
      public static int gcd(int num1, int num2) { 
 
        num1 = Math.abs(num1);     
        num2 = Math.abs(num2); 
 
        while (num2 != 0) {           
            int temp = num2;           
            num2 = num1 % num2;            
            num1 = temp; 
        } 
 
        return num1; 
    } 
 
    public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter first number: ");       
          int a = sc.nextInt(); 
 
        System.out.print("Enter second number: ");        
         int b = sc.nextInt(); 
 
        // Calling gcd method        
         int result = gcd(a, b); 
 
        System.out.println("GCD = " + result); 
 
        sc.close(); 
    } 
} 
