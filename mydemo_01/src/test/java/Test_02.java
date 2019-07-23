import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class Test_02 {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
	  
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "", "" },
      new Object[] { "", "" },
    };
  }
}
