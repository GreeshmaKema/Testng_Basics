package sample;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Beforeclass_Example {
  @Test
  public void testBeforeclass_Example() {
	  System.out.println("navigate to application");
	  System.out.println("login to application");
  }
  @Test
  public void testBeforeMethod_Example1() {
	  System.out.println("logout of application");  
  }
  //it will execute only one time irrespective of number of @test annotations
  @BeforeClass
  public void beforeClass() {
	  System.out.println("launch chrome browser");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("close chrome browser");
  }

}
