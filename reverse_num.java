import java.util.Scanner;  
public class reverse_num{ 
     // Method to display array in reverse order     
      public static void reverse(int[] arr) { 
         System.out.println("Reverse order:"); 
      for  (int i = arr.length - 1; i >= 0; i--) { 
             System.out.print(arr[i] + " "); 
         }     } 
 
    public static void main(String[] args) { 
  
 
        Scanner sc = new Scanner(System.in);       
           int[] arr = new int[10]; 
         System.out.println("Enter 10 numbers:"); 
         // Taking 10 numbers from user       
            for (int i = 0; i < 10; i++) {     
                         arr[i] = sc.nextInt(); 
         } 
         // Calling reverse method  
                reverse(arr); 
 
        sc.close(); 
 
    } 
 
} 
