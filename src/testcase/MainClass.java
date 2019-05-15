package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.*;

@Test
public class MainClass extends BaseClass {
	@Test(priority = 0)
	public void titlePageTestDemoAUT() throws InterruptedException {

		titlePage pageOject = new titlePage(driver);
		driver.get("http://demoaut.com");
		pageOject.getTitle();
	}
	
	@Test(priority = 1)
	public void testRegisterationInDemoAUT() throws InterruptedException {

		RegisterationPageObect pageOject = new RegisterationPageObect(driver);
		driver.get("http://demoaut.com/mercuryregister.php");
		pageOject.RegisterUser();

		assert driver.findElement(By.tagName("body")).getText().contains(
				"Thank you for registering. You may now sign-in using the user name and password you've just entered.");

	}

	@Test(priority = 2)
	public void testLoginInDemoAUT() throws InterruptedException {

		LoginPageObect pageOject = new LoginPageObect(driver);
		driver.get("http://demoaut.com/mercurysignon.php");
		pageOject.LoginUser();

	}

}