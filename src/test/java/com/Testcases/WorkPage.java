package com.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkPage{

//	public static void main(String args[]) {

//		System.setProperty("webdriver.chrome.driver",
//				System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");

		@Test
		public void verifyWorkPageNavigation() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		String expectedText = "Our recent products";

		driver.get("https://www.redthreadinnovations.com/");

		driver.findElement(By.xpath("//div[@class='menu-items']//a[@class='menu-item'][normalize-space()='Work']"))
				.click();

		String actualText = driver.findElement(By.xpath("//*[@id=\"work\"]/div/div")).getText();

		Assert.assertEquals(actualText, expectedText);

		System.out.println("Work page navigation passed");

		driver.quit();
		}
}
