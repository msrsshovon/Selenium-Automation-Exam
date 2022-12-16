package Exam.SeleniumAutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Category extends BaseBrowser {

	@Test(priority = 0)
	public void openURL() throws InterruptedException {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void scenario_2() throws InterruptedException {
		WebElement Travel = driver.findElement(By.xpath("//select[@class='custom-select']"));

		// Using Select method
		Select select = new Select(Travel);

		select.selectByIndex(1);
		Thread.sleep(2000);
	}

}
