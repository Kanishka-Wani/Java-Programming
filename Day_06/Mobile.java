import java.util.Scanner;
public class Mobile{
    public static void main(String[] args){
   
       Scanner sc = new Scanner(System.in);

      System.out.println("Enter Item Name: ");
      String mname = sc.nextLine();
      System.out.println("Enter Model Number: ");
      int no= sc.nextInt();
      System.out.println("Enter Price: ");
      double amount=sc.nextDouble();
      

        System.out.println("\n----------- Mobile Shop RECEIPT -----------");
        System.out.println("Item Name: "+ mname) ;
        System.out.println("Model Number: "+ no) ;        
        System.out.println("-------------------------------");
        System.out.println("Total Bill:   "+ amount);
        System.out.println("-------------------------------");
    sc.close();
}
}
