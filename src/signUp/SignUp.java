package signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SignUp {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium setup\\Exe files\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1/epidia/Home.php"); 
        driver.manage().window().maximize();
        
        WebElement LoginButton = driver.findElement(By.linkText("SignUp"));   
        LoginButton.click();
        
        WebElement Username = driver.findElement(By.name("username"));
        WebElement Email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement ConfirmPassword = driver.findElement(By.name("cpassword"));
        WebElement SignUp = driver.findElement(By.className("btn"));
        
        
        
        Username.sendKeys("Mahir");
        Email.sendKeys("mahir@gmail.com");
        password.sendKeys("12345");
        ConfirmPassword.sendKeys("12345");
        SignUp.click();
        
        String at = "http://127.0.0.1/epidia/SignUp.php";
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
