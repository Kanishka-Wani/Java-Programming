import java.util.Scanner;

public class Password{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String password = "";
        
        while (!password.equals("java123")) {
        
            System.out.print("Enter Password: ");
            password = sc.nextLine();
        }
        
        System.out.println("Login Successful");
}
}
