package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class RegisterationPageObect {

	private WebDriver driver;

	public RegisterationPageObect(WebDriver driver) {
		this.driver = driver;
	}

	public void RegisterUser() {
		driver.findElement(By.name("firstName")).sendKeys("Fransiskus");
		driver.findElement(By.name("lastName")).sendKeys("Andika");
		driver.findElement(By.name("phone")).sendKeys("08227884000");
		WebElement t = driver.findElement(By.id("userName"));
		driver.findElement(By.id("userName")).sendKeys("dikakoko04@.com");
		driver.findElement(By.name("address1")).sendKeys("Jakarata Barat");
		driver.findElement(By.name("city")).sendKeys("Bandar Lampung");
		driver.findElement(By.name("state")).sendKeys("Lampung");
		driver.findElement(By.name("postalCode")).sendKeys("67489");
		Reporter.log("" + t.getAttribute("maxlength"));
// #Drop Down
		new Select(driver.findElement(By.name("country"))).selectByVisibleText("ANGUILLA");
		driver.findElement(By.name("email")).sendKeys("dikakoko04@.com");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("confirmPassword")).sendKeys("password");
// register
		driver.findElement(By.name("register")).click();
	}

}
