import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CenturyFromYearTest {

    @Test
    public void testSolution() {
        CenturyFromYear c = new CenturyFromYear();
        assertEquals(1, c.solution(8));
        assertEquals(20, c.solution(1905));
        assertEquals(21, c.solution(2001));
    }
}