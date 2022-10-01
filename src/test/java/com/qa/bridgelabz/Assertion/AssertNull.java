package com.qa.bridgelabz.Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
	@Test(priority = 1)
	public void AssertNull_Method() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Assert.assertNull(null);
		System.out.println("Welcome to Assertion Assignment");
	}

}
