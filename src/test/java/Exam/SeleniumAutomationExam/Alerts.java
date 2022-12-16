package Exam.SeleniumAutomationExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts extends BaseBrowser {

	@Test(priority = 0)
	public void openURL() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void scenario_4() throws InterruptedException {
		WebElement JSalert = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		WebElement JSconfirm = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
		WebElement JSprompt = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
		WebElement Result = driver.findElement(By.xpath("//p[@id='result']"));

		// For JS Alert
		JSalert.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		String Text_Alert = Result.getText();
		Assert.assertEquals(Text_Alert, "You successfully clicked an alert");

		// For JS Confirm
		JSconfirm.click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(4000);
		String Text_Confirm = Result.getText();
		Assert.assertEquals(Text_Confirm, "You clicked: Cancel");

		// For JS Prompt
		JSprompt.click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("Automation Exam");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		String Text_Prompt = Result.getText();
		Assert.assertEquals(Text_Prompt, "You entered: Automation Exam");

	}

}
