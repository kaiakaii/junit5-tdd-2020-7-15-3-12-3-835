package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlayFizzBizzTest {
    @Test
    public void should_return_1_when_play_fizz_bizz_given_1(){
        //given
        int number = 1;
        FizzBizz fizzBizz = new FizzBizz();

        //when
        String actual = fizzBizz.playFizzBizz(number);

        //then
        assertEquals("1",actual);
    }
}
