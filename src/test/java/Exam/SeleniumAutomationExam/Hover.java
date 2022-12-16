package Exam.SeleniumAutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover extends BaseBrowser {

	@Test(priority = 0)
	public void openURL() throws InterruptedException {
		driver.get("https://www.daraz.com.bd/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void scenario_5() throws InterruptedException {

		Actions action = new Actions(driver);

		WebElement Automotive_MB = driver.findElement(By.xpath("//span[normalize-space()='Automotive & Motorbike']"));
		WebElement Motorcycle_RG = driver.findElement(By.xpath("//span[normalize-space()='Motorcycle Riding Gear']"));
		WebElement Helmet = driver.findElement(By.xpath("//span[normalize-space()='Helmet']"));

		action.moveToElement(Automotive_MB).perform();
		Thread.sleep(4000);
		action.moveToElement(Motorcycle_RG).perform();
		Thread.sleep(4000);
		Helmet.click();
		Thread.sleep(2000);

	}

}
