package global.goit.edu.unicalc;

import global.goit.edu.exchanger.CurExchanger;
import global.goit.edu.exchanger.Currencies;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UniCalcCarTest {

    @Test
    public void testCalcCurExchanger() {
        //Given

        CurExchanger exchanger = mock(CurExchanger.class);
        when(exchanger.exchange(any(), anyInt())).thenReturn(100);

        UniCalc calc = new UniCalc();

        //When

        int result = calc.exchange(exchanger, Currencies.UAH, 1);

        //Then

        int expected = 100;
        assertEquals(result,expected);
    }
}
