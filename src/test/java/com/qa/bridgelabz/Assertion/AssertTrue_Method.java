package com.qa.bridgelabz.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue_Method {
	@Test(priority = 1)
	public void AssertTrueMethod() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.bridgelabz.com/");
		driver.navigate().to("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'][normalize-space()='Senior Citizen']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'][normalize-space()='Senior Citizen']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-n6v787 r-1ozqkpa'][normalize-space()='Senior Citizen']")).isSelected());

	}
}