public class Main
{

    public static void main(String[] args)
    {
	    double INTEREST_RATE = 0.17;
        double intialBal = 5000.00;
        double monthOne = 0.00;
        double monthTwo = 0.00;
        double totalMonthOne;
        double totalMonthTwo;
        monthOne = INTEREST_RATE * intialBal;
        monthTwo = INTEREST_RATE * monthOne;
        totalMonthOne = monthOne + intialBal;
        totalMonthTwo = totalMonthOne + monthTwo;
        System.out.println("The interest rate due from the first month is $" + monthOne);
        System.out.println("The interest rate due from the second month is $" + monthTwo);
        System.out.println("The total balance from the first month is $" + totalMonthOne);
        System.out.println("The total balance from the second month is $" + totalMonthTwo);



    }
}
