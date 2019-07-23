package mydemo_01.mydemo_01;

import org.testng.annotations.Test;

public class Myprogram_04Test {
  @Test (priority=1)
  public void Login() {
	  System.out.println("code for login");
  }
  @Test (priority=3,enabled=false)
  public void Logout() {
	  System.out.println("code for logout");
  }
  @Test (priority=2)
  public void Register()
  {
	  System.out.println("code for register");
  }
  @Test (priority=4)
  public void Addtocart()
  {
	  System.out.println("code for add to cart");
  }
}
