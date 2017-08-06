package com.test.cases.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SkypeTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Desktop\\Automation_Workspace\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http:\\www.skype.com");
		WebElement signin = driver.findElement(By.xpath(".//*[@id='scom']/ul/li[13]/a[1]/span[1]"));
		signin.click();
		WebElement myaccount = driver.findElement(By.xpath(".//*[@id='scom']/ul/li[13]/ul/li[1]/a"));
		myaccount.click();
		// Wait for 10 Sec
		Thread.sleep(2000);
		WebElement emailid = driver.findElement(By.name("username"));
		emailid.sendKeys("xyucvycuuc");
		WebElement signin1 = driver.findElement(By.xpath(".//*[@id='signIn']"));
		signin1.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		// wait for 10 sec
		// Thread.sleep(1000);
		//WebElement password=driver.findElement(By.name("passed"));
		WebElement password=driver.findElement(By.xpath(".//*[@id='i0118']"));
		//WebElement password = driver
		
		password.sendKeys("xyuxuxux");
		WebElement signin2 = driver.findElement(By.xpath(".//*[@id='idSIButton9']"));
		signin2.click();
		Thread.sleep(1000);
		WebElement userlifecycle =driver.findElement(By.xpath(".//*[@id='betaReminder']/a"));
		userlifecycle.click();
		

	}

}