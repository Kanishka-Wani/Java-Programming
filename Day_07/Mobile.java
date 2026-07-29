import java.util.Scanner;
public class MobileRecharge{
    public static void main(String[] args){
   
       Scanner sc = new Scanner(System.in);

      System.out.println(" Mobile Recharge Menu ");
      System.out.println("1. Data Pack (Unlimited 1 day) ");
      System.out.println("2. 2GB + SMS (3 months) ");
      System.out.println("3. 2GB + SMS + Call (3 Months)  ");
      System.out.println("4. 6GB + SMS + Call(12 Months) ");

      System.out.println("Enter Your Choice:  ");
      int choice= sc.nextInt();
     
      switch(choice){
          case 1 : System.out.println(" Data Pack (Unlimited 1 day): 50 Rs."); break;
          case 2 : System.out.println(" 2GB + SMS (3 months): 599 Rs. "); break;
          case 3 : System.out.println(" 2GB + SMS + Call (3 Months): 799 Rs. "); break;
          case 4 : System.out.println("  6GB + SMS + Call(12 Months): 1599 Rs. ");break;
          default : ("Invalid Case"); break;
        }
 
    sc.close();
}
}