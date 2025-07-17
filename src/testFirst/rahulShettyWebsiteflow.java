package testFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulShettyWebsiteflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here Rahul Shetty Website Signin flow via automation is done. 
		//URL - https://rahulshettyacademy.com/locatorspractice/https://rahulshettyacademy.com/locatorspractice/
		//password - rahulshettyacademy
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.findElement(By.xpath("//form/h1")).getText());
		driver.findElement(By.id("inputUsername")).sendKeys("Gourav");
		driver.findElement(By.name("inputPassword")).sendKeys("Kaji");
		driver.findElement(By.cssSelector(".submit.signInBtn")).click();
		
		try { Thread.sleep(2000); } 
		catch (InterruptedException e) 
		{ // TODOAuto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.xpath("//form/p")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Gourav Kaji");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("kaji@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("5655676564");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.xpath("//form/p")).getText());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("button[class*='go-to']")).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("inputUsername")).sendKeys("Gourav Kaji");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector(".submit.signInBtn")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(driver.findElement(By.xpath("//div/h2")).getText()+driver.findElement(By.xpath("//div/h1")).getText()+". "+driver.findElement(By.xpath("//div/p")).getText());
		driver.close();
	}

}
