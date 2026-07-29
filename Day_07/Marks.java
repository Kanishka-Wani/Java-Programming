import java.util.Scanner;
public class Marks{
    public static void main(String[] args){
   
       Scanner sc = new Scanner(System.in);

      System.out.println("Enter Your Marks: ");
      int marks = sc.nextInt();
     
       
     if(marks<=40){
         System.out.println("Fail");
           }
         else if (marks<=50){
            System.out.println("Grade D");
          }
       else if (marks<=70){
            System.out.println("Grade C");
          }
        else if (marks<=80){
            System.out.println("Grade B");
          }
       else if (marks<=90){
            System.out.println("Grade A");
          }
       else if(marks<=100){
           System.out.println("Grade A+");
          }
      else{
          System.out.println("Invalid marks");
         }
	
	
      
    sc.close();
}
}