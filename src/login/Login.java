package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Login {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium setup\\Exe files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1/epidia/Home.php"); 
        driver.manage().window().maximize();
        
        WebElement LoginButton = driver.findElement(By.linkText("Login"));   
        LoginButton.click();
        
        WebElement Email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.name("submit"));
        
        Email.sendKeys("sourav0200@gmail.com");
        password.sendKeys("12345");
        login.click();
        
        String at = "http://127.0.0.1/epidia/UserPage.php";
        String et = driver.getCurrentUrl();  
        driver.close();   
        
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
