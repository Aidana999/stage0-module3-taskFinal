package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int rev_num = 0;
        while (number > 0) {
            rev_num = rev_num * 10 + number % 10;
            number = number / 10;
        }
        return rev_num;
    }

    public static void main(String[] args)
    {
        int num = 4562;
        System.out.println(revert(number));
    }
}
