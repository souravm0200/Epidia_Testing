package signOut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class SignOut {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium setup\\Exe files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://127.0.0.1/epidia/UserPage.php"); 
        driver.manage().window().maximize();
        
        WebElement SignOutButton = driver.findElement(By.linkText("SignOut"));   
        SignOutButton.click();

        
        String at = "http://127.0.0.1/epidia/Home.php";
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
