import java.util.Scanner;
public class SimpleInterestCalculator {
    public static void main (String[] args){
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter principal: ");
        double principal = sc.nextDouble();
        System.out.println("Enter Rate: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time period in years: ");
        double time= sc.nextDouble();
        double intrest = (principal*rate*time)/100;
        System.out.println("Intrest is: "+intrest);
        sc.close();

    }
}
