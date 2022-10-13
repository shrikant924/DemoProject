import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG2 {

    @BeforeClass
    public void beforeClass(){
        System.out.println("this is before testNG2");
    }

    @Test
public void test11(){
    System.out.println("testNG2");
}

}

