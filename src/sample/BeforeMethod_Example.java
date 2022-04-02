package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeMethod_Example {
	//without @Test annotation we can't execute program
	//test will be executed
  @Test
  public void testBeforeMethod_Example() {
	  System.out.println("navigate to application");
	  System.out.println("login to application");
  }
  //before method will be executed first
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("launch chrome browser");
  }
//after will be executed third
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Close chrome browser");
  }

}
