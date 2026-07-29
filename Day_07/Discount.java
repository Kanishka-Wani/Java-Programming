import java.util.Scanner;
public class Discount{
    public static void main(String[] args){
   
       Scanner sc = new Scanner(System.in);

      System.out.println("Enter Purchase Amount: ");
      double amount=sc.nextDouble();
      
        
     if(amount>=5000){
         amount= amount - (amount*0.10);
         System.out.println("10% Discount Applied");
      }
      else{
          System.out.println("No discount");
         }
      System.out.println("Final Bill = " + amount + " Rs.");
    
 
    sc.close();
}
}