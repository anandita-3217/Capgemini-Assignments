import java.util.Scanner;
public class Exceptionprog {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter Dividend: ");
            int dividend = sc.nextInt();
            System.out.println("Enter Divisor: ");
            int divisor = sc.nextInt();
            int r = dividend/divisor;
            System.out.println("Result is: "+r);

        }
        
        catch(ArithmeticException e){
            System.out.println("NO divison by 0.");
        }

        finally{
            sc.close();
        }
    }
}
