import java.util.Scanner;
public class Num1{
    public static void main(String[] args){
   
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter any nymber:  ");
       int num= sc.nextInt();
      
	if(num>0){
           System.out.println("Number is positive");
         }
	else if(num<0){
	  System.out.println("Number is negative");
 	}
	else{
	   System.out.println("Number is Zero");
	}

      
    sc.close();
}
}