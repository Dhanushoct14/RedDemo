package com.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactUsPage{
	
//	public static void main(String args[]) {

//		System.setProperty("webdriver.chrome.driver",
//				System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");

		@Test
		public void verifyContactUsPageNavigation() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		String expectedText = "Get in touch";

		driver.get("https://www.redthreadinnovations.com/");

		driver.findElement(By.xpath("//div[@class='menu-items']//a[@class='menu-item'][normalize-space()='Contact Us']"))
				.click();

		String actualText = driver.findElement(By.xpath("//*[@id=\"contactus\"]/div/div/div/h1")).getText();

		Assert.assertEquals(actualText, expectedText);

		System.out.println("Contact us navigation passed");

		driver.quit();
	}
}
