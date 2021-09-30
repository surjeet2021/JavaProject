package sampletProject.sampleTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {

	public static  WebDriver driver;
	@Test
	
	public void searchhotel() throws Exception {
		
		
		String url="https://www.cleartrip.com/hotels";
		WebDriverManager.chromedriver().setup();		
		driver = new ChromeDriver();
		driver.get(url);

		WebDriverWait wait = new WebDriverWait(driver, 15);
//		driver.findElement(By.linkText("Hotels")).click();
		
	
		
		driver.findElement(By.id("Tags")).click();
		driver.findElement(By.id("Tags")).clear();
		driver.findElement(By.id("Tags")).click();
	    driver.findElement(By.id("Tags")).sendKeys("M");	 
	    
	    driver.findElement(By.id("Tags")).sendKeys("u");
	    driver.findElement(By.id("Tags")).sendKeys("m");
	    driver.findElement(By.id("Tags")).sendKeys("b");
	    driver.findElement(By.id("Tags")).sendKeys("a");
	    driver.findElement(By.id("Tags")).sendKeys("i");
	    
	    //    driver.findElement(By.name("Tags")).sendKeys(Keys.TAB);
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		List<WebElement> originOptions = driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));

	    for(WebElement toOption: originOptions) {     
          System.out.println(toOption.getText());
          
          if(toOption.getText().trim().equalsIgnoreCase("Mumbai Central Local Station")) {
           toOption.click();
            break;
       }
          
        
        }

		
		

    }

}
