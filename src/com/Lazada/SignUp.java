package com.Lazada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String pathProject = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", pathProject + "\\src\\resource\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		String linkURL = "http://www.lazada.sg/";
		driver.get(linkURL);

		WebDriverWait wait = new WebDriverWait(driver,120);

		WebElement eSignUp=driver.findElement(By.linkText("Signup"));
		System.out.println("debug");
		wait.until(ExpectedConditions.elementToBeClickable(eSignUp));

		eSignUp.click();

	}

}
