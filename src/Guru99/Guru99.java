package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Guru99 {
	public static void main(String []args) throws InterruptedException {
		
		WebDriver driver;
		//set the browser
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//navigate to the specific site
		  driver.get("http://demo.guru99.com/insurance/v1/index.php\r\n");
		  
		  Thread.sleep(3000);
		  
		  //maximize the window
		  driver.manage().window().maximize();
		  
		 // Thread.sleep(5000);
		  
		  //Navigate to register page
		  WebElement Register = driver.findElement(By.xpath("//div[3]/a"));
		  Register.click();
		  
		  Thread.sleep(3000);
		  
		  //fill the registration form
		  Select title = new Select(driver.findElement(By.xpath("//select[@id='user_title']")));
		  title.selectByVisibleText("Miss");
		  
		  WebElement firstName = driver.findElement(By.xpath("//input[@id='user_firstname']"));
		  firstName.sendKeys("Nishadi");
		  
		  WebElement surName = driver.findElement(By.xpath("//input[@id='user_surname']"));
		  surName.sendKeys("Jayasinghe");
		  
		  WebElement Phone = driver.findElement(By.xpath("//input[@id='user_phone']"));
		  Phone.sendKeys("0714726895");
		  
		  Select birthYear = new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_1i']")));
		  birthYear.selectByVisibleText("1994");
		  
		  Select birthMonth = new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_2i']")));
		  birthMonth.selectByVisibleText("July");
		  
		  Select birthDay = new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_3i']")));
		  birthDay.selectByIndex(06);
		  
		  WebElement radioButton = driver.findElement(By.xpath("//input[@id='licencetype_t']"));
		  radioButton.click();
		  
		  Select Licence_period = new Select(driver.findElement(By.xpath("//select[@id='user_licenceperiod']")));
		  Licence_period.selectByIndex(2);
		  
		  Select Occupation = new Select(driver.findElement(By.xpath("//select[@id='user_occupation_id']")));
		  Occupation.selectByVisibleText("Student");
		  
		  WebElement Street = driver.findElement(By.xpath("//input[@id='user_address_attributes_street']"));
		  Street.sendKeys("Ulahitiyawa");
		  
		  WebElement city = driver.findElement(By.xpath("//input[@id='user_address_attributes_city']"));
		  city.sendKeys("Middeniya");
		  
		  WebElement country = driver.findElement(By.xpath("//input[@id='user_address_attributes_county']"));
		  country.sendKeys("Sri lanka");
		  
		  WebElement postCode = driver.findElement(By.xpath("//input[@id='user_address_attributes_postcode']"));
		  postCode.sendKeys("1245");
		  
		  WebElement Email = driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_email']"));
		  Email.sendKeys("jayasingheane@gmail.com");
		  
		  WebElement Password = driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password']"));
		  Password.sendKeys("123456789");
		  
		  WebElement PasswordC = driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password_confirmation']"));
		  PasswordC.sendKeys("123456789");	
		  
		  Thread.sleep(3000);
		  
		  //submit
		  WebElement Create = driver.findElement(By.xpath("//input[@name='submit']"));
		  Create.click();
		  
		  Thread.sleep(3000);
		  
		  //login
		  WebElement emailL = driver.findElement(By.xpath("//input[@id='email']"));
		  emailL.sendKeys("jayasingheane@gmail.com");
		  
		  WebElement passwordL = driver.findElement(By.xpath("//input[@id='password']"));
		  passwordL.sendKeys("123456789");
		  
		  WebElement logIn = driver.findElement(By.xpath("//input[@name='submit']"));
		  logIn.click();
	    
	    Thread.sleep(1000);
	    
	    WebElement selenium = driver.findElement(By.linkText("Selenium"));
	    Actions act = new Actions(driver);
	    act.moveToElement(selenium).perform();
	    selenium.click();
	    WebElement Yahoo = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[8]/a"));
	    act.moveToElement(Yahoo).perform();
	    Yahoo.click();
	    
	        
	    Thread.sleep(3000);
	    
	     //close chrome
	    driver.quit();
	        
		  
		  
	}
	
}
