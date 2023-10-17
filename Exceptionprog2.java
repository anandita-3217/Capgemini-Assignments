import java.util.Scanner;

public class Exceptionprog2 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Enter Dividend: ");
            int dividend = sc.nextInt();
            System.out.println("Enter Divisor: ");
            int divisor = sc.nextInt();
            if (divisor==0){
                throw new UnsupportedOperationException("No division by 0.");
            }
            int r = dividend/divisor;
            System.out.println("Result is: "+r);
            sc.close();


        }    
        
    }
    

