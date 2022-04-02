package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Assert_True_Example {
  @Test
  public void testBeforeclass_Example() {
	  System.out.println("navigate to application");
	  System.out.println("login to application");
	  //it always expects a true value
	  Assert.assertTrue(5<7);
	  System.out.println("Login successful");
  }
  //it will execute only one time irrespective of number of @Test annotation
  @BeforeClass
  public void beforeClass() {
	  System.out.println("launch chrome browser");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("close chrome browser");
  }

}
