package merchandise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Merchandise {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium setup\\Exe files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
     
        driver.get("http://127.0.0.1/epidia/UserPage.php"); 
        driver.manage().window().maximize();
        
        WebElement MerchandiseButton = driver.findElement(By.linkText("Merchandise"));   
        MerchandiseButton.click();
        WebElement DotaButton = driver.findElement(By.name("DTS"));
        DotaButton.click();
        WebElement TeamSecretButton = driver.findElement(By.name("teamsecret"));
        TeamSecretButton.click();
        

        
        String at = "https://teamsecret.gg/collections/all";
        String et = driver.getCurrentUrl();  
       // driver.close();   
        
        if(at.equalsIgnoreCase(et))
        {
        	System.out.println("Test Successful");
	
        }
        else
        {
        	System.out.println("Test Failed");
        }
        
        
        
	}



}
