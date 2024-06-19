package global.goit.edu.unicalc;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class UniCalcMathTest {

    @Test
    public void testAddInt() {

        //Given

        UniCalc uniCalc = new UniCalc();

        //When

        int result = uniCalc.add(1, 2);

        //Then

        int expected = 3;
        assertEquals(result, expected);

    }

    @Test
    public void testAddFloat() {

        //Given

        UniCalc uniCalc = new UniCalc();

        //When

        int result = uniCalc.add(1f, 2f);

        //Then

        int expected = 3;

        assertEquals(result, expected);

    }

    @Test
    public void testDivInt() {

        //Given

        UniCalc uniCalc = new UniCalc();

        //When

        int result = uniCalc.divInt(1, 2);

        //Then

        int expected = 1 / 2;
        assertEquals(result, expected);

    }

    @Test
    public void testDivFloat() {

        //Given

        UniCalc uniCalc = new UniCalc();

        //When

        int result = uniCalc.divFloat(1f, 2f);

        System.out.println(uniCalc.divFloat(1f, 2f));
        //Then

        int expected = 1;

        assertEquals(result, expected);
    }

    @Test
    public void testDivByZeroInt() {

        //Given

        UniCalc uniCalc = new UniCalc();

        //When & Then

        int expected = 3;
        assertThrows(IllegalArgumentException.class,
                () -> uniCalc.divInt(1, 0));

    }

    @Test
    public void testDivByZeroFloat() {

        //Given

        UniCalc uniCalc = new UniCalc();

        //When & Then

        int expected = 3;
        assertThrows(IllegalArgumentException.class,
                () -> uniCalc.divFloat(1, 0));

    }
}