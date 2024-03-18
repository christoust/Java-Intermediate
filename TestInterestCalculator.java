import java.util.Scanner;

public class TestInterestCalculator {



    public static void main(String[] args) {
        InterestCalcImpl ob = new InterestCalcImpl();
        Scanner sc = new Scanner(System.in);
        System.out.println("Interest Calculator");
        System.out.println("Enter the principal amount");
        float amount = sc.nextFloat();
        System.out.println("Enter the rate of interest");
        float rate = sc.nextInt();
        System.out.println("Enter the duration");
        int time = sc.nextInt();
        System.out.println("1.Calculate Simple Interest\n2.Calculate Compound Interest");
        System.out.println("Enter option number");
        int option = sc.nextInt();
        switch (option){
            case 1: {
                double simpleInterest = ob.simpleInterest(amount,rate,time);
                System.out.println("Simple Interest is: " + simpleInterest);
            }
            case 2:
            {
                double compoundInterest = ob.compoundInterest(amount,rate,time);
                System.out.println("Compound Interest is: " + compoundInterest);

            }
            default:
            {
                System.out.println("Enter correct option");
            }

        }







    }
}
