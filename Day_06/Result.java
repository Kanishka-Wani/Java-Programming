import java.util.Scanner;
public class Result{
    public static void main(String[] args){
   
       Scanner sc = new Scanner(System.in);

      System.out.println("Enter Marks of Mathematics: ");
      int m1 = sc.nextInt();
      System.out.println("Enter Marks of Chemistry: ");
      int m2= sc.nextInt();
      System.out.println("Enter Marks of Physics: ");
      int m3= sc.nextInt();
      double per = (m1+m2+m3)/3;
      

        System.out.println("\n----------- Exam Result -----------");
        System.out.println("Mathematics: "+ m1) ;
        System.out.println("Chemistry: "+ m2) ;
        System.out.println("Physics: "+ m3) ;        
        System.out.println("-------------------------------");
        System.out.println("Percentage:   "+ per + "%");
        System.out.println("-------------------------------");
    sc.close();
}
}
