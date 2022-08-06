package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;

        if (number != 0)
        {
            sum = sum + number % 10;
            number = number/10;
        }

        return sum;
    }

    // Driver program
    public void main(String[] args)
    {
        int number = 687;

        System.out.println(calculateSum(number));
    }
}
