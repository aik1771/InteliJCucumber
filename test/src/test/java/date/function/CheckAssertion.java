package date.function;

/**
 * Created by agolubev on 12/2/18.
 */
import org.testng.Assert;

public class CheckAssertion {

    public static void AssertCheck(String result, String actual)
    {
        Assert.assertEquals(result, actual,"The result didn't match the expected");


    }

}
