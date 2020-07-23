package junit5.tdd;


public class FizzBizz {
    public String playFizzBizz(int number) {
        //String result = "";
        if (number % 3 == 0 && number % 5 == 0){
            return "fizzbizz";
        }
        if (number % 3 == 0) {
            return "fizz";
        }
        if (number % 5 == 0) {
            return "bizz";
        }

            return String.valueOf(number);
    }
}
