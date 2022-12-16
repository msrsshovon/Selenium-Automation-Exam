package Exam.SeleniumAutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InputField extends BaseBrowser {

	@Test(priority = 0)
	public void openURL() throws InterruptedException {
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void scenario_1() throws InterruptedException {
		//Using ID Locator
		WebElement Name = driver.findElement(By.id("name"));
		WebElement MobileNumber = driver.findElement(By.id("phone"));
		WebElement EmailAddress = driver.findElement(By.id("email"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement Address = driver.findElement(By.id("address"));
		//Using Name Locator
		WebElement Submit = driver.findElement(By.name("submit"));

		Name.sendKeys("Exam");
		Thread.sleep(2000);
		MobileNumber.sendKeys("01234567890");
		Thread.sleep(2000);
		EmailAddress.sendKeys("Exam@gmail.com");
		Thread.sleep(2000);
		Password.sendKeys("123456");
		Thread.sleep(2000);
		Address.sendKeys("Dhaka, Bangladesh");
		Thread.sleep(2000);
		Submit.click();
		Thread.sleep(2000);

	}
}
