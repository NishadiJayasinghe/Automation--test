package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class clz1 {

	public static void main(String[] args) {
		   WebDriver driver;
		
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver_win32\\chromedriver.exe");

		   driver = new ChromeDriver();
		   driver.get("https://www.facebook.com");
			  //Thread.sleep(5000);  // Let the user actually see something!
			  WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
			  searchBox.sendKeys("google");
			  
		  /*driver.get("https://www.gmail.com");
		  //Thread.sleep(5000);  // Let the user actually see something!
		 WebElement signin = driver.findElement(By.xpath("/html/body/nav/div/a[2]"));
		 
		  //driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		  WebElement email = driver.findElement(By.xpath("//input[@id=\"identifierId\"]"));
		  signin.click();
		  email.sendKeys("jayasingheane@gmail.com");*/
		  
		 //driver.quit();
		  

	}

}
