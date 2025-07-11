package testFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		//System.out.println(driver.getTitle());
		
		  try 
		  { Thread.sleep(5000); } 
		  catch (InterruptedException e) 
		  { // TODO Auto-generated catch block 
			  e.printStackTrace();
		  }
		 
		driver.close();
	}

}
