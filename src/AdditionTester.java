import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTester {
    Calculator calc;
    @Before
    public void setUp(){
        calc = new Calculator();
    }

    @Test
    public void When_inputsOneAndTwoAreOne_Expect_Two(){
       calc.askValues(1,1);
       assertEquals(2, calc.calculate());
    }
}
