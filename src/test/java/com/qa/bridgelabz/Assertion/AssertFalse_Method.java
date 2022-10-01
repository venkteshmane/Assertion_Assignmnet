package com.qa.bridgelabz.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse_Method {
	@Test(priority = 1)
	public void AssertFalseMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.bridgelabz.com/");
		driver.navigate().to("https://www.bridgelabz.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Assert.assertFalse(driver.findElement(By.cssSelector(".notify-link")).isSelected());  
        System.out.println(driver.findElement(By.cssSelector(".notify-link")).isSelected()); 

	}
}
