package com.capgemini.cucu;

import java.awt.Desktop.Action;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Howto {

	// private static WebElement element = null;
	@FindBy(how = How.ID, using = "txtSource")
	WebElement src;
	@FindBy(how = How.ID, using = "txtDestination")
	WebElement des;
	@FindBy(how = How.ID, using = "txtOnwardCalendar")
	WebElement dateof;
	@FindBy(how = How.XPATH, using = "//*[@id=\"rb-calmiddle\"]/ul[2]/li[26]/span")
	WebElement datesel;
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[4]/button")
	WebElement search;

	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[2]/div/ul/li[1]/div/div[4]/div")
	WebElement cli;

	@FindBy(how = How.XPATH, using = "//*[@id=\"10021326\"]/div/div[2]/div[1]")
	WebElement seats;

	// @FindBy(how=How.XPATH,using="//*[@id=\\\"rt_10021326\\\"]/div/div/div/div[2]/div[2]/div[2]/canvas")
	// WebElement selectseat;

	@FindBy(how = How.XPATH, using = "//*[@id=\"10021326\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[2]/span[2]")
	WebElement bp1;
	/*@FindBy(how = How.XPATH, using = "//*[@id=\"10021326\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[1]/div[1]/div[2]/div[1]")
	WebElement bp;*/
	@FindBy(how = How.XPATH, using = "//*[@id=\"10021326\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[3]/span[2]")
	WebElement dp;
	@FindBy(how = How.XPATH, using = "//*[@id=\"10021326\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button")
	WebElement pro;
	@FindBy(how = How.XPATH, using = "//*[@id=\"seatno-04\"]")
	WebElement pname;
	@FindBy(how = How.XPATH, using = "//*[@id=\"23_0\"]")
	WebElement pgen;
	@FindBy(how = How.XPATH, using = "//*[@id=\"seatno-01\"]")
	WebElement page;
	@FindBy(how = How.XPATH, using = "//*[@id=\"seatno-06\"]")
	WebElement pmob;
	@FindBy(how = How.XPATH, using = "//*[@id=\"seatno-05\"]")
	WebElement pemail;
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[4]/div/div/div[1]/div[5]/div/div[2]/div/label[2]/span")
	WebElement check;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")
	WebElement ppay;
	
	
	public static void tooltip(WebDriver driver) throws InterruptedException {
		Thread.sleep(4000);
		Actions ToolTip1 = new Actions(driver);
		org.openqa.selenium.interactions.Action act = ToolTip1.moveToElement(driver.findElement(By.xpath("//*[@id=\"rt_10021326\"]/div/div/div/div[2]/div[2]/div[2]/canvas")), 60, 30).click().build();
		act.perform();
	}

	/*
	 * @FindBy(how=How.ID,using="state") WebElement state; public WebElement
	 * state(WebDriver driver){
	 * 
	 * element = driver.findElement(By.id("select")); Select select=new
	 * Select(element); select.selectByVisibleText("Telangana"); return element; }
	 * 
	 * public static WebElement button(WebDriver driver){
	 * 
	 * element = driver.findElement(By.id("submit"));
	 * 
	 * return element; }
	 * 
	 * @FindBy(how=How.ID,using="pname") WebElement projectname;
	 * 
	 * @FindBy(how=How.ID,using="cname") WebElement Clientname;
	 * 
	 * @FindBy(how=How.ID,using="tsize") WebElement Teamsize;
	 * 
	 * @FindBy(how=How.ID,using="sub") WebElement sub; public WebElement
	 * submit(WebDriver driver) { element=driver.findElement(By.id("sub")); return
	 * element;
	 * 
	 * }
	 */
}
