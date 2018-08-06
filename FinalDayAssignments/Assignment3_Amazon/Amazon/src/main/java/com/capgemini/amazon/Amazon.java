package com.capgemini.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon {

	WebDriver driver = null;

	@Given("^amazon link$")
	public void goToAmazon() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

	@When("^product is searched$")
	public void goToDetails() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
	
		
		
	}
	@And("^select five products$")
	public void selectpro() throws InterruptedException{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"result_1\"]/div/div[2]/div/a/img")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"a-autoid-5-announce\"]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("9652119965");
		driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Saivamsi83....");
		driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 6");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"a-autoid-5-announce\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
		Thread.sleep(6000);
		/*driver.findElement(By.xpath("//*[@id=\"result_1\"]/div/div[2]/div/div/a/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		Thread.sleep(3000);*/
		//driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
	}
	@Then("^proceed to the cart$")
	public void search() 
	{
			
		driver.findElement(By.xpath("//*[@id=\"enterAddressFullName\"]")).sendKeys("sravani");
		driver.findElement(By.xpath("//*[@id=\"enterAddressPhoneNumber\"]")).sendKeys("9948052528");
		driver.findElement(By.xpath("//*[@id=\"enterAddressPostalCode\"]")).sendKeys("411057");
		driver.findElement(By.xpath("//*[@id=\"enterAddressAddressLine1\"]")).sendKeys("Employee Relaxation Centre");
		driver.findElement(By.xpath("//*[@id=\"enterAddressAddressLine2\"]")).sendKeys("Capgemini Hinjewadi phase 3");
		
		driver.findElement(By.xpath("//*[@id=\"enterAddressLandmark\"]")).sendKeys("RajivGandhi infotech park");
		driver.findElement(By.xpath("//*[@id=\"enterAddressCity\"]")).sendKeys("Pune");
		driver.findElement(By.xpath("//*[@id=\"enterAddressStateOrRegion\"]")).sendKeys("Maharastra");
		driver.findElement(By.xpath("//*[@id=\"newShippingAddressFormFromIdentity\"]/div[1]/div[1]/form/div[5]/span/span/input")).click();
		
		
		
	}
}
