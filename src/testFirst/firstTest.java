package testFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://toolsqa.com/");
		//System.out.println(driver.getTitle());
		
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		 
		//driver.close();
		//driver.findElement(By.id("accept-cookie-policy")).click();
		driver.findElement(By.cssSelector(".btn.btn-primary-shadow.btn-block")).click();
		driver.findElement(By.id("first-name")).sendKeys("Gourav");
		driver.findElement(By.id("last-name")).sendKeys("Kaji");
		driver.findElement(By.id("email")).sendKeys("kaji@yopmail.com");
		driver.findElement(By.name("mobile")).sendKeys("313222424453");
		driver.findElement(By.id("country")).sendKeys("India");
	}

}
