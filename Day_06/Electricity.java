import java.util.Scanner;
public class Electricity{
    public static void main(String[] args){
   
       Scanner sc = new Scanner(System.in);

      System.out.println("Enter customer name: ");
      String name = sc.nextLine();
      System.out.println("Enter Total units: ");
      int units= sc.nextInt();     
      System.out.println("Enter Total Bill Amount: "); 
      double amount=sc.nextDouble();

        System.out.println("\n==================================");
        System.out.println("        ELECTRICITY BILL          ");
        System.out.println("==================================");
        System.out.println("Customer Name  : " + name);
        System.out.println("Units Consumed : " + units);
        System.out.println("Total Amount   : "+ amount);
        System.out.println("==================================");
    sc.close();
}
}
