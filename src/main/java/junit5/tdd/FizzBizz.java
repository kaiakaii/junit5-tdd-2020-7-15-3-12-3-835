package junit5.tdd;


public class FizzBizz {
    public String playFizzBizz(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "fizz";
        }
        if (number % 5 == 0) {
            result += "bizz";
        }
        if (number % 7 == 0) {
            result += "whizz";
        }

        return "".equals(result)?String.valueOf(number):result;
    }
}
