package com.Testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProcessPage{

//	public static void main(String args[]) {

//		System.setProperty("webdriver.chrome.driver",
//				System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");

	@Test
	public void verifyProcessPageNavigation() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		String expectedText = "Our Process";

		driver.get("https://www.redthreadinnovations.com/");
		
		driver.findElement(By.xpath("//div[@class='menu-items']//a[@class='menu-item'][normalize-space()='Process']"))
				.click();

		String actualText = driver
				.findElement(By.xpath("//*[@id=\"process\"]/div/div"))
				.getText();

		Assert.assertEquals(actualText, expectedText);
		
		System.out.println("Process page navigation passed");

		driver.quit();
	}

}
