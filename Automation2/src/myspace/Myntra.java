package myspace;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

// ctrl + shift + c
public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=CjwKCAjwlbu2BhA3EiwA3yXyuzN32BFdhKJ_X4hD5K8JDbv5d3Dey1oL9izWpLjCsvuaVopEAzKy2hoCEFQQAvD_BwE");
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("shoes");
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		System.out.println("which step check");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//label[@class='common-customRadio gender-label']/descendant::input[@value='men,men women']")).click();
		driver.findElement(By.xpath("//a[text()='Men'and(@class='desktop-main')]")).click();
	
	}

}
 