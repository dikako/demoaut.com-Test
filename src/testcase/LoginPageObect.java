package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObect {
	private WebDriver driver;

	public LoginPageObect(WebDriver driver) {
		this.driver = driver;
	}

	public void LoginUser() {
		driver.findElement(By.name("userName")).sendKeys("dikakoko04@gmail.com");
		driver.findElement(By.name("password")).sendKeys("password");
// #Drop Down

// register
		driver.findElement(By.name("register")).click();
	}

}
