import org.testng.annotations.*;

public class testNG
{
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("BeforeClass");
    }
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("beforeMethod");
    }
    @Test
    public void testng1()
    {
        System.out.println("hello NG class");
    }

    @Test
    public void testng2()
    {
        System.out.println("Hello NG2 class");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("afterMethod");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("after Class");
    }
}
