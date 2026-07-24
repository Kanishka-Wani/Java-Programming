public class swap{
    public static void main(String[] args){
        int a=10, b=20, c;
        System.out.println(a +" "+ b);

        // c=a; using third variable
        // a=b;
        // b=c;

        a=a+b;// without using third variable
        b=a-b;
        a=a-b;
        
        System.out.println(a +" "+ b);
    }
}
