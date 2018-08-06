package com.capgemini.cucu;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Redbus {
	public static void main(String[] args) throws InterruptedException{
		
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/bus-tickets/");
	Howto lean=PageFactory.initElements(driver, Howto.class);
	lean.src.sendKeys("Pune Airport");
	
	lean.des.sendKeys("Mumbai Airport");
	
	
	
	lean.dateof.click();
	lean.datesel.click();
	
	lean.search.click();
	Thread.sleep(3000);
	lean.search.sendKeys(Keys.TAB);
	lean.search.sendKeys(Keys.TAB);
	lean.search.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	lean.cli.click();
	Thread.sleep(4000);
	lean.seats.click();
	/*lean.tooltip(driver);*/
	Howto.tooltip(driver);
	Thread.sleep(3000);
	/*lean.bp.click();*/
	lean.bp1.click();
	lean.dp.click();
	lean.pro.click();
	Thread.sleep(4000);
	lean.pname.sendKeys("sravani");
	lean.pgen.click();
	lean.page.sendKeys("21");
	lean.pmob.sendKeys("9948052528");
	lean.pemail.sendKeys("kistavamsi@gmail.com");
	lean.check.click();
	Thread.sleep(3000);
	lean.ppay.click();
	
	
	
	
}
}
