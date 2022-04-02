package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Assert_Equal_Example {
  @Test
  public void testBeforeclass_Example() {
	  System.out.println("navigate to application");
	  System.out.println("login to application");
	  //if the assertion is passed will go to next steps
	  //if the assertion is failed program will stop there , it will not go to next steps
	  //if you want to compare text then we have to use assert.assertequal
	  Assert.assertEquals("Welcome Raju", "Welcome Naga");
	  System.out.println("Login successful");
  }
  //it will execute only one time irrespective of number of @Test annotations
  @BeforeClass
  public void beforeClass() {
	  System.out.println("launch chrome browser");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("close chrome browser");
  }

}
