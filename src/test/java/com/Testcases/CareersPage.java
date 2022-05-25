package com.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CareersPage {

//	public static void main(String args[]) {

//		System.setProperty("webdriver.chrome.driver",
//				System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver");

	@Test
	public void verifyCareerPageNavigation() {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		String expectedText = "Partner With Us";

		driver.get("https://www.redthreadinnovations.com/");

		driver.findElement(By.xpath("//div[@class='menu-items']//a[@class='menu-item'][normalize-space()='Careers']"))
				.click();

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section[1]/div/div/h1")));

		String actualText = driver.findElement(By.cssSelector("body > section.block.banner > div > div > a")).getText();

		Assert.assertEquals(actualText, expectedText);

		System.out.println("Career page navigation passed");

		driver.quit();
	}
//	}
}
