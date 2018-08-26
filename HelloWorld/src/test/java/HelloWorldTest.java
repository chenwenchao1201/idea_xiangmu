import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void  testHello(){
        Assert.assertEquals("HelloWorld",new HelloWorld().sayHello());
    }
}
