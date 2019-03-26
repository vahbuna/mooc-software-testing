package tudelft.sum;

import java.util.ArrayList;
import org.junit.jupiter.api.*;

public class TwoNumbersSumTest {
    private TwoNumbersSum twoNums;

    @BeforeEach
    public void init() {
        twoNums = new TwoNumbersSum();
    }

    @Test
    public void allPositive() {
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();

        first.add(2);
        first.add(2);
        second.add(2);
        second.add(2);
        for(Integer i :twoNums.addTwoNumbers(first, second)) {
            Assertions.assertEquals(new Integer(4), i);
        }
    }

    @Test
    public void carryOver() {
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();

        first.add(2);
        first.add(9);
        second.add(2);
        second.add(2);
        ArrayList<Integer> answer = twoNums.addTwoNumbers(first, second);

        Assertions.assertEquals(2, answer.size());
        Assertions.assertEquals(new Integer(1), answer.get(1));
        Assertions.assertEquals(new Integer(5), answer.get(0));
    }

    @Test
    public void multipleCarryOver() {
        ArrayList<Integer> first = new ArrayList<Integer>();
        ArrayList<Integer> second = new ArrayList<Integer>();

        first.add(5);
        first.add(5);
        first.add(5);
        first.add(5);
        second.add(5);
        second.add(5);
        second.add(5);
        second.add(5);
        ArrayList<Integer> answer = twoNums.addTwoNumbers(first, second);

        Assertions.assertEquals(5, answer.size());
        Assertions.assertEquals(new Integer(0), answer.get(4));
        for(int i = 0; i < answer.size()-1; i++)
            Assertions.assertEquals(new Integer(1), answer.get(i));
    }
}
