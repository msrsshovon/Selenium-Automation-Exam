package Exam.SeleniumAutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Radio_and_Checkbox extends BaseBrowser {

	@Test(priority = 0)
	public void openURL() throws InterruptedException {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void scenario_3() throws InterruptedException {
		// Using ID Locator
		WebElement Gender = driver.findElement(By.id("male"));
		WebElement Day_Tue = driver.findElement(By.id("tuesday"));
		WebElement Day_Fri = driver.findElement(By.id("friday"));

		Gender.click();
		Thread.sleep(2000);
		Day_Tue.click();
		Thread.sleep(2000);
		Day_Fri.click();
		Thread.sleep(2000);
	}

}
