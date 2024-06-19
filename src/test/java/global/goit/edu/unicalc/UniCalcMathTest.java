package global.goit.edu.unicalc;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UniCalcMathTest {

    @Test
    public void testAddInt () {

        //Given

        UniCalc uniCalc = new UniCalc();

        //When

        int result = uniCalc.add(1,2);

        //Then

        int expected = 3;
        assertEquals(result, expected);

    }

}
