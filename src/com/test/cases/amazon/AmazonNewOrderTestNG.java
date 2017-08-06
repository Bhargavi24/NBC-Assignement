package com.test.cases.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AmazonNewOrderTestNG {
	
	WebDriver driver=new FirefoxDriver();
	@Test
  public void amamzonNewOrder() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "\\Desktop\\Automation_Workspace\\geckodriver.exe");
		driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin");
		WebElement signin = driver.findElement(By.xpath(".//*[@id='ap_email']"));
		signin.clear();
		signin.sendKeys("example@mail.com");
		WebElement password=driver.findElement(By.xpath(".//*[@id='ap_password']"));
		password.clear();
		password.sendKeys("passowrd");
		WebElement signin1 = driver.findElement(By.xpath(".//*[@id='signInSubmit']"));
		signin1.click();
		Thread.sleep(2000);
		WebElement account=driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[2]"));
		account.click();
		Thread.sleep(1000);
		WebElement order=driver.findElement(By.xpath(".//*[@id='a-page']/div[3]/div/div[1]/div[1]/a/div/div/div/div[2]/h3"));
		order.click();
		Thread.sleep(2000);
		WebElement account1=driver.findElement(By.xpath(".//*[@id='yourOrdersContent']/div[1]/ul/li[1]/span/a/span"));
		account1.click();
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.clear();
		search.sendKeys("pillow for mattress");
		Thread.sleep(2000);
		search=driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
		search.click();
		Thread.sleep(2000);
		WebElement resultLink=driver.findElement(By.xpath(".//*[@id='result_4']/div/div/div/div[2]/div[1]/div[1]/a/h2"));
		resultLink.click();
		Thread.sleep(2000);
		search=driver.findElement(By.xpath(".//*[@id='add-to-cart-button']"));
		search.click();
		Thread.sleep(4000);
		search=driver.findElement(By.xpath(".//*[@id='hlb-ptc-btn-native']"));
		search.click();
		search=driver.findElement(By.xpath(".//*[@id='submitOrderButtonId']/span/input"));
		search.click();
		Thread.sleep(3000);
		System.out.println("Test cases executed successfully");
		driver.close();
  }
}