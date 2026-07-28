import java.util.Scanner;

public class StudentReg{
   public static void main(String[] args){
     
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter Your name: ");
    String name= sc.nextLine();
    
    System.out.print("Enter Your Mobile NO. : ");
    int no= sc.nextInt();
    System.out.print("Enter Your Age: ");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter Your Branch: ");
    String branch= sc.nextLine();    
    System.out.print("Enter Your CGPA: ");
    double cgpa= sc.nextDouble();

    
    System.out.println("----------- Student Registration -----------");
    System.out.println("Student Name: "+ name+ "\nMobile number: " + no + "\nAge: "+age+ "\nBranch: "+branch+"\nCGPA: " +cgpa );

sc.close();
}
}
   
