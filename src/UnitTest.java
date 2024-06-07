
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UnitTest {


    //unit Test
    @Test
    public void testAdd()
    {
        TestLib testlib = new TestLib();
        assertEquals(5, testlib.add(2,3));
    }
    @Test
    public void testMultiply()
    {
        TestLib testlib = new TestLib();
        assertEquals(5, testlib.multiply(2, 3));
    }
    //scenario

    @Test
    public void testScene()
    {
        TestLib testlib = new TestLib();
        int result = testlib.add(1,2) + testlib.multiply(11,2);
        assertEquals(5, result);
    }
    //
    @Test
    public void testStandalone()
    {
        long start, end;

        TestLib testlib = new TestLib();
        int result = testlib.add(1,2) + testlib.multiply(11,2);
        start = System.nanoTime();
        for (int i = 0; i < 1e5; ++i) {
            assertEquals(25, result);
            assertEquals(25, result);
            assertEquals(25, result);
            assertEquals(25, result);
            assertEquals(25, result);
            assertEquals(25, result);
        }
        end = System.nanoTime();

        long duration = end - start;

        System.out.println("duration time:" + duration);

    }




}
