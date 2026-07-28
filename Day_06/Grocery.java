import java.util.Scanner;

public class Grocery{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter Shop Name: ");
      String storeName = sc.nextLine();

      System.out.println("Enter Name and Cost of product1: ");
      String nm1= sc.nextLine();
      double cost1= sc.nextDouble();
      sc.nextLine();

      System.out.println("Enter Name and Cost of product2: ");
      String nm2= sc.nextLine();
      double cost2= sc.nextDouble();
      sc.nextLine();

      System.out.println("Enter Name and Cost of product3: ");
      String nm3= sc.nextLine();
      double cost3= sc.nextDouble();
      sc.nextLine();

     double totalPrice = cost1+cost2+cost3;
System.out.println(" | ---------------------------------------------- | ");
      System.out.println(" |               " + storeName + "                      |"  );
System.out.println(" | ---------------------------------------------- | ");

      System.out.println(" |   ProductName \t  |   Price \t        | ");
System.out.println(" | ---------------------------------------------- | ");
      System.out.println(" |       " + nm1 + "           |     " + cost1 + " Rs.           |       " + "\n |       " + nm2 + "          |      " + cost2 + " Rs.         |        "+"\n | " + nm3 + "          |       " + cost3 + " Rs.        | "); 
      System.out.println(" | ---------------------------------------------- | ");
      System.out.println(" | \t\t Total price = " + totalPrice + " Rs.           | ");
      System.out.println(" | ---------------------------------------------- | ");

      sc.close();

     

}
}
