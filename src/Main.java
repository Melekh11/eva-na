import org.junit.runner.Result;
import  org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {
        {
            System.out.println("Running Test");
            Result result = JUnitCore.runClasses(UnitTest.class);
            for(Failure fail : result.getFailures())
            {
                System.out.println(fail.toString());
            }
            System.out.println("Result:  " + ((result.wasSuccessful()) ? "Success" : "test failed"));

        }
    }
}