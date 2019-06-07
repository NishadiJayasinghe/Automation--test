package ReadExcelData;

import java.io.File;
import java.io.FileInputStream; 
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadExcel {
	
	public static void main(String args[]) throws Exception {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/insurance/v1/index.php\r\n");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
		File src = new File("E:\\Nishadi\\TestData.xlsx ");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 =  wb.getSheetAt(0);
		
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.getAttribute(data0);
		
		
		
		/*int rowcount =  sheet1.getLastRowNum();
		System.out.println("Total row is " + rowcount);
		
		for(int i=0; i<rowcount; i++) {
			
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test data fromexcel sheet "+i+ data0);
		}
		*/
		
		
		/*String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from excel is  " + data0);*/
		
		driver.quit();
		
	}

}
  