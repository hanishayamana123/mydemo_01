import org.testng.annotations.Test;

public class TestNGdemo_03 {
  @Test (priority=3)
  public void testGoogle() {
	  System.out.println("testgoogle");
  }
  @Test (priority=1)
  public void testTwitter() {
	  System.out.println("testtwitter");
  }
  @Test (priority=2,enabled=false)
  public void testFacebook() {
	  System.out.println("testfacebook");
  }
}
