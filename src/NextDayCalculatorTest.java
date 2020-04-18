import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {

    @Test

    public void testFindNextDay(){
        int day =1;
        int month =1;
        int displayDay =2;


        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        assertEquals(displayDay,nextDayCalculator.findNextDay(day,month));
    }

    @Test
    public void testFindNextDay1(){
        int day =31;
        int month =1;
        int displayDay =1;


        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        assertEquals(displayDay,nextDayCalculator.findNextDay(day,month));
    }

    @Test
    public void testFindNextDay2(){
        int day =30;
        int month =4;
        int displayDay =1;


        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        assertEquals(displayDay,nextDayCalculator.findNextDay(day,month));
    }

    @Test
    public void testFindNextDay3(){
        int day =28;
        int month =2;
        int displayDay =1;


        NextDayCalculator nextDayCalculator = new NextDayCalculator();
        assertEquals(displayDay,nextDayCalculator.findNextDay(day,month));
    }



}