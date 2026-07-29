import java.util.Scanner;
public class Loan{
    public static void main(String[] args){
   
       Scanner sc = new Scanner(System.in);

      System.out.println("Enter Your Age: ");
      int age = sc.nextInt();
      System.out.println("Enter Your Salary: ");
      double sal=sc.nextDouble();
      
        
     if(age>=21){
         if(sal> 50000){
         System.out.println("Loan Approved");
           }
         else{
            System.out.println("Salary not Eligible");
          }
      }
      else{
          System.out.println("Age is not eligible");
         }
      
    sc.close();
}
}