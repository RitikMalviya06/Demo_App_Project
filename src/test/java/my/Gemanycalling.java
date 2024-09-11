package my;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class Gemanycalling {
	 WebDriver driver;

	    @BeforeClass
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.get("https://app.germanyiscalling.com/common/login/?next=https%3A%2F%2Fapp.germanyiscalling.com%2Fcv%2Fhome%2F");
	    }

	    @Test(priority = 1)
	    public void validLoginTest() {
	        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));  
	        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']")); 
	        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log In']"));  
	        // Input valid credentials
	        usernameField.clear();
	        usernameField.sendKeys("test123@gmail.com");
	        passwordField.clear();
	        passwordField.sendKeys("TEst1234@");
	        loginButton.click();

	        // Verify successful login by checking URL or element that appears after login
	        String currentUrl = driver.getCurrentUrl();
	        Assert.assertTrue(currentUrl.contains("dashboard"), "Login failed for valid credentials");
	    }

	    @Test(priority = 2)
	    public void invalidLoginTest() {
	        // Locate username and password fields and login button
	        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));  
	        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));  
	        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log In']"));  

	        // Input invalid credentials
	        usernameField.clear();
	        usernameField.sendKeys("test123@gmail.com");
	        passwordField.clear();
	        passwordField.sendKeys("test1234@");
	        loginButton.click();

	        // Check for failure message (adjust this to match the failure indication on the page)
	        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));  // Adjust the ID to match the actual element
	        Assert.assertTrue(errorMessage.isDisplayed(), "Error message was not displayed for invalid login");
	    }

	    @AfterClass
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	
}
