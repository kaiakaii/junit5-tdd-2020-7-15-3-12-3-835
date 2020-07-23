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
    @Test
    public void should_return_fizz_when_play_fizz_bizz_given_3(){
        //given
        int number = 3;
        FizzBizz fizzBizz = new FizzBizz();

        //when
        String actual = fizzBizz.playFizzBizz(number);

        //then
        assertEquals("bizz",actual);
    }
    @Test
    public void should_return_bizz_when_play_fizz_bizz_given_5(){
        //given
        int number = 1;
        FizzBizz fizzBizz = new FizzBizz();

        //when
        String actual = fizzBizz.playFizzBizz(number);

        //then
        assertEquals("1",actual);
    }
    @Test
    public void should_return_fizzbizz_when_play_fizz_bizz_given_15(){
        //given
        int number = 1;
        FizzBizz fizzBizz = new FizzBizz();

        //when
        String actual = fizzBizz.playFizzBizz(number);

        //then
        assertEquals("1",actual);
    }
    @Test
    public void should_return_fizzbizzwhizz_when_play_fizz_bizz_given_105(){
        //given
        int number = 1;
        FizzBizz fizzBizz = new FizzBizz();

        //when
        String actual = fizzBizz.playFizzBizz(number);

        //then
        assertEquals("1",actual);
    }
}
