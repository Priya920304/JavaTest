package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UnDosTresTest {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://sanbox.undostres.com.mx");
		}
		
		@Test
		public void TestCase1() {
		driver.findElement(By.name("mobile")).sendKeys("8465433546");
	      
	    driver.findElement(By.xpath("//input[@name='operator'][1]")).click();
	         
	    driver.findElement(By.xpath("//b[text()='Telcel']")).click();
	      
	    driver.findElement(By.xpath("//b[text()='$10'][1]")).click();
	    
	    driver.findElement(By.xpath("//button[text()='Siguiente'][1]")).click();
	    
	   
		}
		@Test
		public void TestCase2() throws InterruptedException {
			//to click on tarjeta  btn
		    driver.findElement(By.xpath("//p[text()='Tarjeta']")).click();
	
			
			Thread.sleep(3000);
			//to click on usar nueva tarjeta checkbox
			driver.findElement(By.xpath("//span[text()='Usar nueva tarjeta']")).click();
			
			
			Thread.sleep(3000);
			//to send the card number in to the number textbox
			driver.findElement(By.xpath("//input[@id='cardnumberunique']")).sendKeys("4111111111111111");
			
			
			Thread.sleep(3000);
			//to send the month number in to the month textbox
			driver.findElement(By.xpath("//input[@placeholder='Mes']")).sendKeys("11");
			
			
			Thread.sleep(3000);
			//to send the date value in to the date textbox
			driver.findElement(By.xpath("//input[@placeholder='Año']")).sendKeys("25");
		
			
			Thread.sleep(3000);
			//to send the cvv number to the cvv box
			driver.findElement(By.xpath("//input[@placeholder='CVV']")).sendKeys("111");
	
			
			Thread.sleep(3000);
			//to send the email to the corrreo electronic field
			driver.findElement(By.xpath("//input[@placeholder='Correo electrónico'][1]")).sendKeys("test@test.com");
			
			
			Thread.sleep(5000);
			//click on pagar con tarjeta btn
			driver.findElement(By.xpath("(//span[text()='Pagar con Tarjeta'])[2]")).click();
			
		}
		@Test
		public void test3() throws InterruptedException {
		//to  send the email into the popup window email box
		driver.findElement(By.xpath("//input[@name='email'][1]")).sendKeys("automationexcersise@test.com");
		//to send the password into the popup window password box
		driver.findElement(By.xpath("//input[@name='password'][1]")).sendKeys("123456");
			
		}
		//manually handle the captcha
		@Ignore
		@Test
		public void testcase4() throws InterruptedException {
			Thread.sleep(3000);
			new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border'])[1]"))).click();
		}
		@Test
		public void testcase5() throws InterruptedException {
			Thread.sleep(3000);
			//to click on Accesso Btn
			driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		}
		
		
	    	   
	       }

