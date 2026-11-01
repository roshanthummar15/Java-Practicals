import java.util.Scanner; 
 
public class Small_fact{     public static void main(String[] args) { 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Enter a number: ");         int num = sc.nextInt(); 
 
        if (num <= 1) { 
            System.out.println("Enter a number greater than 1.");             return; 
        } 
 
        System.out.print("Factors: "); 
 
        // Checking factors starting from 2        
         for (int i = 2; i <= num; i++) { 
 
            // Divide until the number is no longer divisible         
               while (num % i == 0) {                
                 System.out.print(i + " ");               
                   num = num / i; 
            } 
        } 
 
        sc.close(); 
    } 
} 
