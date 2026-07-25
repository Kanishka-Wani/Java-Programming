// find remainder of division
import java.util.Scanner;

public class Remainder{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend: ");
        Double dividend = sc.nextDouble();
        System.out.println("Enter Divisor: ");
        Double divisor = sc.nextDouble();
        System.out.println("The remainder is: "+ (dividend % divisor));
    }
}
