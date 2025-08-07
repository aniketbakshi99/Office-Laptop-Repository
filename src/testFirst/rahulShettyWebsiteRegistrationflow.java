package testFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rahulShettyWebsiteRegistrationflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Here Rahul Shetty Website Signin flow via automation is done. 
		//URL - https://rahulshettyacademy.com/locatorspractice/https://rahulshettyacademy.com/locatorspractice/
		//password - rahulshettyacademy
		
		
		WebDriver driver = new ChromeDriver();
		String password=getPassword(driver);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");//Website Launched in browser
		System.out.println(driver.findElement(By.xpath("//form/h1")).getText());//Finding Signin text
		driver.findElement(By.id("inputUsername")).sendKeys("Gourav");//Filling the form with wrong inputs first
		driver.findElement(By.name("inputPassword")).sendKeys("Kaji");
		driver.findElement(By.cssSelector(".submit.signInBtn")).click();
		
		try { Thread.sleep(2000); } 
		catch (InterruptedException e) 
		{ // TODOAuto-generated catch block
			e.printStackTrace();
		}//Waiting for 2 seconds
		System.out.println(driver.findElement(By.xpath("//form/p")).getText());//getting incorrect login info error text
		driver.findElement(By.linkText("Forgot your password?")).click();//Click forgot password
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Waiting for 1 second
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Gourav Kaji");//filling the forgot password form
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("kaji@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("5655676564");
		driver.findElement(By.className("reset-pwd-btn")).click();//Reset password
		System.out.println(driver.findElement(By.xpath("//form/p")).getText());//Getting new generated password text
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Waiting for 4 seconds to see new password
		driver.findElement(By.cssSelector("button[class*='go-to']")).click();//moving to login page again
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Waiting for login form transition
		driver.findElement(By.id("inputUsername")).sendKeys("Gourav Kaji");//Filling login with correct credential
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Wait to see enter correct credential or not
		driver.findElement(By.cssSelector(".submit.signInBtn")).click();//Hit submit
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//After successfull signin wait to see it
		System.out.println(driver.findElement(By.xpath("//div/h2")).getText()+driver.findElement(By.xpath("//div/h1")).getText()+". "+driver.findElement(By.xpath("//div/p")).getText());//Getting successfull text
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();//Clicking the logout
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//Wait to see the login page again
		driver.close();//Closing the browser
	}
	//creating another public method to get exact password from text
	public static String getPassword(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.className("reset-pwd-btn")).click();
		String getPasswordtext = (driver.findElement(By.xpath("//form/p")).getText());
		
		int startIndex = getPasswordtext.indexOf("'") + 1; // Start after the first quote
        int endIndex = getPasswordtext.indexOf("'", startIndex); // End at the next quote
        String password = getPasswordtext.substring(startIndex, endIndex);
        return password;
	}

}
