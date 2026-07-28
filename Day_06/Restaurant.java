import java.util.Scanner;
public class Restaurant{
    public static void main(String[] args){
   
       Scanner sc = new Scanner(System.in);

      System.out.println("Enter Meal Item1: ");
      String m1 = sc.nextLine();
      System.out.println("Enter Meal Item2: ");
      String m2= sc.nextLine();
      System.out.println("Enter Total Meal Charge: ");
      double amount=sc.nextDouble();
      

        System.out.println("\n----------- RECEIPT -----------");
        System.out.println("Item 1: "+ m1) ;
        System.out.println("Item 2: "+ m2) ;        
        System.out.println("-------------------------------");
        System.out.printf("Total Bill:   "+ amount);
        System.out.println("-------------------------------");
    sc.close();
}
}
