package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class titlePage {
	private WebDriver driver;
	
	public titlePage(WebDriver driver) {
		this.driver = driver;
	}

	public void getTitle() {
		String title = driver.getTitle();
		System.out.println("Page Title : " + title);
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}
}
