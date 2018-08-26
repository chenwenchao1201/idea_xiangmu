import org.junit.Assert;
import org.junit.Test;

public class SpeakTest {
    @Test
    public void testsayHi(){
        Assert.assertEquals("HelloWorld",new Speak().sayHi());
    }
}
